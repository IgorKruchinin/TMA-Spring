package ru.ikkui.TMA.db.records;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public record User(
        @Column("user_id")
        @Id Long userId,
        String name
)
{}
