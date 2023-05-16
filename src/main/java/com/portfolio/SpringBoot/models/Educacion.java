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
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEdu;
    private String nombreEdu;
    private String tituloEdu;
    private Date inicioEdu;
    private Date finEdu;
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(int idEdu, String nombreEdu, String tituloEdu, Date inicioEdu, Date finEdu, String imgEdu) {
        this.idEdu = idEdu;
        this.nombreEdu = nombreEdu;
        this.tituloEdu = tituloEdu;
        this.inicioEdu = inicioEdu;
        this.finEdu = finEdu;
        this.imgEdu = imgEdu;
    }
    
    


}
