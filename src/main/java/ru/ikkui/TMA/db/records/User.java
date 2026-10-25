package ru.ikkui.TMA.db.records;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public record User(
        @Id Long userId,
        String name
)
{}
