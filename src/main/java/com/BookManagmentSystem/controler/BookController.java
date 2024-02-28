package com.BookManagmentSystem.controler;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.BookManagmentSystem.model.BookModel;
import com.BookManagmentSystem.repository.Bookrepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookmanagment")
public class BookController {
	@Autowired
	private Bookrepository bookrepo;

	@RequestMapping("/books")
	private List<BookModel> getAllBook() {
		return bookrepo.findAll();
	}

	@GetMapping("/getbook/{id}")
	private BookModel getBookById(@PathVariable int id) {
		return bookrepo.findById(id).orElseThrow(()-> new BookNotFoundException(id));
		
	}
//	@PostMapping("/insertdata")
//	private String addedBook(@RequestBody BookModel book) {
//		bookrepo.save(book);
//		return "added succesfully"+book;
//		
//	} this onne aor another way 
	@PostMapping("/insertdata")
	private BookModel addedBook(@RequestBody BookModel book) {
		return bookrepo.save(book);
}
	@PutMapping("/updated/{id}")
	private ResponseEntity<BookModel> bookupdate(@PathVariable int id, @RequestBody BookModel book) {
		try {
			BookModel resposEntity=getBookById(id);
			return new ResponseEntity<BookModel>(book,HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<BookModel>(book,HttpStatus.NOT_FOUND);
				
		}	
	}
	@DeleteMapping("/deleted/{id}")
	private String DeleteById(@PathVariable int id) {
	       bookrepo.deleteById(id);
	       return "deleted Succefullly";
		
	}
}