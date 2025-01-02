package com.kaf.empmanager.mapper;

import com.kaf.empmanager.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select id as id, dept_id as number,dept_name as name,headcount as quantity from empmanager.dept")
    List<Dept> list();

    @Select("select count(*) from empmanager.dept where dept_id = #{number}")
    int selectByNumber(@Param("number")String number);

    @Insert("insert into empmanager.dept values (#{id},#{number},#{name},#{quantity})")
    void insert(Dept dept);

    @Update("update empmanager.dept set dept_name = #{name}, dept_id = #{number} where id = #{id}")
    void update(@Param("id")String id, @Param("number") String number, @Param("name") String name);

    @Select("select count(*) from empmanager.employee where dept_id = #{number}")
    int selectByNumber_for_delete(@Param("number") String number);
    @Delete("delete from empmanager.dept where id = #{id}")
    void deleteById(@Param("id") String id);
}
