package com.example.crudCapacitacionApx.model;

import com.example.crudCapacitacionApx.model.dto.StudentInDTO;
import com.example.crudCapacitacionApx.model.dto.StudentUpdDTO;

import java.sql.Date;
import java.time.LocalDateTime;


public class Student {

    private Long id;
    private String name;
    private java.util.Date dateOfBirth;
    private Long dateAverage;

    public Student() {

    }

    public Student(Long id, String name, Date dateOfBirth, Long dateAverage) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateAverage = dateAverage;
    }

    public Student(StudentInDTO studentInDTO) {
        this.name = studentInDTO.getName();
        this.dateOfBirth = studentInDTO.getDate_of_birth();
        this.dateAverage = Long.valueOf(studentInDTO.getGrade_average());
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

    public java.util.Date getDateOfBirth() {
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

    public void updateData(StudentUpdDTO studentUpdDTO) {
        if (studentUpdDTO.getName() != null) {
            this.name = studentUpdDTO.getName();
        }
        if (studentUpdDTO.getDate_of_birth() != null) {
            this.dateOfBirth = studentUpdDTO.getDate_of_birth();
        }
        if (studentUpdDTO.getGrade_average() != null) {
            this.dateAverage = studentUpdDTO.getGrade_average();
        }
    }
}
