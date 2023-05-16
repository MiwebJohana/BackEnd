package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.interfaz.IExperienciaService;
import com.portfolio.SpringBoot.models.Experiencia;
import com.portfolio.SpringBoot.repository.ExperienciaRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService{

    @Autowired
    private ExperienciaRepo experienciaRepo;
    @Override
    public List<Experiencia> getExperiencias() {
         List<Experiencia> listaexperiencias = experienciaRepo.findAll();
         return listaexperiencias;
    }
    
    
    @Override
    public void deleteExperiencia(int id) {
        experienciaRepo.deleteById(id);
    }
    
    @Override
    public void saveExperiencia(Experiencia experiencia) {
       experienciaRepo.save(experiencia);
    }
    
    @Override
      public Experiencia findExperiencia(int id) {
        Experiencia experiencia = experienciaRepo.findById(id).orElse(null);
        return experiencia;
    }


}

