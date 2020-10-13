package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.FoodBoxService;
import com.demo.model.FoodBox;

@RestController
public class FoodBoxController {
	@Autowired
	private FoodBoxService service;

	@PostMapping("/food")
	public FoodBox addFood(@RequestBody FoodBox food) {
		return service.addFoodBox(food);
	}

	@PutMapping("/food")
	public FoodBox updateFood(@RequestBody FoodBox food) {
		return service.updateFoodBox(food);
	}

	@DeleteMapping("/food/{id}")
	public void deleteFoodById(@PathVariable int id) {
		service.deleteFoodById(id);
	}

	@GetMapping("/food/{id}")
	public FoodBox getFoodById(@PathVariable int id) {
		return service.getFoodById(id);
	}

	@GetMapping("/foods")
	public List<FoodBox> getAllFoods() {
		return service.getAllFoods();
	}

}

