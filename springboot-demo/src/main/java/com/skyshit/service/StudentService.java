package com.skyshit.service;

import com.skyshit.domain.Student;
import com.skyshit.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student findByIdCard(String number) {
        return studentMapper.findById(number);
    }
}
