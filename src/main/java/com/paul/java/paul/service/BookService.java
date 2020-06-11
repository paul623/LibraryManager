package com.paul.java.paul.service;

import com.paul.java.paul.entity.Book;
import com.paul.java.paul.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public List<Book> getAll(){
        return bookMapper.getAllBooks();
    }
}
