package com.example.cocktaildemo;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CocktailRepository {
    private final List<Cocktail> cocktails = new ArrayList<>();

    public CocktailRepository(){
        populateCocktails();
    }


    public void populateCocktails() {
         Cocktail whiskeySour = new Cocktail("Whiskey Sour");
         Cocktail oldFashioned = new Cocktail("Old Fashioned");
         Cocktail mojito = new Cocktail("Mojito");
         Cocktail negroni = new Cocktail("Negroni");
         Cocktail margarita = new Cocktail("Margarita");

         whiskeySour.addIngredient(new Ingredient("Whiskey", 60));
         whiskeySour.addIngredient(new Ingredient("Egg whites", 30));
         whiskeySour.addIngredient(new Ingredient("Syrup", 30 ));
         whiskeySour.addIngredient(new Ingredient("Lemon juice", 30));

         oldFashioned.addIngredient(new Ingredient("Whiskey", 60));
         oldFashioned.addIngredient(new Ingredient("Sugar", 30));
         oldFashioned.addIngredient(new Ingredient("Angostura", 30));

         mojito.addIngredient(new Ingredient("Rum", 60));
         mojito.addIngredient(new Ingredient("Sparkling water", 30));
         mojito.addIngredient(new Ingredient("Mint", 30));
         mojito.addIngredient(new Ingredient("Sugar", 30));
         mojito.addIngredient(new Ingredient("Lime juice", 30));

         negroni.addIngredient(new Ingredient("Gin", 60));
         negroni.addIngredient(new Ingredient("Vermuth", 60));
         negroni.addIngredient(new Ingredient("Campari", 30));

         margarita.addIngredient(new Ingredient("Tequila", 60));
         margarita.addIngredient(new Ingredient("Triple sec", 30));
         margarita.addIngredient(new Ingredient("Lime juice", 30));

         cocktails.addAll(Arrays.asList(whiskeySour, oldFashioned, mojito, negroni, margarita));

    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    public Cocktail getIngredients(String name) {

        for (Cocktail obj : cocktails) {
            if(obj.getName().equals(name)) {
                return obj;
            }
        }
        return null;
    }

    public List<Cocktail> getCocktailsFromIngredients(String name) {
        List<Cocktail> matchingCocktails = new ArrayList<>();
        for (Cocktail obj : cocktails) {
            for(Ingredient ing : obj.getIngredientList()) {
                if(ing.getName().equals(name)) {
                    matchingCocktails.add(obj);
                    break;
                }
            }
        }
        return matchingCocktails;
    }

}
