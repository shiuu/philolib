package com.philo.library.controller;

import com.philo.library.model.Book;
import com.philo.library.model.Person;
import com.philo.library.service.HomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class TestHomeController {

    @MockBean
    private HomeService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSuccessfulGetAllBooks() throws Exception {
        when(service.getBookList()).thenReturn(Arrays.asList(new Book(), new Book()));

        mockMvc.perform(get("/api/books")).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(2)));
    }

    @Test
    public void testSuccessfulGetAllPeople() throws Exception {
        when(service.getPeople()).thenReturn(Arrays.asList(new Person(), new Person(), new Person()));

        mockMvc.perform(get("/api/people")).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(3)));
    }

    @Test
    public void testSuccessSearchBooksByPersonId() throws Exception {
        when(service.getBooksByPersonID(5))
                .thenReturn(Arrays.asList(new Book()));
        mockMvc.perform(get("/api/books-on-loan/5"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)));
    }
}
