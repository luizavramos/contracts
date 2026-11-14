package br.com.motorfraude.contracts;

import java.time.Instant;
import java.util.List;

public record CustomerProfile(
        String accountId,
        Segment segment,
        Instant accountOpenedAt,
        Instant lastCredentialChangeAt,
        List<String> knownDeviceHashes,
        Instant updatedAt) {}
