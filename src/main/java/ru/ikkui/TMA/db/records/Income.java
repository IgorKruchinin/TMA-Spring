package ru.ikkui.TMA.db.records;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Table;

@Table("incomes")
public record Income(
        @Id Long incomeId,
        String title,
        AggregateReference<Account, Long> account
) {}
