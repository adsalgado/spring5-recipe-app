package guru.springframework.recipes.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipes.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	Optional<Category> findByDescription(String description);
}
