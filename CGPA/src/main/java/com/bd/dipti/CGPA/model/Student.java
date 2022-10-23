package com.bd.dipti.CGPA.model;

import lombok.AllArgsConstructor;
;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 30)
    private String name;
    @Column(nullable = false,length = 30)
    private String email;
    @Column(nullable = false,length = 10)
    private Character Section;
    @Column(nullable = false,length = 20)
    private double cgpa;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getSection() {
        return Section;
    }

    public void setSection(Character section) {
        Section = section;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Section=" + Section +
                ", cgpa=" + cgpa +
                '}';
    }
}
