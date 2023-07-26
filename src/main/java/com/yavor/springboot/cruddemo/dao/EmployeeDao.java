package com.yavor.springboot.cruddemo.dao;

import com.yavor.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
