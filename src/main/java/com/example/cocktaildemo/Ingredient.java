package com.example.cocktaildemo;

public class Ingredient {
    private String name;
    private int quantityInMl;

    public Ingredient(String name, int quantityInMl) {
        this.name = name;
        this.quantityInMl = quantityInMl;
    }

    public int getQuantityInMl() {
        return quantityInMl;
    }

    public String getName() {
        return name;
    }
}
