package com.springbootsample.entity;

import org.springframework.data.annotation.Id;
import java.util.HashMap;

public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private HashMap property;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap getProperty() {
        return property;
    }

    public void setProperty(HashMap property) {
        this.property = property;
    }
}
