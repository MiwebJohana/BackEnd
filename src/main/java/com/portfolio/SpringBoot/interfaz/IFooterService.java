
package com.portfolio.SpringBoot.interfaz;

import com.portfolio.SpringBoot.models.Footer;
import java.util.List;


public interface IFooterService {
     //método para traer 
    public List<Footer> getFooter();
    
    //método para dar de alta 
    public void saveFooter (Footer footer);
    
    //método para eliminar 
    public void deleteFooter (int id);
    
    //método para crear 
    public Footer findFooter(int id);
}
