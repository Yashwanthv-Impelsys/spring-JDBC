package org.impelsys.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper {
	
	public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
		//System.out.println("hi");
		Employee emp=new Employee();
		emp.setEmpId(rs.getInt("emp_id"));
		emp.setEmpName(rs.getString("emp_name"));
		emp.setAge(rs.getInt("age"));
		emp.setEmpPhoneNum(rs.getString("empPhoneNum"));
		emp.setGender(rs.getString("gender"));
		return emp;
	}

}
