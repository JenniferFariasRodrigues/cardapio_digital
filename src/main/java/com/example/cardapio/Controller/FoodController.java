package com.example.cardapio.Controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

import com.example.cardapio.food.FoodResponseDTO;
@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @CrossOrigin(origins =  "*", allowedHeaders = "*")
    @GetMapping
    public Stream<FoodResponseDTO> getAll(){
        Stream<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new);
        return foodList;
    }
}
