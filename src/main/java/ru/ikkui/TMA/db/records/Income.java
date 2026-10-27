package ru.ikkui.TMA.db.records;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table("incomes")
public record Income(
        @Column("income_id")
        @Id Long incomeId,
        String title,
        BigDecimal amount,
        @Column("account_id")
        AggregateReference<Account, Long> account
) {}
