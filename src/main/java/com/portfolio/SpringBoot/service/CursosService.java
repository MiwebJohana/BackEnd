package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.interfaz.ICursosService;
import com.portfolio.SpringBoot.models.Cursos;
import com.portfolio.SpringBoot.repository.CursosRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CursosService implements ICursosService{

    @Autowired
    private CursosRepo cursosRepo;

    @Override
    public List<Cursos> getCursos() {
        List<Cursos> listaCursos = cursosRepo.findAll();
        return listaCursos;
    }

    @Override
    public void saveCursos(Cursos cursos) {
        cursosRepo.save(cursos);
    }

    @Override
    public void deleteCursos(int id) {
        cursosRepo.deleteById(id);
    }
    @Override
    public Cursos findCursos(int id) {
        Cursos curso = cursosRepo.findById(id).orElse(null);
        return curso;
    }

}
