package ru.geekbrains.whatseat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import ru.geekbrains.whatseat.model.Recipe;
import ru.geekbrains.whatseat.model.User;

@Service
@ComponentScan
public class RecipeServiceImp implements RecipeService {

	 @Autowired
	 private ItemService itemService;
	@Override
	public List<Recipe> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe save(Recipe recipe, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Recipe recipe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Recipe> findByRecipeCategoryName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recipe> findByDescriptionContaining(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recipe> findFavoriteRecipesForUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateFavoriteRecipesForUser(Recipe recipe, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIfRecipeIsFavoriteForUser(Recipe recipe, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkIfUserCanEditRecipe(User user, Recipe recipe) throws AccessDeniedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> findStepsForRecipe(Long recipeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
