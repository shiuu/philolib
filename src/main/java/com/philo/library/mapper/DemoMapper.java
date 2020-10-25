package com.philo.library.mapper;

import com.philo.library.model.Book;
import com.philo.library.model.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DemoMapper {

    @Select("select * from books")
    List<Book> getBookList();

    @Select("select * from persons")
    List<Person> getPeople();

    @Select("SELECT books.* FROM books " +
            "INNER JOIN loans ON books.id = loans.bookid " +
            "WHERE loans.personid=#{personID}")
    List<Book> getBooksByPersonID(@Param("personID") int personID);
}
