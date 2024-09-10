package com.example.cocktaildemo;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cocktails")
public class CocktailController {

    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }



    @GetMapping("")
    public String getCocktails(Model model) {
        List<Cocktail> cocktails = cocktailService.getAllCocktails();
        model.addAttribute("cocktails", cocktails);
        return "cocktailList";
    }

    @GetMapping("/{name}")
    public String getCocktail(Model model, @PathVariable String name) {
        Cocktail cocktail = cocktailService.getAllIngredients(name);
        model.addAttribute("cocktail", cocktail);
        model.addAttribute("ingredients", cocktail.getIngredientList());
        return "ingredientList";
    }

    @GetMapping("/ingredient")
    public String getIngredients(Model model, @RequestParam String ingredient) {
        List<Cocktail> ingredientList = cocktailService.getAllCocktailsByName(ingredient);
        model.addAttribute("cocktails", ingredientList);
        return "cocktailByIngredient";
    }

}
