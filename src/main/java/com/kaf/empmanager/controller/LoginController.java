package com.kaf.empmanager.controller;

import com.kaf.empmanager.pojo.Result;
import com.kaf.empmanager.pojo.User;
import com.kaf.empmanager.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginservice;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(@RequestBody User user) {
        try {
            if (loginservice.login(user.getNumber(),user.getPassword())) {
                return new Result(200,"success");
            }
        } catch (Exception e) {
            return new Result(500,"error");
        }
        return new Result(500,"error");
    }
}
