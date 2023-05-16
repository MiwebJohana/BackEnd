package com.portfolio.SpringBoot.interfaz;

import com.portfolio.SpringBoot.models.Cursos;
import java.util.List;

public interface ICursosService {

    public List<Cursos> getCursos();

    //método para dar de alta un curso
    public void saveCursos(Cursos cursos);

    //método para eliminar un curso
    public void deleteCursos(int id);

    //método para crear un curso 
    public Cursos findCursos(int id);

}
