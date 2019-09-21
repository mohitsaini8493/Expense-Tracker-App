package com.example.Expense.tracker.Controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;
import javax.xml.ws.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Expense.tracker.Model.Category;
import com.example.Expense.tracker.Repository.CategoryRepository;


@RestController
@RequestMapping("/api")
public class CategoryController {
	
	private CategoryRepository categoryRepository;

	public CategoryController(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}
	
	@GetMapping("/category")
	public Collection<Category> categories(){
		return categoryRepository.findAll();
	}
	
	@GetMapping("/category/{id}")
	public ResponseEntity<?> getCategory(@PathVariable Long id){
		Optional<Category> category = categoryRepository.findById(id);
		if(category.isPresent())
			return ResponseEntity.ok().body(category.get());
		else
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		   }
	@PostMapping("/category")
	public ResponseEntity<?> createCategory(@Valid @RequestBody Category category) throws URISyntaxException{
		Category result = categoryRepository.save(category);
		return ResponseEntity.created(new URI("/api/category/"+result.getId())).body(result);
	}
	
	@PutMapping("/category/{id}")
	public ResponseEntity<?> updateCategory(@Valid @RequestBody Category category){
		Category result = categoryRepository.save(category);
		return ResponseEntity.ok().body(result);
		}
	
	@DeleteMapping("/category/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable Long id){
		
		categoryRepository.deleteById(id);
		return ResponseEntity.ok().build();
		
	}
	
}
