package com.bastian.realestateapp.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */
@Document
@Data
@ToString(exclude = {"id"})
public class Property {

    @Id
    private String id;

    private final  String name;

    private final Type buildType;

    @CreatedDate
    private LocalDate date;

    private final Status publicationStatus;

    private final String info;

    private final List<String> images;

    private final  ConstructionStatus constructionStatus;

    private final int price;

    private final int squareMeters;

    private final Address address;

    private final String agency;

    //TODO IMPLEMENTAR
    private final Rooms rooms;


}
