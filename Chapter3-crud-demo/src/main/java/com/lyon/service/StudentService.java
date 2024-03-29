package com.lyon.service;

import com.lyon.domain.Student;
import com.lyon.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
