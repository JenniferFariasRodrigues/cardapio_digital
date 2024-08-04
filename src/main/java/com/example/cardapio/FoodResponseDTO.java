//package com.example.cardapio.food;
//
//public record FoodResponseDTO (Long id, String title, String image, Integer price){
//    public  FoodResponseDTO(Food food){
//        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
//    }
//}
package com.example.cardapio.food;

public class FoodResponseDTO {
    private Long id;
    private String title;
    private double price;
    private String image;

    public FoodResponseDTO(Food food) {
        this.id = food.getId();
        this.title = food.getTitle();
        this.price = food.getPrice();
        this.image = food.getImage();
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
}
