package com.kaf.empmanager.mapper;

import org.apache.ibatis.annotations.*;

import java.sql.Time;
import java.sql.Timestamp;

@Mapper
public interface AttendanceMapper {
    @Insert("insert into empmanager.attendance (attendance.id, attendance.employee_id, attendance.date, attendance.attendance_on, attendance.attendance_on_status) values (#{id},#{employeeID},#{date}, #{attendanceOnTime}, #{attendanceOnStatus})")
    void insertOn(@Param("id") String id,
                  @Param("employeeID") String employeeID,
                  @Param("date") String date,
                  @Param("attendanceOnTime") Timestamp attendanceOnTime,
                  @Param("attendanceOnStatus") String attendanceOnStatus);

    @Update("update empmanager.attendance set attendance.attendance_off = #{attendanceOffTime}, attendance.attendance_off_status = #{attendanceOffStatus} where attendance.employee_id = #{employeeID} and attendance.date = #{date}")
    void updateOff(@Param("employeeID") String employeeID,
                   @Param("date") String date,
                   @Param("attendanceOffTime") Timestamp attendanceOffTime,
                   @Param("attendanceOffStatus") String attendanceOffStatus);

    void insertLeave(String id, String employeeID, String time, String remark);

    @Select("select count(*) from empmanager.attendance where attendance.employee_id = #{employeeID} and attendance.date = #{date}")
    int select_for_on(String employeeID, String date);
    @Select("select count(*) from empmanager.attendance where attendance.employee_id = #{employeeID} and attendance.date = #{date} and attendance.attendance_off_status is not null")
    int select_for_off(String employeeID, String date);

    @Select("select count(*) from empmanager.attendance where attendance.employee_id = #{employeeID} and attendance.date = #{date} and attendance.remark = 'leave'")
    int select_for_on_leave(String employeeID, String date);
}
