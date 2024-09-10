package com.example.cocktaildemo;

import java.util.ArrayList;
import java.util.List;

public class Cocktail {
    private String name;
    private List<Ingredient> ingredientList;

    public Cocktail(String name) {
        this.name = name;
        this.ingredientList = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }




}
