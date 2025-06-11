package com.jakubsky.recipe.sharing.repository;

import com.jakubsky.recipe.sharing.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
