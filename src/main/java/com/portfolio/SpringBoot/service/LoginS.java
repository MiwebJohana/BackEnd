
package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.interfaz.ILoginService;
import com.portfolio.SpringBoot.models.Login;
import com.portfolio.SpringBoot.repository.LoginRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginS implements ILoginService{

    
    @Autowired
    private LoginRepo loginRepo;
    @Override
    public List<Login> getLogin() {
         List<Login> listalogin = loginRepo.findAll();
        return listalogin;
    }
    @Override
     public void saveLogin(Login login) {
      loginRepo.save(login);  
    }
     
     @Override
    public void deleteLogin(int id) {
        loginRepo.deleteById(id); 
    }
    
    
     @Override
    public Login findLogin(int id) {
        Login login = loginRepo.findById(id).orElse(null);
        return login;
    }

    
}
