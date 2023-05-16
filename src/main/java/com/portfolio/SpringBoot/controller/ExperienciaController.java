package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.interfaz.IExperienciaService;
import com.portfolio.SpringBoot.models.Experiencia;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")

public class ExperienciaController {

    @Autowired
    private IExperienciaService iexperienciaService;

    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> getExperiencias() {
        return iexperienciaService.getExperiencias();
    }
    
    
      @PostMapping("/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "La experiencia laboral fue creada correctamente";
    }

    

    @DeleteMapping("/eliminar/{id}")
    public String deleteExperiencia(@PathVariable int id) {
        iexperienciaService.deleteExperiencia(id);
        return "La experiencia laboral fue eliminada con exito";
    }

    @PutMapping("/editar/{id}")
    public Experiencia editExperiencia(@PathVariable int id,
                               @RequestParam("empresaExp")String nuevaEmpresaExp,
                               @RequestParam("inicioExp")Date nuevoInicioExp,
                               @RequestParam("finExp")Date nuevoFinExp,
                               @RequestParam("tareasExp")String nuevasTareasExp)
                                                                              {
        
        
         Experiencia experiencia = iexperienciaService.findExperiencia(id);
         
        experiencia.setEmpresaExp(nuevaEmpresaExp);
        experiencia.setInicioExp((java.sql.Date) nuevoInicioExp);
        experiencia.setFinExp((java.sql.Date) nuevoFinExp);
        experiencia.setTareasExp(nuevasTareasExp);
   
         
         
         
          iexperienciaService.saveExperiencia(experiencia);
          return experiencia;
    }
       
        
    
    @GetMapping("/buscar/{id}")
    public Experiencia findExperiencia(@PathVariable int id) {
        return iexperienciaService.findExperiencia(id);
    }
}
