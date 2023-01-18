package com.bastian.realestateapp.service;

import com.bastian.realestateapp.model.User;

import java.util.List;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */
public interface IUserService {

   List<User> findAll();
   User save(User user);

}
