
package com.portfolio.SpringBoot.service;


import com.portfolio.SpringBoot.interfaz.IProyectoService;
import com.portfolio.SpringBoot.models.Proyecto;
import com.portfolio.SpringBoot.repository.ProyectoRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService{
    @Autowired
    private ProyectoRepo proyectoRepo;
    
    
    @Override
    public List<Proyecto> getProyecto() {
         List<Proyecto> listaproyectos = proyectoRepo.findAll();
       return listaproyectos; 
    }
    
    @Override
    public void deleteProyecto(int id) {
        proyectoRepo.deleteById(id);
    }
    
    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }
    
    @Override
    public Proyecto findProyecto(int id) {
        Proyecto proyecto = proyectoRepo.findById(id).orElse(null);
        return proyecto;
    }

    
    
    
    
}
