package com.kaf.empmanager.controller;

import com.kaf.empmanager.pojo.Attendance;
import com.kaf.empmanager.pojo.Result;
import com.kaf.empmanager.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;
    @RequestMapping(value = "/getAttendanceOn", method = RequestMethod.POST)
    public Result getAttendanceOn(@RequestBody Attendance attendance) {
        try {
            return new Result(200, "success", attendanceService.getAttendanceOn(attendance));
        } catch (Exception e) {
            return new Result(500, "error");
        }
    }
    @RequestMapping(value = "/getAttendanceOff", method = RequestMethod.POST)
    public Result getAttendanceOff(@RequestBody Attendance attendance) {
        try {
            return new Result(200, "success", attendanceService.getAttendanceOff(attendance));
        } catch (Exception e) {
            return new Result(500, "error");
        }
    }
    @RequestMapping(value = "/attendanceOn", method = RequestMethod.POST)
    public Result AttendanceOn(@RequestBody Attendance attendance) {
        try {
            attendanceService.AttendanceOn(attendance);
        } catch (Exception e) {
            return new Result(500, "error");
        }
        return new Result(200, "success", null);
    }
    @RequestMapping(value = "/attendanceOff", method = RequestMethod.POST)
    public Result AttendanceOff(@RequestBody Attendance attendance) {
        try {
            attendanceService.AttendanceOff(attendance);
        } catch (Exception e) {
            return new Result(500, "error");
        }
        return new Result(200, "success", null);
    }
}
