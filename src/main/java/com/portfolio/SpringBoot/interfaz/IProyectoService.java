
package com.portfolio.SpringBoot.interfaz;


import com.portfolio.SpringBoot.models.Proyecto;
import java.util.List;


public interface IProyectoService {
     //método para traer todas los proyectos
    public List<Proyecto> getProyecto();
    
    //método para dar de alta un proyecto
    public void saveProyecto (Proyecto proyecto);
    
    //método para eliminar un proyecto
    public void deleteProyecto (int id);
    
    //método para crear un proyecto
    public Proyecto findProyecto(int id);
}
