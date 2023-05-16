
package com.portfolio.SpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idlog;
    private String email;
    private String password;

    public Login() {
    }

    public Login(int idlog, String email, String password) {
        this.idlog = idlog;
        this.email = email;
        this.password = password;
    }

 
    

}
