package com.kaf.empmanager.controller;

import com.kaf.empmanager.pojo.Dept;
import com.kaf.empmanager.pojo.Result;
import com.kaf.empmanager.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result getDeptList() {
        try {
             List<Dept> list = deptService.deptList();
             return new Result(200,"success",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"error");
        }
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result addDept(@RequestBody Dept dept) {
        try {
            if(deptService.deptInsert(dept)==true)
            {
                return new Result(200,"success");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"error");
        }
        return new Result(20005,"success");
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result updateDept(@RequestBody Dept dept) {
        try {
            if(deptService.deptUpdate(dept)==true)
            {
                return new Result(200,"success");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"error");
        }
        return new Result(50003,"success");
    }
    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public Result deleteDept(@RequestBody Dept dept) {
        try {
            if(deptService.deptDeleteById(dept.getId())==false)
            {
                return new Result(50003,"success");
            }
            return new Result(200,"success");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(500,"error");
        }
    }
}
