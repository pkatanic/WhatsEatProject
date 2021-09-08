package ru.geekbrains.whatseat.service;

import java.util.List;

import ru.geekbrains.whatseat.model.Ingredient;

public interface IngredientService {
	Ingredient save(Ingredient ingredient);
    Ingredient findOne(Long id);
    List<Ingredient> findAll();
}
