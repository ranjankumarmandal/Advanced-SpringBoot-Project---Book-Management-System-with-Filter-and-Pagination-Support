package com.example.Book_Management_System.service;

import com.example.Book_Management_System.entity.Book;
import com.example.Book_Management_System.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> getBook(Long id) {
        return repository.findById(id);
    }

    public Page<Book> getBooksPage(int page, int size, String sortBy) {
        return repository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
    }

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    @Transactional
    public void updateAuthor(Long id, String newAuthor) {
        Book book = repository.findById(id).orElseThrow();
        book.setAuthor(newAuthor);
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
}
