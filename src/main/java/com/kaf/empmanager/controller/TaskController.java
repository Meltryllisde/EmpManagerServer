package com.kaf.empmanager.controller;

import com.kaf.empmanager.pojo.Leave;
import com.kaf.empmanager.pojo.Result;

import com.kaf.empmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @RequestMapping(value = "/list", method = RequestMethod.POST)//查询员工请假申请
    public Result getLeave(@RequestBody Leave leave) {
        try {
            return new Result(200,"success",taskService.leaveList());
        } catch (Exception e) {
            return new Result(500,"error");
        }
    }
    @RequestMapping(value = "/findByApplyID", method = RequestMethod.POST)
    public Result findByApplyID(@RequestBody Leave leave) {
        try {
            return new Result(200,"success",taskService.findByApplyID(leave.getId()));
        } catch (Exception e) {
            return new Result(500,"error");
        }
    }
    @RequestMapping(value = "/approval", method = RequestMethod.POST)
    public Result approval(@RequestBody Leave leave) {
        try {
            taskService.approval(leave);
            return new Result(200,"success");
        } catch (Exception e) {
            return new Result(500,"error");
        }
    }
}
