
package com.portfolio.SpringBoot.controller;


import com.portfolio.SpringBoot.interfaz.IFooterService;
import com.portfolio.SpringBoot.models.Footer;
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
@RequestMapping("footer")
@CrossOrigin(origins = "https://localhost:4200")
public class FooterController {
    @Autowired
    private IFooterService ifooterService;
    
    @GetMapping ("/lista")
    @ResponseBody
    
    public List<Footer> getFooter(){
        return ifooterService.getFooter();
        
    }
     @PostMapping("/crear")
     
    public String createFooter(@RequestBody Footer footer){
        ifooterService.saveFooter(footer);
        return "El footer fue creado correctamente";
    }
    
    
    @DeleteMapping ("/eliminar/{id}")
    public String deleteFooter(@PathVariable int id){
            ifooterService.deleteFooter(id);
            return "El footer fue eliminado con exito";
    }
    
   @PutMapping("/editar")
    
    public Footer editProyecto(@PathVariable int id,
                               @RequestParam("firmaFooter") String nuevaFirmaFoot,
                               @RequestParam("celularFooter") String nuevoCelularFoot) {

        Footer footer = ifooterService.findFooter(id);
        footer.setFirmaFooter(nuevaFirmaFoot);
        footer.setCelularFooter(nuevoCelularFoot);
        

        ifooterService.saveFooter(footer);
        return footer;
    
    }
       @GetMapping("/buscar/{id}")
    public Footer findProyecto(@PathVariable int id) {
        return ifooterService.findFooter(id);
    }
}
