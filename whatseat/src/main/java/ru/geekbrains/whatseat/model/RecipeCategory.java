package ru.geekbrains.whatseat.model;

import java.util.Arrays;
import java.util.List;

public enum RecipeCategory {
	NONE("Other"),
    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    DESSERT("Dessert");
	
	 private final String name;
	 
	 public String getName() {
	        return name;
	    }
	    
	 RecipeCategory( String name
	           ) {
	        this.name = name;
	       
	    }
	 public static List<RecipeCategory> listOfCategories() {
	       List<RecipeCategory> categories =
	               Arrays.asList(
	                    RecipeCategory.BREAKFAST,
	                    RecipeCategory.DESSERT,
	                    RecipeCategory.LUNCH,
	                    RecipeCategory.DINNER
	               );
	       return categories;
	    }

}
