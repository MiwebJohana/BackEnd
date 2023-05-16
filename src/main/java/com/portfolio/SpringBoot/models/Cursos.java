package com.portfolio.SpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCursos;


    private String tituloCursos;
    private Date inicioCursos;
    private Date finCursos;
    private String descripcionCursos;

    public Cursos() {
    }

    public Cursos(int idCursos, String tituloCursos, Date inicioCursos, Date finCursos, String descripcionCursos) {
        this.idCursos = idCursos;
        this.tituloCursos = tituloCursos;
        this.inicioCursos = inicioCursos;
        this.finCursos = finCursos;
        this.descripcionCursos = descripcionCursos;
    }

   

}
