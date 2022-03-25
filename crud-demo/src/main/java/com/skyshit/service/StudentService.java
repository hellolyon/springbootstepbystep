package com.skyshit.service;

import com.skyshit.domain.Student;
import com.skyshit.mapper.StudentMapper;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student findByIdCard(String number) {
        return studentMapper.findById(number);
    }
    public int addInfo(Student student){
        return studentMapper.addInfo(student);
    }
    public int removeInfo(Integer id){
        return studentMapper.deleteById(id);
    }
}
