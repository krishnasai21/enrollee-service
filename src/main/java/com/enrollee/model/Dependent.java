package com.enrollee.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.sql.Date;


public class Dependent {
    @Id
    private Integer id;

    private String name;


    private Date dateOfBirth;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
