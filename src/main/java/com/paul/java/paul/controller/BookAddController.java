package com.paul.java.paul.controller;


import com.paul.java.paul.entity.Book;
import com.paul.java.paul.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookAddController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/hello")
    public String getAll(){
        /*ModelAndView modelAndView=new ModelAndView("hello");
        List<Book> books=bookService.getAll();
        modelAndView.addObject("books",books);
        return modelAndView;*/
        return "index";
    }
}
