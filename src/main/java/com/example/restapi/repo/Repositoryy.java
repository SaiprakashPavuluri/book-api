package com.example.restapi.repo;

import com.example.restapi.Entityy.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Repositoryy extends JpaRepository<BookEntity,Long> {

}
