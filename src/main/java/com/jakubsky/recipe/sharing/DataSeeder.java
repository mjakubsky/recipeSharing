package com.jakubsky.recipe.sharing;

import com.jakubsky.recipe.sharing.model.Recipe;
import com.jakubsky.recipe.sharing.model.User;
import com.jakubsky.recipe.sharing.repository.RecipeRepository;
import com.jakubsky.recipe.sharing.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RecipeRepository recipeRepository;

    @Override
    public void run(String... args) {
        if (userRepository.findByEmail("john@example.com").isEmpty()) {
            User user = new User();
            user.setUsername("john");
            user.setEmail("john@example.com");
            user.setPassword("hashedpass");
            user = userRepository.save(user);

            Recipe recipe = new Recipe();
            recipe.setTitle("Jajecznica");
            recipe.setDescription("Pyszna jajecznica na masle");
            recipe.setPreparationTime(10);
            recipe.setDifficulty("EASY");
            recipe.setAuthor(user);

            recipeRepository.save(recipe);
        }
    }
}
