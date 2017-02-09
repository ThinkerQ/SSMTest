package com.pingan.groupinsure.base.service;

import java.util.List;

import com.pingan.groupinsure.base.domain.Employees;

public interface IEmployeesService {
	int deleteByPrimaryKey(Integer employeeId);

    int insert(Employees record);

    Employees selectByPrimaryKey(Integer employeeId);

    List<Employees> selectAll();

    int updateByPrimaryKey(Employees record);
}
