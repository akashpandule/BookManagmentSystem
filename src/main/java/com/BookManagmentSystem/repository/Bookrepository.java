package com.BookManagmentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookManagmentSystem.model.BookModel;
@Repository
public interface Bookrepository extends JpaRepository<BookModel, Integer> {

	

}
