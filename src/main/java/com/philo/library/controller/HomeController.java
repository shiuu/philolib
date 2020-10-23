package com.philo.library.controller;

import com.google.gson.Gson;
import com.philo.library.model.Book;
import com.philo.library.service.HomeService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HomeController {

    @Resource
    private HomeService homeService;

    Gson gson = new Gson();

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot !";
    }

    @RequestMapping("/books")
    public String getBookList() throws Exception {
        List<Book> books = homeService.getBookList();
        return gson.toJson(books);
    }

}
