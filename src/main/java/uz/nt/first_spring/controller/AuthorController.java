package uz.nt.first_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.nt.first_spring.dto.AuthorDto;
import uz.nt.first_spring.service.impl.AuthorServiceImpl;

import java.util.ArrayList;

@RestController
public class AuthorController {
    public static AuthorServiceImpl authorService = new AuthorServiceImpl();

    @GetMapping("/getAuthor")
    public ArrayList<AuthorDto> au4s(){

        return authorService.au4_s();
    }
}
