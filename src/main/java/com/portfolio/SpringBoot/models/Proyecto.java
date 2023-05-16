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
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProyecto;
    private String tituloProyecto;
    private String descProyecto;

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String tituloProyecto, String descProyecto) {
        this.idProyecto = idProyecto;
        this.tituloProyecto = tituloProyecto;
        this.descProyecto = descProyecto;
    }

    public void setDescripcionProyecto(String nuevaDescripcionPro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTituloProyecto(String nuevoTituloPro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  


}
