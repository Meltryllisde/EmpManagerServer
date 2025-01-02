package com.kaf.studentmanager.mapper;

import com.kaf.studentmanager.pojo.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SelectMapper {
    @Select("SELECT student.name,student_course.* " +
            "FROM student_course,student " +
            "where student.ID=student_course.studentID")
    List<Grade> selectAll();


    @Select("SELECT student.name,student_course.* " +
            "FROM student,student_course " +
            "where student_course.studentID = #{id} and student.ID=student_course.studentID")
    List<Grade> selectByConditionStudentID(@Param("id") String id);


    @Select("SELECT student.name,student_course.* " +
            "FROM student,student_course " +
            "where student_course.ID = #{id} and student.ID=student_course.studentID")
    List<Grade> selectByConditionCourseID(@Param("id") String id);


    @Select("SELECT student.name,student_course.* " +
            "FROM student,student_course " +
            "where student_course.term = #{term} and student.ID=student_course.studentID")
    List<Grade> selectByConditionTerm(@Param("term") String term);


    @Select("SELECT student.name,student_course.* " +
            "FROM student,student_course " +
            "where student_course.type = #{type} and student.ID=student_course.studentID")
    List<Grade> selectByConditionType(@Param("type") String type);
}
