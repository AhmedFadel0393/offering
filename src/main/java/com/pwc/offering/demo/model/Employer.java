package com.pwc.offering.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "employer")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

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

    public Employer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employer() {
    }
}
