package com.philo.library.service;

import com.philo.library.mapper.DemoMapper;
import com.philo.library.model.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeService {

    @Resource
    private DemoMapper demoMapper;

    public List<Book> getBookList() throws Exception {
        return demoMapper.getBookList();
    }

//    public List<Book>  getBooksByPersonID(int personId) throws Exception {
//
//    }
}
