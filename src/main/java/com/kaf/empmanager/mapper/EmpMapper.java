package com.kaf.empmanager.mapper;

import com.kaf.empmanager.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface EmpMapper {
    //find
    @Select("select * from empmanager.view_emp where number = #{number}")
    Employee findByNumber(@Param("number") String number);
    //list
    @Select("select * from empmanager.view_emp")
    List<Employee> list();
    //insert
    @Insert("insert into employee (id,employee_id, employee_name, sex, birthday, dept_id, role, entry_date, phone, address, id_card, education, marriage, work_status) VALUES (#{id}, #{number}, #{name}, #{sex}, #{birthday}, #{dept_id}, #{type}, #{entryDate}, #{phone}, #{address}, #{idNumber}, #{education}, #{marriage}, #{workStatus})")
    void insert(@Param("id") String id,
                @Param("number") String number,
                @Param("name") String name,
                @Param("sex") String sex,
                @Param("birthday") Date birthday,
                @Param("dept_id") String dept_id,
                @Param("type") String type,
                @Param("entryDate") Timestamp entryDate,
                @Param("phone") String phone,
                @Param("address") String address,
                @Param("idNumber") String idNumber,
                @Param("education") String education,
                @Param("marriage") String marriage,
                @Param("workStatus") String workStatus
                );
    @Select("select empmanager.dept.id from empmanager.dept where dept_name = #{name}")
    String select_for_insert_dept_name2id(@Param("name") String name);

    @Select("select count(*) from employee where employee_id = #{number}")
    int select_for_insert_count(@Param("number") String number);
    //delete
    @Delete("delete from empmanager.employee where id = #{id}")
    void deleteById(@Param("id") String id);
    //update
    @Update("update employee set employee_id = #{number},employee_name = #{name},sex = #{sex},birthday = #{birthday},dept_id = #{departmentName},role = #{type},phone = #{phone},address = #{address},entry_date = #{entryDate},id_card = #{idNumber},education = #{education},marriage = #{marriage},work_status = #{workStatus} where id = #{id}")
    void update(Employee employee);

    //find by name and dept
    @Select("select * from empmanager.view_emp where name = #{name} and departmentName = (select dept_name from empmanager.dept where dept_id = #{dept_id})")
    List<Employee> empFindByNameAndDepartment(@Param("name") String name, @Param("dept_id") String dept_id);

    @Select("select * from empmanager.view_emp where departmentName = (select dept_name from empmanager.dept where dept_id = #{dept_id})")
    List<Employee> empFindByDepartment(@Param("dept_id")String dept_id);
    @Select("select * from empmanager.view_emp where name = #{name}")
    List<Employee> empFindByName(@Param("name") String name);

    //update password
    @Update("update users set password = #{password} where employee_id = #{number}")
    void updatePassword(@Param("number") String number, @Param("password") String password);
}
