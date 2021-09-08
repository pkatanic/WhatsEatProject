package service;
import  command.IngredientCommand;
import  exception.NotFoundException;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId) throws NotFoundException;

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long valueOf, Long valueOf2);

}
