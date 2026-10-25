package ru.ikkui.TMA.db.records;


import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

public record Expense (
        @Id Long expenseId,
        String title,
        AggregateReference<Account, Long> accountId
)
{}
