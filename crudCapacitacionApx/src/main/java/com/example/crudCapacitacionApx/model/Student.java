package com.example.crudCapacitacionApx.model;

import java.sql.Date;
import java.time.LocalDateTime;


public class Student {

    private Long id;
    private String name;
    private Date dateOfBirth;
    private Long dateAverage;

    public Student() {

    }

    public Student(Long id, String name, Date dateOfBirth, Long dateAverage) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateAverage = dateAverage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getDateAverage() {
        return dateAverage;
    }

    public void setDateAverage(Long dateAverage) {
        this.dateAverage = dateAverage;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateAverage=" + dateAverage +
                '}';
    }
}
