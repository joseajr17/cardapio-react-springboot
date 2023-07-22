package com.example.cardapio.food.repositories;

import com.example.cardapio.food.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
