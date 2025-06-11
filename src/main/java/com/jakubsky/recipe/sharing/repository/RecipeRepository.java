package com.jakubsky.recipe.sharing.repository;

import com.jakubsky.recipe.sharing.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
