package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.FoodBox;
@Repository
	public interface FoodBoxRepository extends JpaRepository<FoodBox, Integer>{

}
