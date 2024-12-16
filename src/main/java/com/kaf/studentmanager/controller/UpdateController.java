package com.kaf.studentmanager.controller;

import com.kaf.studentmanager.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {
    @RequestMapping(value = "/teacher/update/grade",method = RequestMethod.POST)
    public Result updateGrade() {
        /*
         *TODO
         */
        return new Result(400,"failed");
    }
    @RequestMapping(value = "/teacher/update/student",method = RequestMethod.POST)
    public Result updateStudent() {
        /*
         *TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/admin/update",method = RequestMethod.POST)
    public Result updateUser() {
        /*
         *TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/student/update/user",method = RequestMethod.POST)
    public Result updateSUser() {
        /*
         *TODO
         */
        return new Result(400,"failed");
    }

    @RequestMapping(value = "/teacher/update/user",method = RequestMethod.POST)
    public Result updateTUser() {
        /*
         *TODO
         */
        return new Result(400,"failed");
    }
}
