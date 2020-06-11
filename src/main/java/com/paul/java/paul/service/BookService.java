package com.paul.java.paul.service;

import com.paul.java.paul.entity.Book;
import com.paul.java.paul.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public List<Book> queryBook(String searchWord){
        return  bookMapper.queryBook(searchWord);
    }

    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }

    public int deleteBook(long bookId){
        return bookMapper.deleteBook(bookId);
    }

    public boolean matchBook(String searchWord){
        return bookMapper.matchBook(searchWord)>0;
    }

    public boolean addBook(Book book){
        String name=book.getName();
        String author=book.getAuthor();
        String publish=book.getPublish();
        String isbn=book.getIsbn();
        String introduction=book.getIntroduction();
        String language=book.getLanguage();
        BigDecimal price=book.getPrice();
        Date pubdate=book.getPubdate();
        int classId=book.getClassId();
        int pressmark=book.getPressmark();
        int state=book.getState();
        return bookMapper.addBook(name,author,publish,isbn,introduction,language,price,pubdate,classId,pressmark,state)>0;
    }

    public Book getBook(Long bookId){
        Book book=bookMapper.getBook(bookId);
        return book;
    }
    public boolean editBook(Book book){
        Long bookId=book.getBookId();
        String name=book.getName();
        String author=book.getAuthor();
        String publish=book.getPublish();
        String isbn=book.getIsbn();
        String introduction=book.getIntroduction();
        String language=book.getLanguage();
        BigDecimal price=book.getPrice();
        Date pubdate=book.getPubdate();
        int classId=book.getClassId();
        int pressmark=book.getPressmark();
        int state=book.getState();
        return bookMapper.editBook(bookId,name,author,publish,isbn,introduction,language,price,pubdate,classId,pressmark,state)>0;
    }
}
