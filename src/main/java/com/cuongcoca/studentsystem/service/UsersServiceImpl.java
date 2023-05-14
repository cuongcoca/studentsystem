package com.cuongcoca.studentsystem.service;

import com.cuongcoca.studentsystem.model.Users;
import com.cuongcoca.studentsystem.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Users saveUsers(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public List<Users> getAll() {
        return usersRepository.findAll();
    }
}
