package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.interfaz.ILoginService;
import com.portfolio.SpringBoot.models.Login;
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
@RequestMapping("login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    @Autowired    
    
    private ILoginService iloginService;
    
    @PostMapping("/crear")
    @ResponseBody
    public String createLogin(@RequestBody Login login) {
        iloginService.saveLogin(login);
        return "La persona logueada fue creada correctamente";
    }
    
    @DeleteMapping("/eliminar/{id}")
    public String deleteLogin(@PathVariable int id) {
        iloginService.deleteLogin(id);
        return "La persona logueada fue eliminada con exito";
    }
    
    @PutMapping("/editar")
    public Login editLogin(@PathVariable int id,
            @RequestParam("email") String nuevoEmail,
            @RequestParam("password") String nuevoPassword) {
        
        Login login = iloginService.findLogin(id);
        login.setEmail(nuevoEmail);
        login.setPassword(nuevoPassword);
        
        iloginService.saveLogin(login);
        return login;
    }
    @GetMapping("/buscar/{id}")
    public Login findLogin(@PathVariable int id) {
        return iloginService.findLogin(id);
    }

}
