package com.example.springbootfirstapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private  final StudentService _studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        _studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents()
    {
        return _studentService.getStudents();
    }
    @GetMapping("get")
    public  String get()
    {
        return _studentService.getStudents().toString();
    }
// для того что бы создать dep injection we have to
// add атрибут @Autowired к конструктору и @Service к сервису
}
