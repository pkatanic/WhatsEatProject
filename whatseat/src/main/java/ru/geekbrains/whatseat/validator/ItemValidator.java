package ru.geekbrains.whatseat.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import ru.geekbrains.whatseat.model.Item;
public class ItemValidator implements ConstraintValidator<ValidItem, Item> {

	@Override
	public boolean isValid(Item value, ConstraintValidatorContext context) {
		  if (value == null || value.getId() == 0) {
	            return false;
	        }
		  return true;
	}

}
