
package com.portfolio.SpringBoot.controller;


import com.portfolio.SpringBoot.interfaz.IProyectoService;
import com.portfolio.SpringBoot.models.Proyecto;
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
@RequestMapping("proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    
     @Autowired
    private IProyectoService iproyectoService;

    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> getProyectos() {
        return iproyectoService.getProyecto();
    }
    
    
      @PostMapping("/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        return "El proyecto fue creado correctamente";
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteProyecto(@PathVariable int id) {
        iproyectoService.deleteProyecto(id);
        return "El proyecto fue eliminado con exito";
    }

    @PutMapping("/editar")
    
    public Proyecto editProyecto(@PathVariable int id,
            @RequestParam("tituloPro") String nuevoTituloPro,
            @RequestParam("descripcionPro") String nuevaDescripcionPro) {

        Proyecto proyecto = iproyectoService.findProyecto(id);

        proyecto.setTituloProyecto(nuevoTituloPro);
        proyecto.setDescripcionProyecto(nuevaDescripcionPro);

        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    
    }
       @GetMapping("/buscar/{id}")
    public Proyecto findProyecto(@PathVariable int id) {
        return iproyectoService.findProyecto(id);
    }

    
}
