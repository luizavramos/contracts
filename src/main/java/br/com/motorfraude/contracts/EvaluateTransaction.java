package br.com.motorfraude.contracts;

import java.time.Instant;

public record EvaluateTransaction(
        int schemaVersion,
        String transactionId,
        String accountId,
        String customerId,
        TransactionType type,
        Money amount,
        Counterparty counterparty,
        Channel channel,
        String deviceIdHash,
        Instant occurredAt) {}
