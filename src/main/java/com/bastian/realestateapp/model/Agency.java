package com.bastian.realestateapp.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */
@Document
@Data
@ToString(exclude = {"id"})
public class Agency {

    @Id
    private String id;
    private final String name;
    private final String rut;
    private final String email;
    private final String site;
    private final List<String> phone;
    private final String info;
    private final String image;
    private final boolean isVerified = false;
    private final Address address;
}
