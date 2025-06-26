package com.safronov.spring.mvc.secvice;

import com.safronov.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int empId);

}
