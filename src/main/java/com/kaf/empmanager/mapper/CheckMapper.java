package com.kaf.empmanager.mapper;

import com.kaf.empmanager.pojo.Check;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
@Mapper
public interface CheckMapper {
    @Select("select " +
            "DAY(LAST_DAY(#{date})) as workDays, " +
            " ifnull(sum(case when attendance.remark = 'leave' then 0 else 1 end),0) as checkDays, " +
            " ifnull(sum(case when attendance.attendance_on_status = '迟到' then 1 else 0 end),0) as lateDays," +
            " ifnull(sum(case when attendance.attendance_off_status = '早退' then 1 else 0 end),0) as leaveEarlyDays" +
            " from empmanager.attendance where attendance.date like #{month} and attendance.employee_id = #{number}")
    Check getCheckInfoA(String number, Date date, String month);
    @Select("select " +
            "ifnull(sum(case when `leave`.type_id = '2' then CONVERT(`leave`.duration, SIGNED) else 0 end), 0) as leaveDays1, " +
            "ifnull(sum(case when `leave`.type_id = '5' then CONVERT(`leave`.duration, SIGNED) else 0 end), 0) as leaveDays5, " +
            "ifnull(sum(case when `leave`.type_id = '3' then CONVERT(`leave`.duration, SIGNED) else 0 end), 0) as leaveDays2, " +
            "ifnull(sum(case when `leave`.type_id = '1' then CONVERT(`leave`.duration, SIGNED) else 0 end), 0) as leaveDays3, " +
            "ifnull(sum(case when `leave`.type_id = '4' then CONVERT(`leave`.duration, SIGNED) else 0 end), 0) as leaveDays4 " +
            "from `leave` where `leave`.applicant_id = #{number} and `leave`.begin_time like #{month}")
    Check getCheckInfoL(String number, String month);
    @Select("select empmanager.attendance.date, empmanager.attendance.attendance_on as checkOnTime, empmanager.attendance.attendance_off as checkOffTime, empmanager.attendance.attendance_on_status as checkOnStatus, empmanager.attendance.attendance_off_status as checkOffStatus from empmanager.attendance where empmanager.attendance.employee_id = #{number}  order by empmanager.attendance.date desc")
    List<Check> getCheckInfoByNumber(String number);
}
