package uz.nt.first_spring.controller;

import org.springframework.web.bind.annotation.*;
import uz.nt.first_spring.dto.ResponseDto;
import uz.nt.first_spring.dto.StudentDto;
import uz.nt.first_spring.service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {



    public static StudentServiceImpl ssi = new StudentServiceImpl();

    @DeleteMapping("/deleteWithId")
    public ResponseDto delStudent(){
        return ssi.del_student();
    }

    @PostMapping
    public ResponseDto addStudent(@RequestBody StudentDto studentDto){
        return ssi.add_student(studentDto);
    }

    @GetMapping
    public List<StudentDto> getStudents(){
        return ssi.get_student();
    }

    //Patch - Put
    @PatchMapping
    public ResponseDto updateStudent(@RequestBody StudentDto studentDto){
        return ssi.update_student(studentDto);
    }
}
