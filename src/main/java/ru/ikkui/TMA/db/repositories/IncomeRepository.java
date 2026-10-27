package ru.ikkui.TMA.db.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import ru.ikkui.TMA.db.records.Income;

import java.util.List;
import java.util.Optional;

public interface IncomeRepository {
    @Query("SELECT income_id, title, amount, account_id FROM incomes WHERE income_id = :income_id")
    Optional<Income> getById(@Param("income_id") Long id);
    @Query("SELECT income_id, title, amount, account_id FROM incomes WHERE account_id = :account_id")
    List<Income> getForAccount(@Param("account_id") Long accountId);
    @Query("SELECT income_id, title, amount, account_id FROM incomes JOIN accounts ON incomes.account_id = accounts.account_id WHERE accounts.user_id = :user_id")
    List<Income> getAllForUser(@Param("user_id") Long userId);
}
