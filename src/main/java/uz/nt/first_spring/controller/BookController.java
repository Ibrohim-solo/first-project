package uz.nt.first_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uz.nt.first_spring.dto.BookDto;
import uz.nt.first_spring.service.BookService;
import uz.nt.first_spring.service.impl.BookServiceImpl;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/getvvid/{id}")
    public BookDto getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @GetMapping("/getBookById/{id}")
    public void deleteById(@PathVariable Integer id){
        bookService.deleteById(id);
    }
}
