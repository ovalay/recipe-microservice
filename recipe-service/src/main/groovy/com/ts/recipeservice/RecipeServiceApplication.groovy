package com.ts.recipeservice

import com.ts.recipeservice.dao.RecipeRepository
import com.ts.recipeservice.domain.Recipe
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean

@EnableDiscoveryClient
@SpringBootApplication
class RecipeServiceApplication {

	static void main(String[] args) {
		SpringApplication.run RecipeServiceApplication, args
	}

	@Bean
	ApplicationRunner init (RecipeRepository repo) {
		//bootstrap some data
		return {
			args -> ["recipe1", "recipe2", "recipe3", "recipe4", "recipe5", "recipe6", "recipe7", "recipe8", "recipe9", "recipe10"]
                    .forEach{recipe -> repo.save(new Recipe(name: recipe))}
                repo.findAll().forEach{println it}
		}
	}
}
