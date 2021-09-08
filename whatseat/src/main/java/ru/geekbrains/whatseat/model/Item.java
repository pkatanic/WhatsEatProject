package ru.geekbrains.whatseat.model;

import  javax.validation.constraints.NotEmpty;

import ru.geekbrains.whatseat.entity.BaseEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class Item extends BaseEntity {



    @NotNull
    @NotEmpty
    private String name;

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Item() {
        super();
    }

   
    public Item(String name) {
        this();
        this.name = name;
    }
}
