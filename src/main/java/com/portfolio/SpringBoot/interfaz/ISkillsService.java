
package com.portfolio.SpringBoot.interfaz;


import com.portfolio.SpringBoot.models.Skills;
import java.util.List;


public interface ISkillsService {
     //método para traer todos los skills
    public List<Skills> getSkills();
    
    //método para dar de alta un skill
    public void saveSkills (Skills skills);
    
    //método para eliminar un skill
    public void deleteSkills (int id);
    
    //método para crear un skill
    public Skills findSkills(int id);
}
