package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.interfaz.ISkillsService;
import com.portfolio.SpringBoot.models.Skills;
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
@RequestMapping("skills")
@CrossOrigin(origins = "http://localhost:4200")

public class SkillsController {

    @Autowired
    private ISkillsService iskillsService;

    @GetMapping("/lista")
    @ResponseBody
    public List<Skills> getSkills() {
        return iskillsService.getSkills();
    }

    @PostMapping("/crear")
    public String createSkills(@RequestBody Skills skills) {
        iskillsService.saveSkills(skills);
        return "El skill fue creado correctamente";
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteSkills(@PathVariable int id) {
        iskillsService.deleteSkills(id);
        return "El skill fue eliminado con exito";
    }

    @PutMapping("/editar")
    public Skills editSkills(@PathVariable int id,
                                @RequestParam("nombreSkills")String nuevoNombreSkills,
                                @RequestParam("porcentajeSkills")String nuevoPorcentajeSkills){
        
    Skills skills = iskillsService.findSkills(id);
    skills.setNombreSkill(nuevoNombreSkills);
    skills.setPorcentajeSkill(nuevoPorcentajeSkills);
   
    
    iskillsService.saveSkills(skills);
        return skills;
    
   
    
}
    @GetMapping("/buscar/{id}")
    public Skills findSkills(@PathVariable int id) {
        return iskillsService.findSkills(id);
    }

}
