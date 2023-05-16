package com.portfolio.SpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

//declaramos que es una entidad y le genere los atributos
@Entity
@Getter
@Setter
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idExp;
    private String empresaExp;
    private Date inicioExp;
    private Date finExp;
    private String tareasExp;

//es un constructor vacio
    public Experiencia() {
    }

//es un constructor lleno
//coloque los getters and setters abajo de entity
    public Experiencia(int idExp, String empresaExp, Date inicioExp, Date finExp, String tareasExp) {
        this.idExp = idExp;
        this.empresaExp = empresaExp;
        this.inicioExp = inicioExp;
        this.finExp = finExp;
        this.tareasExp = tareasExp;
    }

}
