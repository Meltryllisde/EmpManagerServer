package com.kaf.studentmanager.service.impl;

import com.kaf.studentmanager.mapper.SelectMapper;
import com.kaf.studentmanager.pojo.Grade;
import com.kaf.studentmanager.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectServiceImpl implements SelectService {
    @Autowired
    private SelectMapper selectMapper;

    @Override
    public List<Grade> selectAllGrades() {
        return selectMapper.selectAll();
    }
    @Override
    public List<Grade> selectGradesByCondition(String key, String value) {
        return switch (key) {
            case "StudentID" -> selectMapper.selectByConditionStudentID(value);
            case "CourseID" -> selectMapper.selectByConditionCourseID(value);
            case "Term" -> selectMapper.selectByConditionTerm(value);
            case "Type" -> selectMapper.selectByConditionType(value);
            default -> null;
        };
    }
}
