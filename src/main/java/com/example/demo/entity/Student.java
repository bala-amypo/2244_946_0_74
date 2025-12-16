package com.example.demo.entity;
import jakarta.persistence.*;


public class Student{
    private long id;
    private String name;
    private Sting email;
    private float cgpa;

    public int getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getId(){
        return name;
    }
    public void setId(String name){
        this.name=name;
    }
    public String getId(){
        return email;

    }
    public void setId(String email){
        this.email=email;
    }
    public float getId(){
        return cgpa;
    }
    public void setId(float cgpa){
        this.cgpa=cgpa;

    }
    public Student(int id, String name, String email, float cgpa) {
        this.id = id;
        this.name = stuname;
        this.email = stuemail;
        this.cgpa = cgpa;
    }
    public Student() {
    }

}