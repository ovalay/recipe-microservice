package com.ts.edgeservice.controller;


import com.ts.edgeservice.client.RecipeClient;
import com.ts.edgeservice.dto.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RecipeApiAdapterRestController {

//    @Autowired
//    RestTemplate restTemplate;

    private RecipeClient client;

    public RecipeApiAdapterRestController(RecipeClient recipeClient) {
        this.client = recipeClient;
    }

    @GetMapping("/good-recipes")
    List<Recipe> goodRecipes() {
        return client.read()
                .stream()
                .filter(recipe -> !recipe.getName().equals("recipe2") && !recipe.getName().equals("recipe5"))
                .collect(Collectors.toList());
//        restTemplate.exchange();
    }
}
