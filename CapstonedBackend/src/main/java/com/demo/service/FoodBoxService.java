package com.demo.service;

import java.util.List;

import com.demo.model.FoodBox;



public interface FoodBoxService {
	public FoodBox addFoodBox(FoodBox food);
	public FoodBox updateFoodBox(FoodBox food);
	public void deleteFoodById(int id);						// id is foodid and pk
	public FoodBox getFoodById(int id);
	public List<FoodBox> getAllFoods();
	
	

}
