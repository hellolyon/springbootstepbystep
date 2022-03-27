package com.lyon.mapper;

import com.lyon.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM `student` WHERE number = #{number}")
    Student findById(@Param("number") String number);

    @Insert("INSERT INTO student(type,number,name,check_result,check_time,is_close_contact,status) VALUES(#{type}, #{number}, #{name}, #{checkResult}, #{checkTime}, #{isCloseContact}, #{status})")
    int addInfo(Student student);

    @Delete("delete from student where id =#{id}")
    int deleteById(Integer id);
}