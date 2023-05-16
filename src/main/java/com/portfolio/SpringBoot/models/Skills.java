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
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSkill;
    private String nombreSkill;
    private String porcentajeSkill;

    public Skills() {
    }

    public Skills(int idSkill, String nombreSkill, String porcentajeSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentajeSkill;
    }

}
