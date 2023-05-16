
package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.interfaz.IPersonaService;
import com.portfolio.SpringBoot.models.Persona;
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
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired 
    private IPersonaService ipersonaService;
    
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Persona> getPersonas(){
        return ipersonaService.getPersonas();
        
    }
    
      @PostMapping("/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        //devuelve un string avisando si se creo correctamente
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/eliminar/{id}")
    public String deletePersona(@PathVariable int id){
            ipersonaService.deletePersona(id);
            //devuelve un string avisando si se elimino correctamente
            return "La persona fue eliminada con exito";
    }
    
    @PutMapping("/editar/{id}")
    
     public Persona editPersona(@PathVariable int id,
                                @RequestParam("nombre")String nuevoNombre,
                                @RequestParam("apellido")String nuevoApellido,
                                @RequestParam("titulo")String nuevoTitulo,
                                @RequestParam("img")String nuevaImg){
        
    Persona persona = ipersonaService.findPersona(id);
    
    persona.setNombre(nuevoNombre);
    persona.setApellido(nuevoApellido);
    persona.setTitulo(nuevoTitulo);
    persona.setImg(nuevaImg);
    
    ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping ("/buscar/{id}")
    public Persona findPersona(@PathVariable int id){
        return ipersonaService.findPersona(id);
    }
    

}