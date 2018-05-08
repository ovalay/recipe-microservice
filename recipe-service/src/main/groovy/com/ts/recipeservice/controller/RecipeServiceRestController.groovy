package com.ts.recipeservice.controller

import com.ts.recipeservice.dao.RecipeRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RecipeServiceRestController {

    RecipeRepository repository

    RecipeServiceRestController(RecipeRepository repository) {
        this.repository = repository
    }

    @GetMapping("/recipes")
    def recipe () {
        return repository.findAll()
    }
}
