
package com.portfolio.SpringBoot.controller;


import com.portfolio.SpringBoot.interfaz.ICursosService;
import com.portfolio.SpringBoot.models.Cursos;
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
@RequestMapping("cursos")
@CrossOrigin(origins = "http://localhost:4200")
public class CursosController {
   @Autowired
    private ICursosService icursosService;
    
     @GetMapping ("/lista")
    @ResponseBody
    public List<Cursos> getCursos(){
        return icursosService.getCursos();
        
    }
    @PostMapping("/crear")
    public String createCursos(@RequestBody Cursos curso){
        icursosService.saveCursos(curso);
        return "El curso fue creado correctamente";
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public String deleteCurso(@PathVariable int id){
        icursosService.deleteCursos(id);
            return "El curso ha sido eliminado con exito";
    }
    
    @PutMapping("/editar")
    public Cursos editCursos(@PathVariable int id,
                                @RequestParam("tituloCursos")String nuevoTituloCursos,
                                @RequestParam("inicioCursos")Date nuevoInicioCursos,
                                @RequestParam("finCursos")Date nuevoFinCursos,
                                @RequestParam("descripcionCursos")String nuevaDescripcionCursos){
        
      Cursos cursos = icursosService.findCursos(id);
      
      cursos.setTituloCursos(nuevoTituloCursos);
      cursos.setInicioCursos(nuevoInicioCursos);
      cursos.setFinCursos(nuevoFinCursos);
      cursos.setDescripcionCursos(nuevaDescripcionCursos);
       icursosService.saveCursos(cursos);
      
      return cursos;
    }
    
     @GetMapping ("/buscar/{id}")
    public Cursos findCursos(@PathVariable int id){
        return icursosService.findCursos(id);
    }
    

    
}
