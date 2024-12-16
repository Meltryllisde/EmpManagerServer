package com.kaf.studentmanager.controller;


import com.kaf.studentmanager.pojo.Grade;
import com.kaf.studentmanager.pojo.Result;
import com.kaf.studentmanager.pojo.Select;
import com.kaf.studentmanager.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelectController {
    @Autowired
    private SelectService selectService;

    @RequestMapping(value = "/student/select/grade",method = RequestMethod.POST)
    public Result selectStudentGrade(@RequestBody Select select) {
        String user_id = select.getId();
        List<Grade> grades = selectService.selectGradesByCondition("StudentID",user_id);
        return new Result(200,"success",grades);
    }

    @RequestMapping(value = "/teacher/select/grade",method = RequestMethod.POST)
    public Result selectTeacherGrade(@RequestBody Select select){
        if(select.getType().equals("all"))
        {
            List<Grade> grades = selectService.selectAllGrades();
            return new Result(200,"success",grades);
        }
        else if(select.getType().equals("condition")) {
            List<Grade> grades = selectService.selectGradesByCondition(select.getKey(), select.getValue());
            if(grades!=null)return new Result(200,"success",grades);
            else return new Result(400,"failed");
        }
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/teacher/select/student",method = RequestMethod.POST)
    public Result selectStudent(@RequestBody Select select){
        /*
         *TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(@RequestBody Select select){
        /*
         *TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/admin/select",method = RequestMethod.POST)
    public Result selectUser(@RequestBody Select select){
        /*
         *TODO
         */
        return new Result(400,"failed");
    }
}
