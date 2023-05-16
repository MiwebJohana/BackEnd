
package com.portfolio.SpringBoot.interfaz;

import com.portfolio.SpringBoot.models.Educacion;
import java.util.List;


public interface IEducacionService {
     //método para traer todas las personas 
    public List<Educacion> getEducacion();
    
    //método para dar de alta una persona
    public void saveEducacion (Educacion educacion);
    
    //método para eliminar una persona
    public void deleteEducacion (int id);
    
    //método para crear una persona 
    public Educacion findEducacion(int id);
}
