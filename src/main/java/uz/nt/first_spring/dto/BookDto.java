package uz.nt.first_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto {

    private Integer id;
    private String name;
    private Double price;
}
