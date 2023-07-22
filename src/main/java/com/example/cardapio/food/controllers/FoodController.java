package com.example.cardapio.food.controllers;

import com.example.cardapio.food.FoodResponseDTO;
import com.example.cardapio.food.entities.Food;
import com.example.cardapio.food.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/foods")
public class FoodController {

	@Autowired
	private FoodRepository repository;
	@GetMapping
	public List<FoodResponseDTO> findAll() {
		List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
		return foodList;
	}

}