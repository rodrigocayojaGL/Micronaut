package com.example.hellomicronaut.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class PersonDTO {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private String age;

    public PersonDTO(String name, String lastName, String age){
        this.age = age;
        this.lastName = lastName;
        this.name = name;
    }

    public PersonDTO() {

    }

    public String getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
