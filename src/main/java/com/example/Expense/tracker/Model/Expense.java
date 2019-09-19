package com.example.Expense.tracker.Model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "expense")
public class Expense {
	
	@Id
	private Long id;
	
	private Instant expensedate;
	
	private String discript;
	
	@ManyToOne
	private Category category;
	 
	@ManyToOne
	private User user;
	
}