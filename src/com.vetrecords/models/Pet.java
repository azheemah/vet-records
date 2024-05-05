package com.vetrecords.models;

public class Pet extends Animal {
    private Person owner;

    public Pet(int id, String name, String type, Date dateOfRegistration, Person owner) {
        super(id, name, type, dateOfRegistration);
        this.owner = owner;
    }
}
