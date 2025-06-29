package com.safronov.spring.mvc.dao;

import com.safronov.spring.mvc.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return sessionFactory.getCurrentSession().get(Employee.class, empId);
    }

    @Override
    public void deleteEmployee(int empId) {

        Query query = sessionFactory.getCurrentSession().createQuery("delete from Employee where id =:id");
        query.setParameter("id", empId);
        query.executeUpdate();
    }
}
