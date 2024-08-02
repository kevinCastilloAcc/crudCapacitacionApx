package com.example.crudCapacitacionApx.model.dto;

import java.util.Date;

public class StudentUpdDTO {
    private Long id;
    private String name;
    private Date date_of_birth;
    private Long grade_average;

    public StudentUpdDTO() {

    }

    public StudentUpdDTO(Long id, String name, Date date_of_birth, Long grade_average) {
        this.id = id;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.grade_average = grade_average;
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Long getGrade_average() {
        return grade_average;
    }

    public void setGrade_average(Long grade_average) {
        this.grade_average = grade_average;
    }

    @Override
    public String toString() {
        return "StudentUpdDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", dateAverage=" + grade_average +
                '}';
    }
}
