package ru.geekbrains.whatseat.model;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ru.geekbrains.whatseat.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe extends BaseEntity{
	 @NotNull
	    @NotEmpty
	    private String name;

	    @NotEmpty
	    @NotNull
	    private String description;

	    @NotNull
	    @Enumerated
	    private RecipeCategory recipeCategory;
	    
	    @NotEmpty
	    @NotNull
	    private String photoUrl;

	    @NotNull
	    @NotEmpty
	    private String preparationTime;

	    @NotNull
	    @NotEmpty
	    private String cookTime;
	    
	    @ManyToOne
	    @JoinColumn(name = "owner_id")
	    @JsonIgnore
	    private User owner;
	    
	    @Valid
	    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	    private List<Ingredient> ingredients = new ArrayList<>();
	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public RecipeCategory getRecipeCategory() {
	        return recipeCategory;
	    }

	    public void setRecipeCategory(RecipeCategory recipeCategory) {
	        this.recipeCategory = recipeCategory;
	    }

	    public String getPhotoUrl() {
	        return photoUrl;
	    }

	    public void setPhotoUrl(String photoUrl) {
	        this.photoUrl = photoUrl;
	    }

	    public String getPreparationTime() {
	        return preparationTime;
	    }

	    public void setPreparationTime(String preparationTime) {
	        this.preparationTime = preparationTime;
	    }

	    public String getCookTime() {
	        return cookTime;
	    }

	    public void setCookTime(String cookTime) {
	        this.cookTime = cookTime;
	    }

	    public List<Ingredient> getIngredients() {
	        return ingredients;
	    }

	    public void setIngredients(List<Ingredient> ingredients) {
	        this.ingredients = ingredients;
	    }
	    
	    public User getOwner() {
	        return owner;
	    }

	    public void setOwner(User owner) {
	        this.owner = owner;
	    }
	    
	    public Recipe() {
	        super();
	    }
	    public Recipe(
	            String name,
	            String description,
	            RecipeCategory recipeCategory,
	            String photoUrl,
	            String preparationTime,
	            String cookTime) {
	        this();
	        this.name = name;
	        this.description = description;
	        this.recipeCategory = recipeCategory;
	        this.photoUrl = photoUrl;
	        this.preparationTime = preparationTime;
	        this.cookTime = cookTime;
	    }
}
