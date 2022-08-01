package uz.nt.first_spring.service.impl;

import org.springframework.stereotype.Service;
import uz.nt.first_spring.dto.AuthorDto;
import uz.nt.first_spring.entity.Author;
import uz.nt.first_spring.service.AuthorService;

import java.util.ArrayList;
@Service
public class AuthorServiceImpl implements AuthorService {

    @Override
    public ArrayList<AuthorDto> au4_s() {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author(3, "Diyor", "Diyorov", "2004-09-13"));
        authors.add(new Author(1, "Ibrohim", "Ahmadjonov", "2004-09-13"));
        authors.add(new Author(2, "Abdusattor", "Abdusattorov", "2004-09-13"));
        ArrayList<AuthorDto> authorDtos = new ArrayList<>();
        for(Author a : authors){
            authorDtos.add(new AuthorDto(a.getId(), a.getFirstName(), a.getLastName(), a.getTukhilgan()));
        }
        return authorDtos;
    }
}
