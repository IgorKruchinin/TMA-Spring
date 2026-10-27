package ru.ikkui.TMA.db.records;


import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;

public record Expense (
        @Column("expense_id")
        @Id Long expenseId,
        String title,
        BigDecimal amount,
        AggregateReference<Account, Long> accountId
)
{}
