package com.kaf.studentmanager.controller;

import com.kaf.studentmanager.pojo.Result;
import com.kaf.studentmanager.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertController {
    @RequestMapping(value = "/teacher/insert/student",method = RequestMethod.POST)
    public Result insertStudent(){
        /*
          TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/teacher/insert/grade",method = RequestMethod.POST)
    public Result insertGrade(){
        /*
          TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/admin/insert/user",method = RequestMethod.POST)
    public Result insertUser(){
        /*
          TODO
         */
        return new Result(400,"failed");
    }
}
