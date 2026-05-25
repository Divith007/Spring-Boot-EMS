package com.ems.service;

import com.ems.entity.Admin;

public interface AdminService {

    Admin loginAdmin(String username, String password);

}