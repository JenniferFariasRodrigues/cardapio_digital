package com.example.cardapio.food;

import com.example.cardapio.FoodRequestDTO;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public FoodResponseDTO createFood(FoodRequestDTO request) {
        Food food = new Food();
        food.setTitle(request.getTitle());
        food.setPrice(request.getPrice());
        food.setImage(request.getImage());
        foodRepository.save(food);
        return new FoodResponseDTO(food);
    }

    public List<FoodResponseDTO> getAllFood() {
        return foodRepository.findAll().stream()
                .map(FoodResponseDTO::new)
                .collect(Collectors.toList());
    }
}
