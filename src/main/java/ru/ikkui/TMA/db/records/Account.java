package ru.ikkui.TMA.db.records;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("accounts")
public record Account(
        @Id Long accountId,
        String title,
        @Column("user_id")
        AggregateReference<User, Long> userId
) {}
