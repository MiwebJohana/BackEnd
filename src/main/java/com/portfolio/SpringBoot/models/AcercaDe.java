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
public class AcercaDe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idAcercaDe;
     private String infoAcercaDe;

    public AcercaDe() {
    }

    public AcercaDe(int idAcercaDe, String infoAcercaDe) {
        this.idAcercaDe = idAcercaDe;
        this.infoAcercaDe = infoAcercaDe;
    }

  

 

}
