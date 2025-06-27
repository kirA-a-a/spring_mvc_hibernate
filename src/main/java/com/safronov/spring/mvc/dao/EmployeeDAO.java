package com.safronov.spring.mvc.dao;

import com.safronov.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int empId);

    public void deleteEmployee(int empId);
}
