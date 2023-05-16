package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.interfaz.IPersonaService;
import com.portfolio.SpringBoot.models.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.SpringBoot.repository.PersonaRepo;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepo personaRepo;
    @Override
    public List<Persona> getPersonas() {
        List<Persona> listapersonas = personaRepo.findAll();
        return listapersonas;
    }
    
    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);
    }
    
       @Override
    public void deletePersona(int id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(int id) {
        Persona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }
   


}
