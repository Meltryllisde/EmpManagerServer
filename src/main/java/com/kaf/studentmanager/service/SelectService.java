package com.kaf.studentmanager.service;

import com.kaf.studentmanager.pojo.Grade;

import java.util.List;

public interface SelectService {
    List<Grade> selectAllGrades();
    List<Grade> selectGradesByCondition(String key, String value);
}
