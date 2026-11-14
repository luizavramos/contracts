package br.com.motorfraude.contracts;

import java.util.List;

public record ValidationResult(List<String> errors) {

    public ValidationResult {
        errors = List.copyOf(errors);
    }

    public boolean valid() {
        return errors.isEmpty();
    }
}
