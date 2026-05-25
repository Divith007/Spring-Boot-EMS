package com.ems.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Admin;
import com.ems.repository.AdminRepository;
import com.ems.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin loginAdmin(String username, String password) {

        Admin admin = adminRepository.findByUsername(username);

        if(admin != null && admin.getPassword().equals(password)) {
            return admin;
        }

        return null;
    }

}