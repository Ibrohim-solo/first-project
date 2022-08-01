package uz.nt.first_spring.service;

import uz.nt.first_spring.dto.ResponseDto;
import uz.nt.first_spring.dto.StudentDto;
import uz.nt.first_spring.service.impl.StudentServiceImpl;

import java.util.List;

public interface StudentService {
    public ResponseDto del_student();
    public ResponseDto add_student(StudentDto studentDto);
    public ResponseDto update_student(StudentDto studentDto);
    public List<StudentDto> get_student();
}
