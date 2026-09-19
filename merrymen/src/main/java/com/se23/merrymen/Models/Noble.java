package com.se23.merrymen.Models;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "nobles")
public class Noble extends User{

    private boolean thirst;

    public Noble(String username, String password, LocalDate dob, String country, String city, boolean thirst){
        super(username, password, dob, country, city, Role.NOBLE);
        this.thirst = thirst;
    }

    public Noble(){} //no-args constructor - required by JPA

    public boolean isThirst() {
        return thirst;
    }

    public void setThirst(boolean thirst) {
        this.thirst = thirst;
    }
}
