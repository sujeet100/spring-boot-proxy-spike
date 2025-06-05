package com.proxy.book;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class BooksController {
    // Generate GET, POST, PUT, DELETE methods for movies
    @GetMapping("/books")
    public List<Book> getBooks() {
        return List.of(new Book("Book 1"), new Book("Book 2"));
    }

    //get book by name
    @GetMapping("/books/{name}")
    public Book getBook(@PathVariable String name) {
        if (Objects.equals(name, "blank") || name.isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty");
        }
        // In a real application, you would fetch the book from a database
        return new Book(name);
    }


    @PostMapping("/books")
    public Book createBook(Book book) {
        // In a real application, you would save the book to a database
        return book;
    }

    @PutMapping("/books/:name")
    public Book updateBook(String name, Book book) {
        // In a real application, you would update the book in a database
        return book;
    }

    @DeleteMapping("/books")
    public void deleteBook(String name) {
        // In a real application, you would delete the book from a database
        // For this example, we do nothing
    }
}
