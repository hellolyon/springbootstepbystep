package com.lyon.controller;

import com.lyon.domain.Student;
import com.lyon.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/info/{idCard}",method = RequestMethod.GET)
    public Student getInfo(@PathVariable("idCard") String idCard){
        return studentService.findByIdCard(idCard);
    }

    @RequestMapping(value = "/addInfo",method = RequestMethod.POST)
    public String addInfo(@RequestBody Student student) {
        int result = studentService.addInfo(student);
        return result == 0 ? "插入失败！" : "插入成功！";
    }

    @RequestMapping(value = "/removeInfo/{id}",method = RequestMethod.DELETE)
    public String removeInfo(@PathVariable(value = "id") Integer id) {
        int result = studentService.removeInfo(id);
        return result == 0 ? "删除失败！" : "删除成功！";
    }

}
