package com.ts.edgeservice.dto;

public class Recipe {

    Long id;
    String name;

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
