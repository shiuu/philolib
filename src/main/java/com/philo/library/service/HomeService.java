package com.philo.library.service;

import com.philo.library.mapper.DemoMapper;
import com.philo.library.model.Book;
import com.philo.library.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeService {

    @Resource
    private DemoMapper demoMapper;

    public List<Book> getBookList() {
        return demoMapper.getBookList();
    }

    public List<Person> getPeople() {
        return demoMapper.getPeople();
    }

    public List<Book> getBooksByPersonID(int personId) {
        return demoMapper.getBooksByPersonID(personId);
    }
}
