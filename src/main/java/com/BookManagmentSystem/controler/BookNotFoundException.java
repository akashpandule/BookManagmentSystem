package com.BookManagmentSystem.controler;

public class BookNotFoundException extends RuntimeException {
 public BookNotFoundException(int id) {
	 super("In this ID Book Is not Available"+id);
 }
}
