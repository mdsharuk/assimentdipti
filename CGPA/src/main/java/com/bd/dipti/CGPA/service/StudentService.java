package com.bd.dipti.CGPA.service;

import com.bd.dipti.CGPA.model.Student;
import com.bd.dipti.CGPA.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo studentRepo;
    public void save(Student s){
        studentRepo.save(s);
    }

    public List<Student>studentList(){
      return studentRepo.findAll();
    }

}
