
package com.portfolio.SpringBoot.interfaz;

import com.portfolio.SpringBoot.models.Persona;
import java.util.List;


public interface IPersonaService {
    //método para traer todas las personas 
    public List<Persona> getPersonas();
    
    //método para dar de alta una persona
    public void savePersona (Persona persona);
    
    //método para eliminar una persona
    public void deletePersona (int id);
    
    //método para crear una persona 
    public Persona findPersona(int id);
    
}
