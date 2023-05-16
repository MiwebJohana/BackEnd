package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.interfaz.IFormacionService;
import com.portfolio.SpringBoot.models.Formacion;
import com.portfolio.SpringBoot.repository.FormacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService implements IFormacionService {

    @Autowired
    private FormacionRepo formacionRepo;

    @Override
    public List<Formacion> getFormaciones() {
        List<Formacion> listaformaciones = formacionRepo.findAll();
        return listaformaciones;
    }

    @Override
    public void saveFormacion(Formacion formacion) {
        formacionRepo.save(formacion);
    }

    @Override
    public void deleteFormacion(int id) {
        formacionRepo.deleteById(id);
    }

    @Override
    public Formacion findFormacion(int id) {
        Formacion formacion = formacionRepo.findById(id).orElse(null);
        return formacion;
    }

}
