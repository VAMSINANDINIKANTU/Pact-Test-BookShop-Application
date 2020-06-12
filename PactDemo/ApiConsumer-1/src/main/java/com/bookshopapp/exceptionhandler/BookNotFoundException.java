package com.bookshopapp.exceptionhandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {
     private static final long serialVersionUID = 1L;
     public BookNotFoundException(Long id)
     {
  	   super("book id not found : " + id);
     }
     public BookNotFoundException(String name)
     {
  	   super("book name not found : " + name);
     }
}
