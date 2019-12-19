package com.skyshit.mapper;

import com.skyshit.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM `user`  WHERE id = #{id}")
    User findById(@Param("id") String id);
}