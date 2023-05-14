package com.cuongcoca.studentsystem.controller;

import com.cuongcoca.studentsystem.model.Users;
import com.cuongcoca.studentsystem.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/add")
    public String addUser(@RequestBody Users users){
        usersService.saveUsers(users);
        return "Add user success";
    }

    @RequestMapping("/getAll")
    public List<Users> getAll(){
        return usersService.getAll();
    }

}
