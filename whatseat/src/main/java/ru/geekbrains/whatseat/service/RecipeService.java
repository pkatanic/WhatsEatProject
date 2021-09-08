package ru.geekbrains.whatseat.service;
import java.util.List;

import org.springframework.security.access.AccessDeniedException;

import ru.geekbrains.whatseat.model.Recipe;
import ru.geekbrains.whatseat.model.User;
public interface RecipeService {
	 List<Recipe> findAll();
	    Recipe findOne(Long id);
	    Recipe save(Recipe recipe, User user);
	    void delete(Recipe recipe);

	    List<Recipe> findByRecipeCategoryName(String name);
	    List<Recipe> findByDescriptionContaining(String description);

	    List<Recipe> findFavoriteRecipesForUser(User user);

	    boolean updateFavoriteRecipesForUser(Recipe recipe, User user);

	    boolean checkIfRecipeIsFavoriteForUser(Recipe recipe, User user);

	    void checkIfUserCanEditRecipe(User user, Recipe recipe)
	            throws AccessDeniedException;

	    List<String> findStepsForRecipe(Long recipeId);

}
