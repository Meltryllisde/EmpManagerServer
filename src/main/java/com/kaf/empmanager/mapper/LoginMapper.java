package com.kaf.empmanager.mapper;

import com.kaf.empmanager.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("SELECT * FROM users WHERE employee_id = #{username} AND password = #{password}")
    public User login(String username, String password);
}
