package com.example.Book_Management_System.controller;

import com.example.Book_Management_System.entity.Book;
import com.example.Book_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable Long id) {
        return service.getBook(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        book.setId(id);
        return service.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
    }

    @GetMapping("/page")
    public Page<Book> getBooksPage(@RequestParam(defaultValue = "0") int page,
                                   @RequestParam(defaultValue = "5") int size,
                                   @RequestParam(defaultValue = "id") String sortBy) {
        return service.getBooksPage(page, size, sortBy);
    }
}
