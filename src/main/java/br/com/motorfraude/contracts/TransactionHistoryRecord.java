package br.com.motorfraude.contracts;

import java.time.Instant;

public record TransactionHistoryRecord(
        String transactionId,
        String accountId,
        Money amount,
        String counterpartyToken,
        String deviceIdHash,
        Instant occurredAt) {}
