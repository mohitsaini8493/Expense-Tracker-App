package com.example.Expense.tracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Expense.tracker.Model.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
	Category findByName(String name);

}
