package br.com.motorfraude.contracts;

import java.time.Instant;

public record BlocklistEntry(String entityToken, EntityType entityType, String reason, Instant listedAt) {}
