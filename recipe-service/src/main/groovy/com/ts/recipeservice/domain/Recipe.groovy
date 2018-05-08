package com.ts.recipeservice.domain

import groovy.transform.Canonical

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
@Canonical
class Recipe {

    @Id
    @GeneratedValue
    Long id;

    String name;
}
