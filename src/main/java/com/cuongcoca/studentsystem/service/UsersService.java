package com.cuongcoca.studentsystem.service;

import com.cuongcoca.studentsystem.model.Users;

import java.util.List;

public interface UsersService {
    Users saveUsers(Users users);

    List<Users> getAll();
}
