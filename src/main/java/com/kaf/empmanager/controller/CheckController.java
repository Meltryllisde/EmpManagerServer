package com.kaf.empmanager.controller;

import com.kaf.empmanager.pojo.Check;
import com.kaf.empmanager.pojo.Result;
import com.kaf.empmanager.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class CheckController {
    @Autowired
    private CheckService checkService;
    @RequestMapping(value = "/getCheckInfo",method = RequestMethod.POST)
    public Result getCheckInfo(@RequestBody Check check) {
        try {
            return new Result(200,"success",checkService.getCheckInfo(check));
        } catch (Exception e) {
            return new Result(500,"error");
        }
    }
    @RequestMapping(value = "/findByNumber",method = RequestMethod.POST)
    public Result getCheckInfoByNumber(@RequestBody Check check) {
        try {
            return new Result(200,"success",checkService.getCheckInfoByNumber(check));
        } catch (Exception e) {
            return new Result(500,"error");
        }
    }

}
