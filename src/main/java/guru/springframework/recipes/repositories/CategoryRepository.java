package guru.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipes.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
