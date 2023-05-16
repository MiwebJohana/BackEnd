
package com.portfolio.SpringBoot.interfaz;

import com.portfolio.SpringBoot.models.Experiencia;
import java.util.List;


public interface IExperienciaService {
     //método para traer todas las experiencias 
    public List<Experiencia> getExperiencias();
    
    //método para dar de alta una experiencia
    public void saveExperiencia (Experiencia experiencia);
    
    //método para eliminar una experiencia
    public void deleteExperiencia (int id);
    
    //método para crear una experiencia
    public Experiencia findExperiencia(int id);
}
