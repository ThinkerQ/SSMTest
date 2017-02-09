package com.pingan.groupinsure.base.mapper;

import com.pingan.groupinsure.base.domain.Employees;
import java.util.List;

public interface EmployeesMapper {
    int deleteByPrimaryKey(Integer employeeId);

    int insert(Employees record);

    Employees selectByPrimaryKey(Integer employeeId);

    List<Employees> selectAll();

    int updateByPrimaryKey(Employees record);
}