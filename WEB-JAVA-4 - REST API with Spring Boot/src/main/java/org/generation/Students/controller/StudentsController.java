package org.generation.Students.controller;

import org.generation.Students.data.entity.Student;
import org.generation.Students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin( "*" )
@RestController
public class StudentsController {
    private final StudentService studentService;

    public StudentsController(@Autowired StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping( "/students" )
    public Iterable<Student> getStudents()
    {
        return studentService.all();
    }

    @GetMapping( "/student/{id}" )
    public Student getStudent( @PathVariable Integer id )
    {
        return studentService.get(id);
    }

    @PostMapping( "/student" )
    //Request obtiene la información de la URL
    public void newStudent( @RequestBody Student student )
    {
        studentService.save(student);
    }
}
