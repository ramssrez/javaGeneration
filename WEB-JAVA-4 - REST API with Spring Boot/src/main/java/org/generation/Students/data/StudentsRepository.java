package org.generation.Students.data;

import org.generation.Students.data.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface StudentsRepository
    extends CrudRepository<Student, Integer>
{

    Student findById( int id );
    //ArrayList<Student> findAll();
}
