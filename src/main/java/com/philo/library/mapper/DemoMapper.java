package com.philo.library.mapper;

import com.philo.library.model.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DemoMapper {

    @Select("select * from books ")
    List<Book> getBookList();
}
