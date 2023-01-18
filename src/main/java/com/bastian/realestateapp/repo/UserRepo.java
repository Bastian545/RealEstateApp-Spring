package com.bastian.realestateapp.repo;

import com.bastian.realestateapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */
public interface UserRepo extends MongoRepository<User,String> {
}
