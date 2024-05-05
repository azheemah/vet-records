package com.vetrecords.models;

import java.util.Date;

public class Animal {
    private int id;
    private String name;
    private String type;
    private Date dateOfRegistration;

    public Animal(int id, String name, String type, Date dateOfRegistration) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dateOfRegistration = dateOfRegistration;
    }
}
