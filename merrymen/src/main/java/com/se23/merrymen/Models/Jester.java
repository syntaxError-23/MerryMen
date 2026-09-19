package com.se23.merrymen.Models;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "jesters")
public class Jester extends User{



    public Jester(String username, String password, LocalDate dob, String country, String city){
        super(username, password, dob, country, city, Role.JESTER);
    }

    public Jester(){} //no-args constructor - required by JPA


}
