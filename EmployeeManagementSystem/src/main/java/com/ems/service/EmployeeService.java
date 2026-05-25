package com.ems.service;

import java.util.List;

import com.ems.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(int id);

}