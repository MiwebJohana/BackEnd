package com.portfolio.SpringBoot.controller;


import com.portfolio.SpringBoot.interfaz.IEducacionService;
import com.portfolio.SpringBoot.models.Educacion;
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
@RequestMapping("educacion")
@CrossOrigin(origins = "https://localhost:4200")
public class EducacionController {

    @Autowired
    private IEducacionService ieducacionService;

   
 @GetMapping ("/lista")
 @ResponseBody
    public List<Educacion> getEducaciones(){
        return ieducacionService.getEducacion();   
    }
    
     @PostMapping("/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return "La educación fue creada correctamente";
    }
    
    
    @DeleteMapping ("/eliminar/{id}")
    public String deleteEducacion(@PathVariable int id){
            ieducacionService.deleteEducacion(id);
            return "La educación fue eliminada con exito";
    }
    
    @PutMapping("/editar/{id}")
    public Educacion editEducacion (@PathVariable int id,
                               @RequestParam("nombreEdu")String nuevoNombreEdu,
                                @RequestParam("tituloEdu")String nuevoTituloEdu,
                                @RequestParam("inicioEdu")Date nuevoInicioEdu,
                                @RequestParam("finEdu")Date nuevoFinEdu,
                                @RequestParam("imgEdu")String nuevaImgEdu){
        
        
         Educacion educacion = ieducacionService.findEducacion(id);
         
         educacion.setNombreEdu(nuevoNombreEdu);
         educacion.setTituloEdu(nuevoTituloEdu);
         educacion.setInicioEdu(nuevoInicioEdu);
         educacion.setFinEdu(nuevoFinEdu);
         educacion.setImgEdu(nuevaImgEdu);
         
         
          ieducacionService.saveEducacion(educacion);
          return educacion;
    }
     
     @GetMapping ("/buscar/{id}")
    public Educacion findEducacion(@PathVariable int id){
        return ieducacionService.findEducacion(id);
    }
                            
}
