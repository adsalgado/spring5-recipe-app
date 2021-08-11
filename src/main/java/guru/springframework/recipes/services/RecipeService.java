package guru.springframework.recipes.services;

import java.util.Set;

import guru.springframework.recipes.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}
