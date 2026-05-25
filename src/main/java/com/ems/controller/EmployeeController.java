package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpSession;
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String getAllEmployees(Model model, HttpSession session)
    {
        if(session.getAttribute("admin") == null)
        {
            return "redirect:/";
        }

        model.addAttribute("employees", employeeService.getAllEmployees());

        return "admin/employee-list";
    }

    @GetMapping("/addEmployee")
    public String addEmployeePage(Model model, HttpSession session)
    {
        if(session.getAttribute("admin") == null)
        {
            return "redirect:/";
        }

        Employee employee = new Employee();

        model.addAttribute("employee", employee);

        return "admin/add-employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee)
    {
        employeeService.saveEmployee(employee);

        return "redirect:/employees";
    }
    @GetMapping("/editEmployee/{id}")
    public String editEmployee(@PathVariable int id,
                               Model model,
                               HttpSession session)
    {
        if(session.getAttribute("admin") == null)
        {
            return "redirect:/";
        }

        Employee employee = employeeService.getEmployeeById(id);

        model.addAttribute("employee", employee);

        return "admin/update-employee";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute("employee") Employee employee)
    {
        employeeService.updateEmployee(employee);

        return "redirect:/employees";
    }
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id,
                                 HttpSession session)
    {
        if(session.getAttribute("admin") == null)
        {
            return "redirect:/";
        }

        employeeService.deleteEmployee(id);

        return "redirect:/employees";
    } 

}