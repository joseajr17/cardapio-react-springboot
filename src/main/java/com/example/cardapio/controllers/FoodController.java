package com.example.cardapio.controllers;

import com.example.cardapio.entities.Food;
import com.example.cardapio.repositories.FoodRepository;
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
	public List<Food> findAll() {
		return repository.findAll();
	}

}
