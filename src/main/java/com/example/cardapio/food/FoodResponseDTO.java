package com.example.cardapio.food;

import com.example.cardapio.food.entities.Food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());

    }
}
