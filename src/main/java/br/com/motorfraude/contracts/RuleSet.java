package br.com.motorfraude.contracts;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public record RuleSet(long version, Instant publishedAt, Scoring scoring, List<Rule> rules) {

    public record Scoring(int mediumThreshold, int highThreshold) {}

    public record Rule(
            String ruleId,
            int version,
            RuleStatus status,
            String expression,
            Map<String, Object> params,
            Map<String, Map<String, Object>> paramOverrides,
            int weight,
            String reasonTemplate) {}
}
