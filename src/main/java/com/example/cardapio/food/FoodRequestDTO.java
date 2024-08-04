//package com.example.cardapio.food;
//
//public record FoodRequestDTO(String title, String image, Integer price) {
//}
package com.example.cardapio;

public class FoodRequestDTO {
    private String title;
    private double price;
    private String image;

    // Getters e setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
