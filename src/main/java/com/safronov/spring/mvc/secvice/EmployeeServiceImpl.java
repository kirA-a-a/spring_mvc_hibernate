package com.safronov.spring.mvc.secvice;

import com.safronov.spring.mvc.dao.EmployeeDAOImpl;
import com.safronov.spring.mvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAOImpl employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int empId) {
        return employeeDAO.getEmployeeById(empId);
    }

    @Override
    @Transactional
    public void deleteEmployee(int empId) {
        employeeDAO.deleteEmployee(empId);
    }
}
