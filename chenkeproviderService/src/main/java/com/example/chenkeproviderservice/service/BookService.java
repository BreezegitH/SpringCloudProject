package com.example.chenkeproviderservice.service;

import com.example.chenkeproviderservice.entity.Book;
import com.example.chenkeproviderservice.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper ssmdbMapper;
    public Book getById(int id){
        return ssmdbMapper.getById(id);
    }
    public List<Book> getAll(){
        return ssmdbMapper.getAll();
    }
}




