package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ems.entity.Admin;
import com.ems.service.AdminService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public String loginPage(HttpSession session)
    {
        if(session.getAttribute("admin") != null)
        {
            return "redirect:/dashboard";
        }

        return "common/login";
    }

    @PostMapping("/adminLogin")
    public String adminLogin(@RequestParam String username,
                             @RequestParam String password,
                             Model model,
                             HttpSession session)
    {

        Admin admin = adminService.loginAdmin(username, password);

        if(admin != null)
        {
            session.setAttribute("admin", admin);

            return "redirect:/dashboard";
        }

        model.addAttribute("error", "Invalid Username or Password");

        return "common/login";
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session)
    {
        if(session.getAttribute("admin") == null)
        {
            return "redirect:/";
        }

        return "admin/dashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session)
    {
        session.invalidate();

        return "redirect:/";
    }

}