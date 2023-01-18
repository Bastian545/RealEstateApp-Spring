package com.bastian.realestateapp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */

@Document
@Getter
@Setter
@ToString(exclude = "id")

public class User {

    @Id
    private String id;
    private  String name;
    private  String lastName;
    private  String run;
    private  String email;
    private  String phone;
    private  boolean isVerified = false;
    private  String password;


    public User(String name, String lastName, String run, String email, String phone, String password) {
        this.name = name;
        this.lastName = lastName;
        this.run = run;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
