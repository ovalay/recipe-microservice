package com.ts.edgeservice.client;

import com.ts.edgeservice.dto.Recipe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("recipe-service")
@Component
public interface RecipeClient {

    @GetMapping("/recipes")
    List<Recipe> read();
}
