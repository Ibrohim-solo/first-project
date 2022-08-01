package uz.nt.first_spring.service.impl;

import uz.nt.first_spring.dto.ResponseDto;
import uz.nt.first_spring.dto.StudentDto;
import uz.nt.first_spring.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {


    public static ArrayList<StudentDto> students = new ArrayList<>();
    @Override
    public ResponseDto del_student() {
        students.add(new StudentDto(1, 18, "name", "tukhilgan", "course"));
        students.remove(0);
        return ResponseDto.builder()
                .code(1)
                .success(true)
                .message("Tinch")
                .build();
    }

    @Override
    public ResponseDto add_student(StudentDto studentDto) {
        students.add(studentDto);
        return ResponseDto.builder()
                .code(0)
                .success(true)
                .message("Successfully saved!")
                .build();
    }

    @Override
    public ResponseDto update_student(StudentDto studentDto) {
        for(StudentDto s : students){
            if(s.getId().equals(studentDto.getId())){
                if(studentDto.getName() != null) s.setName(studentDto.getName());
                if(studentDto.getAge() != null) s.setAge(studentDto.getAge());
                if(studentDto.getCourse() != null) s.setCourse(studentDto.getCourse());
                if(studentDto.getBirthDate() != null) s.setBirthDate(studentDto.getBirthDate());

                return ResponseDto.builder()
                        .code(0)
                        .success(true)
                        .message("Successfully update!")
                        .build();
            }
        }
        return ResponseDto.builder()
                .code(-1)
                .success(false)
                .message("Data not found!")
                .build();
    }

    @Override
    public List<StudentDto> get_student() {
        return students;
    }

}
