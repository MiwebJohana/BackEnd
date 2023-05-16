package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.interfaz.IEducacionService;
import com.portfolio.SpringBoot.models.Educacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.portfolio.SpringBoot.repository.EducacionRepo;
import java.util.List;

@Service
@Transactional
public class EducacionService implements IEducacionService{

    @Autowired
    private EducacionRepo educacionRepo;
    
    
    @Override
    public List<Educacion> getEducacion() {
         List<Educacion> listaeducaciones = educacionRepo.findAll();
        return listaeducaciones;
    }
 
    @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }
    @Override
    public void deleteEducacion(int id) {
        educacionRepo.deleteById(id);
    }
    
     @Override
    public Educacion findEducacion(int id) {
        Educacion educacion = educacionRepo.findById(id).orElse(null);
        return educacion;
    }

    
}
