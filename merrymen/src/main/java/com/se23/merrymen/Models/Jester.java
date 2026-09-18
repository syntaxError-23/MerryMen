package com.se23.merrymen.Models;
import jakarta.persistence.*;

@Entity
@Table(name = "jesters")
public class Jester extends User{

    private String role;

    public Jester(String role, String username, String password, String dob, String country, String city){
        super(username, password, dob, country, city);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
