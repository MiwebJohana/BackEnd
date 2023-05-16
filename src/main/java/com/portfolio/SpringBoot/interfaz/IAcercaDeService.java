
package com.portfolio.SpringBoot.interfaz;

import com.portfolio.SpringBoot.models.AcercaDe;
import java.util.List;


public interface IAcercaDeService {
     //método para traer todo
    public List<AcercaDe> getAcercaDe();
    
    //método para dar de alta una persona
    public void saveAcercaDe (AcercaDe acercaDe);
    
    //método para eliminar
    public void deleteAcercaDe (int id);
    
    //método para crear 
    public AcercaDe findAcercaDe(int id);
    
}
