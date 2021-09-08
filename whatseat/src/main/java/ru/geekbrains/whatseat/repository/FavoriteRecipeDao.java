package ru.geekbrains.whatseat.repository;

import java.util.List;

import ru.geekbrains.whatseat.model.Recipe;
import ru.geekbrains.whatseat.model.User;

public interface FavoriteRecipeDao {
	 List<Recipe> findAllFavoriteRecipesFor(User user);

	    void addFavoriteRecipeForUser(Long recipeId, Long userId);

	    void removeFavoriteRecipeForUser(Long recipeId, Long userId);

	    List<String> findStepsForRecipe(Long recipeId);
}
