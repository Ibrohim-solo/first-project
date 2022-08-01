package uz.nt.first_spring.service;

import uz.nt.first_spring.dto.BookDto;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;

public interface BookService {

    BookDto getById(Integer id);
    void deleteById(Integer id);
}
