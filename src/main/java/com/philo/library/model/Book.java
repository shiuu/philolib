package com.philo.library.model;

import lombok.Data;

@Data
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int status;     // 0: In library; greater than 0: On Loan
}
