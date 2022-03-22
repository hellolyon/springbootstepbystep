package com.skyshit.controller;

import com.skyshit.domain.Student;
import com.skyshit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Student findByIdCard(@RequestParam( value = "idCard", required = true) String idCard){
        Student student = studentService.findByIdCard(idCard);
        return student;
    }

}
