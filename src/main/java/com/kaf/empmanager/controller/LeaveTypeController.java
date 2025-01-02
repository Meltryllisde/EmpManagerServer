package com.kaf.empmanager.controller;

import com.kaf.empmanager.pojo.Result;
import com.kaf.empmanager.service.LeaveTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leaveType")
public class LeaveTypeController {
    @Autowired
    private LeaveTypeService leaveTypeService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)//查询所有请假类型
    public Result getLeaveTypeList() {
        return new Result(200,"success",leaveTypeService.list());
    }
}
