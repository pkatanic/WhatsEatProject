package ru.geekbrains.whatseat.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import ru.geekbrains.whatseat.entity.BaseEntity;
import ru.geekbrains.whatseat.validator.ValidItem;
public class Ingredient extends BaseEntity {
	
	 @NotNull
	    @OneToOne
	    @JoinColumn(name = "item_id")
	    @ValidItem(message = "пожалуйста выберите элемент")
	    private Item item;

	    @NotNull
	    @NotEmpty(message = "пожалуйста выберите состояние")
	    private String condition;

	    @NotNull
	    @NotEmpty(message = "пожалуйста внесите количество")
	    private String quantity;
	    
	    @NotNull(message =
	            "Продукт можно выбрать только вместе с рецептом")
	    @ManyToOne
	    @JoinColumn(name = "recipe_id")
	    private Recipe recipe;

	   

	    public Item getItem() {
	        return item;
	    }

	    public void setItem(Item item) {
	        this.item = item;
	    }

	    public String getCondition() {
	        return condition;
	    }

	    public void setCondition(String condition) {
	        this.condition = condition;
	    }

	    public String getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(String quantity) {
	        this.quantity = quantity;
	    }

	    public Recipe getRecipe() {
	        return recipe;
	    }

	    public void setRecipe(Recipe recipe) {
	        this.recipe = recipe;
	    }
	    
	    public Ingredient() {
	        super();
	    }
	    
	    public Ingredient(Item item, String condition, String quantity) {
	        this();
	        this.item = item;
	        this.condition = condition;
	        this.quantity = quantity;
	    }

}
