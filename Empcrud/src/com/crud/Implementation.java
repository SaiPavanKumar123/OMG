package com.crud;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class Implementation implements EmpInterface {
	JdbcTemplate jdbc;
	private final String SQL_GET_ALL = "select * from reshma_emp";

	int index = 0;

	@Autowired
	public Implementation(DataSource dataSource) {
		jdbc = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return jdbc.query(SQL_GET_ALL, new EmpDAO());
	}

	// public Employee getEmp(String click) {
	// List<Employee> emp = listAll();
	// if ("first".equals(click)) {
	// index = 0;
	//
	// } else if ("next".equals(click)) {
	// if (index < emp.size() - 1) {
	// index += 1;
	// }
	// } else if ("prev".equals(click)) {
	// if (index > 0) {
	// index -= 1;
	// }
	// } else if ("last".equals(click)) {
	// index = emp.size() - 1;
	// }
	// return (Employee) jdbc.query(SQL_GET_ALL + emp.get(index), new EmpDAO());
	// }

	private List<Employee> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}