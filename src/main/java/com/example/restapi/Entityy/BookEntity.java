package com.example.restapi.Entityy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String isbn;

    public BookEntity(){

    }
    public BookEntity(Long id,String title,String author,String isbn)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }



}
