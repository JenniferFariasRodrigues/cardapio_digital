package com.example.cardapio.Controller;

import com.example.cardapio.FoodRequestDTO;
import com.example.cardapio.food.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.cardapio.food.FoodResponseDTO;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    //    @Autowired
//    private FoodRepository repository;
//
//    @PostMapping
//    public void saveFood(@RequestBody FoodRequestDTO data){
//        Food foodData = new Food(data);
//        repository.save(foodData);
//        return;
//    }
//
//    @CrossOrigin(origins =  "*", allowedHeaders = "*")
//    @GetMapping
//    public Stream<FoodResponseDTO> getAll(){
//        Stream<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new);
//        return foodList;
//    }
//}
    @Autowired
    private FoodService foodService;

    @PostMapping
    public ResponseEntity<FoodResponseDTO> createFood(@RequestBody FoodRequestDTO request) {
        FoodResponseDTO food = foodService.createFood(request);
        return ResponseEntity.ok(food);
    }

    @GetMapping
    public ResponseEntity<Object> getAllFood() {
        List<FoodResponseDTO> foods = foodService.getAllFood();
        return ResponseEntity.ok(foods);
    }
}