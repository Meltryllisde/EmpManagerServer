package com.kaf.empmanager.controller;

import com.kaf.empmanager.pojo.Leave;
import com.kaf.empmanager.pojo.Result;
import com.kaf.empmanager.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leave")
public class LeaveController {
    @Autowired
    private LeaveService leaveService;
    @RequestMapping(value = "/insert", method = RequestMethod.POST)//提交员工请假申请
    public Result addLeave(@RequestBody Leave leave) {
        try {
            leaveService.leaveInsert(leave);
        } catch (Exception e) {
            return new Result(500,"error");
        }
        return new Result(200,"success");
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)//查询员工请假申请
    public Result getLeave(@RequestBody Leave leave) {
        try {
            return new Result(200,"success",leaveService.leaveList(leave.getApplyNumber()));
        } catch (Exception e) {
            return new Result(500,"error");
        }
    }

    @RequestMapping(value = "/leave/update", method = RequestMethod.PUT)//批准员工请假申请
    public Result updateLeave(@RequestBody Leave leaveRequest) {

        return new Result(200,"success");
    }
}
