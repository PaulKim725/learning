package com.paul.springboot31.mapper;

import com.paul.springboot31.vo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByName(@Param("name") String name);

    int insert(@Param("name") String name, @Param("age") Integer age);

}
