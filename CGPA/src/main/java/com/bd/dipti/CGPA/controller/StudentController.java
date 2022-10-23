package com.bd.dipti.CGPA.controller;

import com.bd.dipti.CGPA.model.Student;
import com.bd.dipti.CGPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student")
    public String showallStudent(Model model){
        List<Student>list=studentService.studentList();
        model.addAttribute("list" ,list);
        return "studentlist";

    }
    @GetMapping("/newstudent")
    public String newStudent(Model model){
        model.addAttribute("Student",new Student());
        return "studentSave";
    }

}
