package com.example.viewmodelexercise.model;

public class Student {
    String name, nim, email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name, String nim, String email) {
        this.name = name;
        this.nim = nim;
        this.email = email;
    }

    public Student() {
    }
}
