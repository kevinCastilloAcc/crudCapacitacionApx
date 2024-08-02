package com.example.crudCapacitacionApx.model.dto;

import java.util.Date;

public class StudentOutDTO {
    private Long id;
    private String name;
    private Long dateAverage;

    public StudentOutDTO() {
    }

    public StudentOutDTO(Long id, String name, Long dateAverage) {
        this.id = id;
        this.name = name;
        this.dateAverage = dateAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getDateAverage() {
        return dateAverage;
    }

    public void setDateAverage(Long dateAverage) {
        this.dateAverage = dateAverage;
    }

    @Override
    public String toString() {
        return "StudentOutDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateAverage=" + dateAverage +
                '}';
    }
}
