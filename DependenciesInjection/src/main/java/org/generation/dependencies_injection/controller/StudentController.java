package org.generation.dependencies_injection.controller;

import org.generation.dependencies_injection.model.Student;
import org.generation.dependencies_injection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{

    private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;

    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {
        int studenId = Integer.parseInt(id)-1;
        return studentService.findById(String.valueOf(studenId));
    }

    @GetMapping("/student/list")
    public List<Student> totalUsersList() {
        return studentService.all();
    }
}
