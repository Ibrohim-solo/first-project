package uz.nt.first_spring.service.impl;

import org.springframework.stereotype.Service;
import uz.nt.first_spring.dto.BookDto;
import uz.nt.first_spring.entity.Author;
import uz.nt.first_spring.entity.Book;
import uz.nt.first_spring.service.BookService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    public List<Book> books = new ArrayList<>();
    public List<Author> a = new ArrayList<>();

//    public boolean isPrime(int num){
//        if(num<2){
//            return false;
//        }
//        else{
//            int x= num/2;
//            for(int i=2;i<x;i++){
//                if(num%i==0){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

//    @Override
//    public ArrayList<BookDto> getBy_id() {
//
//        ArrayList<Author> authors = new ArrayList<>();
//        books.add(new Book(3, "7 qavat", 30000D));
//        books.add(new Book(1, "Halol luqma", 50000D));
//        books.add(new Book(2, "Piyoz nega xomush", 40000D));
//
//        a.add(new Author(3, "Diyor", "Diyorov", "2004-09-13"));
//        a.add(new Author(1, "Ibrohim", "Ahmadjonov", "2004-09-13"));
//        a.add(new Author(2, "Abdusattor", "Abdusattorov", "2004-09-13"));
//
//        books.sort((a, b) -> a.getId() - b.getId());
//        ArrayList<BookDto> b = new ArrayList<>();
//
//        for (Book b4 : books) {
//            b.add(new BookDto(b4.getId(), b4.getName(), b4.getPrice()));
//        }
//        return b;
//    }


    @Override
    public BookDto getById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
