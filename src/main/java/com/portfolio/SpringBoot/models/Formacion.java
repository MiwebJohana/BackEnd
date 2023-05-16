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
public class Formacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idForm;
    private String empresaForm;
    private Date inicioForm;
    private Date finForm;
    private String tareasForm;

    public Formacion() {
    }

    public Formacion(Long idForm, String empresaForm, Date inicioForm, Date finForm, String tareasForm) {
        this.idForm = idForm;
        this.empresaForm = empresaForm;
        this.inicioForm = inicioForm;
        this.finForm = finForm;
        this.tareasForm = tareasForm;
    }


}
