package com.example.chenkeproviderservice.mapper;


import com.example.chenkeproviderservice.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    //更具id查对应的书用注解模式
    @Select("select * from tbl_book where id=#{id}")
    public Book getById(int id);

    //查询所有的书 ，这里我们用配置模式
    //配置模式我个人喜欢用来写复制的sql语句（狗头）
    public List<Book> getAll();

}


