package com.example.Expense.tracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Expense.tracker.Model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long>{

}
