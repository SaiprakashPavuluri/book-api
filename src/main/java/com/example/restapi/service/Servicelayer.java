package com.example.restapi.service;

import com.example.restapi.Entityy.BookEntity;
import com.example.restapi.repo.Repositoryy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Servicelayer {
    private final Repositoryy repositoryy;

    @Autowired
    public Servicelayer(Repositoryy repositoryy) {
        this.repositoryy = repositoryy;
    }
    public List<BookEntity> getAllBooks(){
        return repositoryy.findAll();
    }

    public Optional<BookEntity> getBookById(Long id)
    {
        return repositoryy.findById(id);
    }
    public BookEntity create(BookEntity bookentity){
        return repositoryy.save(bookentity);
    }
    public void deleteBookByID(Long id)
    {
        if(repositoryy.existsById(id)){
            repositoryy.deleteById(id);
        }else{
            throw new RuntimeException("book not found"+id);
        }

    }
}
