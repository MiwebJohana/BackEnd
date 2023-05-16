
package com.portfolio.SpringBoot.interfaz;

import com.portfolio.SpringBoot.models.Formacion;
import java.util.List;


public interface IFormacionService {
    //método para traer todas las formaciones
    public List<Formacion> getFormaciones();
    
    //método para dar de alta una formación
    public void saveFormacion (Formacion formacion);
    
    //método para eliminar una formación
    public void deleteFormacion (int id);
    
    //método para crear una formación
    public Formacion findFormacion(int id); 
}
