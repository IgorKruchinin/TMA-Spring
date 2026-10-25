package ru.ikkui.TMA.db.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import ru.ikkui.TMA.db.records.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    @Query("SELECT * FROM accounts WHERE user_id = :user_id")
    List<Account> findByUserID(@Param("user_id") Long userId);
    @Query("SELECT * FROM accounts WHERE title = :title")
    Optional<Account> findByTitle(@Param("title") String title);
    @Query("SELECT * FROM accounts WHERE account_id = :id")
    Optional<Account> findById(@Param("id") Long accountId);
}
