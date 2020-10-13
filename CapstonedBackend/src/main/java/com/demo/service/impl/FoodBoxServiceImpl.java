package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.FoodBoxRepository;
import com.demo.model.FoodBox;
import com.demo.service.FoodBoxService;

@Service
public class FoodBoxServiceImpl implements FoodBoxService{
	@Autowired
	private FoodBoxRepository dao;
	

	@Override
	public FoodBox addFoodBox(FoodBox food) {
		// TODO Auto-generated method stub
		return dao.save(food);
	}

	@Override
	public FoodBox updateFoodBox(FoodBox food) {
		// TODO Auto-generated method stub
		return dao.save(food);
	}

	@Override
	public void deleteFoodById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public FoodBox getFoodById(int id) {
		return dao.findById(id).get();
		
	}

	@Override
	public List<FoodBox> getAllFoods() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
