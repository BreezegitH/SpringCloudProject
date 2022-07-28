package com.example.chenkeproviderservice.controller;

import com.example.chenkeproviderservice.entity.Book;
import com.example.chenkeproviderservice.service.BookService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "BookController", tags = "书本管理接口")
public class BookController {
    @Autowired
    BookService ser;
    @RequestMapping("/id")
    public String to01(){
     final Book byId = ser.getById(1);
        return byId.toString();
    }

    @RequestMapping("/all")
    public String to02(){
        final List<Book> all = ser.getAll();
        return all.toString();
    }

}

