package com.kaf.empmanager.mapper;

import com.kaf.empmanager.pojo.LeaveType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LeaveTypeMapper {
    @Select("select * from empmanager.`leave_type`")
    List<LeaveType> list();
}
