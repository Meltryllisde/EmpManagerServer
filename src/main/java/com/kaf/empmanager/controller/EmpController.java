package com.kaf.empmanager.controller;

import com.kaf.empmanager.pojo.Employee;
import com.kaf.empmanager.pojo.Result;
import com.kaf.empmanager.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmpController {
    @Autowired
    private EmpService empservice;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result getEmployeeList() {
        try {
            return new Result(200, "success", empservice.empList());
        } catch (Exception e) {
            return new Result(500,"error");
        }
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Result addEmployee(@RequestBody Employee employee) {
        try {
            if(empservice.empInsert(employee)==false) {
                return new Result(20000,"success");
            }
        } catch (Exception e) {
            return new Result(500,"error");
        }
        return new Result(200,"success");
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Result updateEmployee(@RequestBody Employee employee) {
        try {
            empservice.empUpdate(employee);
        } catch (Exception e) {
            return new Result(500,"error");
        }
        return new Result(200,"success");
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public Result deleteEmployeeById(@RequestBody Employee employee) {
        try {
            empservice.empDeleteById(employee.getId());
        } catch (Exception e) {
            return new Result(500,"error");
        }
        return new Result(200,"success");
    }

    @RequestMapping(value = "/findByNumber", method = RequestMethod.POST)
    public Result getAllEmployee(@RequestBody Employee employee) {
        try {
            return new Result(200,"success",empservice.empFindByNumber(employee.getNumber()));
        } catch (Exception e) {
            return new Result(500,"error");
        }

    }

    @RequestMapping(value = "/findByNameAndDepartment",method = RequestMethod.POST)
    public Result getEmployeeByNameAndDepartment(@RequestBody Employee employee) {
        try {
            return new Result(200,"success",empservice.empFindByNameAndDepartment(employee.getName(),employee.getDepartmentName()));
        } catch (Exception e) {
            return new Result(500,"error");
        }
    }

    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    public Result updatePassword(@RequestBody Employee employee) {
        try {
            empservice.empUpdatePassword(employee.getNumber(),employee.getpassword());
        } catch (Exception e) {
            return new Result(500,"error");
        }
        return new Result(200,"success");
    }
}
