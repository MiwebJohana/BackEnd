
package com.portfolio.SpringBoot.controller;




import com.portfolio.SpringBoot.interfaz.IFormacionService;
import com.portfolio.SpringBoot.models.Formacion;
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
@RequestMapping("formacion")
@CrossOrigin(origins = "http://localhost:4200")
public class FormacionController {
      @Autowired 
    private IFormacionService iformacionService;
    
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Formacion> getFormaciones(){
        return iformacionService.getFormaciones();
        
    }
    
    @PostMapping("/crear")
    public String createFormacion(@RequestBody Formacion formacion){
        iformacionService.saveFormacion(formacion);
        return "La Formación Profesional fue creada correctamente";
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public String deleteFormacion(@PathVariable int id){
            iformacionService.deleteFormacion(id);
            return "La Formación Profesional fue eliminada con exito";
    }
    
    @PutMapping("/editar")
    public Formacion editFormacion(@PathVariable int id,
                                @RequestParam("empresaForm")String nuevaEmpresaForm,
                                @RequestParam("inicioForm")Date nuevoInicioForm,
                                @RequestParam("finForm")Date nuevoFinForm,
                                @RequestParam("tareasForm")String nuevasTareasForm){
        
    Formacion formacion = iformacionService.findFormacion(id);
    
    iformacionService.saveFormacion(formacion);
        return formacion;
    }
    
    @GetMapping ("/buscar/{id}")
    public Formacion findFormacion(@PathVariable int id){
        return iformacionService.findFormacion(id);
    }

    
    
}

 
