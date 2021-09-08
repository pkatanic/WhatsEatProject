package ru.geekbrains.whatseat.exception;

public class UserAlreadyExists extends RuntimeException {
	  public UserAlreadyExists() {
	        super("Пользователь с таким именем уже существует");
	    }

}
