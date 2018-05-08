package com.ts.recipeservice.dao

import com.ts.recipeservice.domain.Recipe
import org.springframework.data.jpa.repository.JpaRepository

interface RecipeRepository extends JpaRepository<Recipe, Long>{

}