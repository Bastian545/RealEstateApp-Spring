package com.bastian.realestateapp.model;

import lombok.*;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Address {

    private String region;
    private String city;
    private String municipality;
    private String address;
    private float latitude;
    private float longitude;
}
