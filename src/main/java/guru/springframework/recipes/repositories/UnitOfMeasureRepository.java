package guru.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.recipes.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

}
