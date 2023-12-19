package com.example.cake;

public class Ingredient {
   private String name; // имя
    private int price; // цена
    private double discount; // скидка


    public Ingredient(String name, int price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double getDiscountPrice(){
        return price -(price * discount /100);
    }
}
