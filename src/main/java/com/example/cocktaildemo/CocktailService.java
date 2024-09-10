package com.example.cocktaildemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    private final CocktailRepository cocktailRepository;

        public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
        }

        public List<Cocktail> getAllCocktails() {
            return cocktailRepository.getCocktails();
        }

        public Cocktail getAllIngredients(String name) {
            return cocktailRepository.getIngredients(name);
        }

        public List<Cocktail> getAllCocktailsByName(String name) {
            return cocktailRepository.getCocktailsFromIngredients(name);
        }




}
