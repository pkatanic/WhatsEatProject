package ru.geekbrains.whatseat.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

import ru.geekbrains.whatseat.model.Recipe;
import ru.geekbrains.whatseat.model.RecipeCategory;

import java.util.List;

@Repository
public interface RecipeDao extends  CrudRepository<Recipe, Long> {
	 @Override
	    @PreAuthorize("hasRole('ROLE_ADMIN') or " +
	            "#recipe.owner == authentication.principal")
	    void delete(@Param("recipe") Recipe recipe);

	    List<Recipe> findByRecipeCategory(RecipeCategory recipeCategory);

	    
	    List<Recipe> findByDescriptionContaining(String description);
}
