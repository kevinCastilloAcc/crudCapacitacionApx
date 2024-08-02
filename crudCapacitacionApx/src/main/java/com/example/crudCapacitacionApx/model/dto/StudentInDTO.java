package com.example.crudCapacitacionApx.model.dto;

import java.util.Date;

public class StudentInDTO {

    private String name;
    private Date date_of_birth;
    private String grade_average;

    public StudentInDTO() {
    }

    public StudentInDTO(String name, Date date_of_birth, String grade_average) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.grade_average = grade_average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGrade_average() {
        return grade_average;
    }

    public void setGrade_average(String grade_average) {
        this.grade_average = grade_average;
    }

    @Override
    public String toString() {
        return "StudentInDTO{" +
                "name='" + name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", grade_average=" + grade_average +
                '}';
    }
}
