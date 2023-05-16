
package com.portfolio.SpringBoot.interfaz;

import com.portfolio.SpringBoot.models.Login;
import java.util.List;

public interface ILoginService {
     //método para traer todo
    public List<Login> getLogin();
    
    //método para dar de alta 
    public void saveLogin (Login login);
    
    //método para eliminar 
    public void deleteLogin (int id);
    
    //método para crear 
    public Login findLogin(int id);
}
