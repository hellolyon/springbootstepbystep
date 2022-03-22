package com.skyshit.mapper;

import com.skyshit.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM `student` WHERE number = #{number}")
    Student findById(@Param("number") String number);
}