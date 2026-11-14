package br.com.motorfraude.contracts;

import static org.assertj.core.api.Assertions.assertThat;

import tools.jackson.databind.JsonNode;

public final class ContractAssertions {

    private ContractAssertions() {}

    public static void assertProduces(String schemaName, Object message) {
        JsonNode node = switch (message) {
            case JsonNode n -> n;
            case String s -> JsonCodec.readTree(s);
            case byte[] b -> JsonCodec.readTree(b);
            default -> JsonCodec.toTree(message);
        };
        ValidationResult result = Schemas.validate(schemaName, node);
        assertThat(result.errors())
                .as("A mensagem produzida viola o contrato %s", schemaName)
                .isEmpty();
    }
}
