package com.example.cardapio.Controller;

import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

import com.example.cardapio.food.FoodResponseDTO;
@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;
    @GetMapping
    public Stream<FoodResponseDTO> getAll(){
        Stream<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new);
        return foodList;
    }
}
