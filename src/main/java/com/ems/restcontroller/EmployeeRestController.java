package com.ems.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id)
    {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id,
                                   @RequestBody Employee employee)
    {
        Employee existingEmployee =
                employeeService.getEmployeeById(id);

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setPhone(employee.getPhone());

        return employeeService.updateEmployee(existingEmployee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        employeeService.deleteEmployee(id);

        return "Employee Deleted Successfully";
    }

}