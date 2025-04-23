package com.example.restapi.Controllerrr;

import com.example.restapi.Entityy.BookEntity;
import com.example.restapi.service.Servicelayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private Servicelayer servicelayer;

    @GetMapping
    public List<BookEntity> getAllBooks()
    {
        return servicelayer.getAllBooks();
    }
    @GetMapping("/{id}")
    public ResponseEntity<BookEntity> getBookById(@PathVariable  Long id){
        Optional<BookEntity> book = servicelayer.getBookById(id);
        return book.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());

    }
    @PostMapping()
    public BookEntity createBook(@RequestBody BookEntity bookentity){
        return servicelayer.create(bookentity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Deletebyid(@PathVariable Long id)
    {
        servicelayer.deleteBookByID(id);
        return ResponseEntity.noContent().build();
    }

}
