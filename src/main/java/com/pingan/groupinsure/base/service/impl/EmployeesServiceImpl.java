package com.pingan.groupinsure.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pingan.groupinsure.base.domain.Employees;
import com.pingan.groupinsure.base.mapper.EmployeesMapper;
import com.pingan.groupinsure.base.service.IEmployeesService;
@Service("employeesServiceImpl")
public class EmployeesServiceImpl implements IEmployeesService {
	@Autowired
	private EmployeesMapper employeesMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer employeeId) {
		return employeesMapper.deleteByPrimaryKey(employeeId);
	}

	@Override
	public int insert(Employees record) {
		return employeesMapper.insert(record);
	}

	@Override
	public Employees selectByPrimaryKey(Integer employeeId) {
		return employeesMapper.selectByPrimaryKey(employeeId);
	}

	@Override
	public List<Employees> selectAll() {
		return employeesMapper.selectAll();
	}

	@Override
	public int updateByPrimaryKey(Employees record) {
		return employeesMapper.updateByPrimaryKey(record);
	}

}
