package ru.ikkui.TMA.db.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import ru.ikkui.TMA.db.records.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseRepository {
    @Query("SELECT expense_id, title, amount, account_id FROM expenses WHERE income_id = :income_id")
    Optional<Expense> getById(@Param("income_id") Long id);
    @Query("SELECT expense_id, title, amount, account_id FROM expenses WHERE account_id = :account_id")
    List<Expense> getForAccount(@Param("account_id") Long accountId);
    @Query("SELECT expense_id, title, amount, account_id FROM expenses JOIN accounts ON expenses.account_id = accounts.account_id WHERE accounts.user_id = :user_id")
    List<Expense> getAllForUser(@Param("user_id") Long userId);
}
