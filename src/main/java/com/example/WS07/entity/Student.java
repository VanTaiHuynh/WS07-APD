package com.example.WS07.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;
    private String email;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
