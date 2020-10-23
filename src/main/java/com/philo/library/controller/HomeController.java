package com.philo.library.controller;

import com.google.gson.Gson;
import com.philo.library.model.Book;
import com.philo.library.model.Person;
import com.philo.library.service.HomeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value="/books", method = RequestMethod.GET)
    public String getBookList() {
        List<Book> books = homeService.getBookList();
        return gson.toJson(books);
    }

    @RequestMapping(value="/people", method = RequestMethod.GET)
    public String getPeople() {
        List<Person> people = homeService.getPeople();
        return gson.toJson(people);
    }

    @RequestMapping(value="/books-on-loan/{personId}", method = RequestMethod.GET)
    public String getBooksByPersonID(@PathVariable("personId") int personId) {
        List<Book> books = homeService.getBooksByPersonID(personId);
        return gson.toJson(books);
    }
}
