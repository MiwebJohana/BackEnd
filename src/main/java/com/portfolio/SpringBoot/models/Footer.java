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
public class Footer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFooter;
    private String firmaFooter;
    private String celularFooter;

    public Footer() {
    }

    public Footer(int idFooter, String firmaFooter, String celularFooter) {
        this.idFooter = idFooter;
        this.firmaFooter = firmaFooter;
        this.celularFooter = celularFooter;
    }

    

  
  

}
