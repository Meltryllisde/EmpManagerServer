package com.kaf.empmanager.service.impl;

import com.kaf.empmanager.mapper.CheckMapper;
import com.kaf.empmanager.pojo.Check;
import com.kaf.empmanager.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class CheckServiceImpl implements CheckService {
    @Autowired
    private CheckMapper checkMapper;
    @Override
    public Check getCheckInfo(Check check) {
        String number = check.getEmployeeID();
        String date = check.getDate();
        String month = check.getMonth().substring(0, 7)+"%";

        Date date_ = convertStringToSqlDate(date);
        check = checkMapper.getCheckInfoA(number,date_,month);
        Check check2 = checkMapper.getCheckInfoL(number,month);
        check.setLeaveDays1(check2.getLeaveDays1());
        check.setLeaveDays2(check2.getLeaveDays2());
        check.setLeaveDays3(check2.getLeaveDays3());
        check.setLeaveDays4(check2.getLeaveDays4());
        check.setLeaveDays5(check2.getLeaveDays5());
        return check;
//        return null;
    }

    @Override
    public List<Check> getCheckInfoByNumber(Check check) {
        return checkMapper.getCheckInfoByNumber(check.getEmployeeID());
    }

    public static Date convertStringToSqlDate(String dateStr) {
        // 定义日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

        // 解析字符串日期
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateStr, formatter);

        // 提取LocalDate部分
        LocalDate localDate = offsetDateTime.toLocalDate();

        // 将LocalDate转换为java.sql.Date
        return Date.valueOf(localDate);
    }
}
