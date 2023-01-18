package com.bastian.realestateapp.controller;

import com.bastian.realestateapp.model.User;
import com.bastian.realestateapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */

@RestController
@RequestMapping("/real")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/users")
    List<User> fetchAll(){
        return userService.findAll();
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    User newUser(@RequestBody User newUser){
        return userService.save(newUser);
    }

}
