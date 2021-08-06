package guru.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipes.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
