package com.kaf.studentmanager.controller;

import com.kaf.studentmanager.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {
    @RequestMapping(value = "/teacher/delete/student",method = RequestMethod.DELETE)
    public Result deleteStudent(){
        /*
         *TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/teacher/delete/grade",method = RequestMethod.DELETE)
    public Result deleteGrade(){
        /*
         *TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/admin/delete/user",method = RequestMethod.DELETE)
    public Result deleteUser(){
        /*
         *TODO
         */
        return new Result(400,"failed");
    }

}
