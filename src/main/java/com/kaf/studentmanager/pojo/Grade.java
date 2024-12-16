package com.kaf.studentmanager.pojo;

import java.util.List;

public class Grade {
    private String  StudentName;//0
    private String  StudentID;//1

    private Integer CourseNormalGrade;//平时分2
    private Integer CourseExamGrade;//考试分3
    private Integer CourseGrade;//总成绩4
    private String  CourseTerm;//学年学期5
    private String  CourseName;//课程名6
    private String  CourseID;//课程号7
    private String  CourseType;//必修选修8
    private Integer CourseCredit;//学分9
    private String  CourseTime;//课时10
    private String  CourseExamTime;//考试时间11
    private String  CourseGradeType;//重修初修12
    private String  CourseExamType;//考试类型13
    private String  CourseDepartment;//开课单位14
    private String  CourseEffectiveness;//成绩有效性15
    private String  CourseSpecialty;//特殊原因16
    //Getter

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public Integer getCourseNormalGrade() {
        return CourseNormalGrade;
    }

    public Integer getCourseExamGrade() {
        return CourseExamGrade;
    }

    public Integer getCourseGrade() {
        return CourseGrade;
    }

    public String getCourseTerm() {
        return CourseTerm;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getCourseID() {
        return CourseID;
    }

    public String getCourseType() {
        return CourseType;
    }

    public Integer getCourseCredit() {
        return CourseCredit;
    }

    public String getCourseTime() {
        return CourseTime;
    }

    public String getCourseExamTime() {
        return CourseExamTime;
    }

    public String getCourseGradeType() {
        return CourseGradeType;
    }

    public String getCourseExamType() {
        return CourseExamType;
    }

    public String getCourseDepartment() {
        return CourseDepartment;
    }

    public String getCourseEffectiveness() {
        return CourseEffectiveness;
    }

    public String getCourseSpecialty() {
        return CourseSpecialty;
    }

    //Setter

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public void setCourseNormalGrade(Integer courseNormalGrade) {
        CourseNormalGrade = courseNormalGrade;
    }

    public void setCourseExamGrade(Integer courseExamGrade) {
        CourseExamGrade = courseExamGrade;
    }

    public void setCourseGrade(Integer courseGrade) {
        CourseGrade = courseGrade;
    }

    public void setCourseTerm(String courseTerm) {
        CourseTerm = courseTerm;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public void setCourseType(String courseType) {
        CourseType = courseType;
    }

    public void setCourseCredit(Integer courseCredit) {
        CourseCredit = courseCredit;
    }

    public void setCourseTime(String courseTime) {
        CourseTime = courseTime;
    }

    public void setCourseExamTime(String courseExamTime) {
        CourseExamTime = courseExamTime;
    }

    public void setCourseGradeType(String courseGradeType) {
        CourseGradeType = courseGradeType;
    }

    public void setCourseExamType(String courseExamType) {
        CourseExamType = courseExamType;
    }

    public void setCourseDepartment(String courseDepartment) {
        CourseDepartment = courseDepartment;
    }

    public void setCourseEffectiveness(String courseEffectiveness) {
        CourseEffectiveness = courseEffectiveness;
    }

    public void setCourseSpecialty(String courseSpecialty) {
        CourseSpecialty = courseSpecialty;
    }

    //构造

    public Grade(String studentName, String studentID, Integer courseNormalGrade, Integer courseExamGrade, Integer courseGrade, String courseTerm, String courseName, String courseID, String courseType, Integer courseCredit, String courseTime, String courseExamTime, String courseGradeType, String courseExamType, String courseDepartment, String courseEffectiveness, String courseSpecialty) {
        StudentName = studentName;
        StudentID = studentID;
        CourseNormalGrade = courseNormalGrade;
        CourseExamGrade = courseExamGrade;
        CourseGrade = courseGrade;
        CourseTerm = courseTerm;
        CourseName = courseName;
        CourseID = courseID;
        CourseType = courseType;
        CourseCredit = courseCredit;
        CourseTime = courseTime;
        CourseExamTime = courseExamTime;
        CourseGradeType = courseGradeType;
        CourseExamType = courseExamType;
        CourseDepartment = courseDepartment;
        CourseEffectiveness = courseEffectiveness;
        CourseSpecialty = courseSpecialty;
    }
}
