package com.philo.library.service;

import com.philo.library.mapper.DemoMapper;
import com.philo.library.model.Book;
import com.philo.library.model.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HomeServiceTest {

    @Test
    public void getAllBooks() {
        DemoMapper mockMapper = mock(DemoMapper.class);

        Book book = new Book();
        book.setTitle("title");
        book.setAuthor("author1");
        book.setIsbn("1234567891");

        when(mockMapper.getBookList()).thenReturn(Arrays.asList(book));
        HomeService service = new HomeService(mockMapper);

        List<Book> books = service.getBookList();

        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

    @Test
    public void getAllPeople() {
        DemoMapper mockMapper = mock(DemoMapper.class);

        Person john = new Person();
        john.setId(1);
        john.setFirstName("John");
        john.setLastName("Davidson");
        john.setEmail("john@gmail.com");
        john.setPhone("0412888899");

        Person alice = new Person();
        alice.setId(1);
        alice.setFirstName("Alice");
        alice.setLastName("Howard");
        alice.setEmail("alice@gmail.com");
        alice.setPhone("0412123399");

        when(mockMapper.getPeople()).thenReturn(Arrays.asList(john, alice));
        HomeService service = new HomeService(mockMapper);

        List<Person> people = service.getPeople();

        assertEquals(2, people.size());
        assertEquals(john, people.get(0));
        assertEquals(alice, people.get(1));
    }

    @Test
    public void getBooksOnLoan() {
        DemoMapper mockMapper = mock(DemoMapper.class);
        Book book1 = new Book();
        book1.setTitle("title1");
        book1.setAuthor("author1");
        book1.setIsbn("1234567890");

        Book book2 = new Book();
        book2.setTitle("title2");
        book2.setAuthor("author2");
        book2.setIsbn("1234567892");

        Book book3 = new Book();
        book3.setTitle("title3");
        book3.setAuthor("author3");
        book3.setIsbn("1234567893");

        when(mockMapper.getBooksByPersonID(1)).thenReturn(Arrays.asList(book1, book2, book3));
        HomeService service = new HomeService(mockMapper);

        List<Book> books = service.getBooksByPersonID(1);

        assertEquals(3, books.size());
        assertEquals(book1, books.get(0));
        assertEquals(book2, books.get(1));
        assertEquals(book3, books.get(2));
    }
}
