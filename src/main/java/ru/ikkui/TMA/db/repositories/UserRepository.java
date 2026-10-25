package ru.ikkui.TMA.db.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import ru.ikkui.TMA.db.records.User;

import java.util.Optional;

public interface UserRepository {
    @Query("SELECT * FROM users WHERE name = :name")
    Optional<User> findByName(String name);
    @Query("SELECT * FROM users WHERE user_id = :id")
    Optional<User> findById(Long id);
}
