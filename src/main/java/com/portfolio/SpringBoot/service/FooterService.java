
package com.portfolio.SpringBoot.service;


import com.portfolio.SpringBoot.interfaz.IFooterService;
import com.portfolio.SpringBoot.models.Footer;
import com.portfolio.SpringBoot.repository.FooterRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FooterService implements IFooterService{
    @Autowired
    private FooterRepo footerRepo;

    @Override
    public List<Footer> getFooter() {
        List<Footer> listafooter = footerRepo.findAll();
        return listafooter;
    }

    @Override
    public void saveFooter(Footer footer) {
         footerRepo.save(footer);
    }

    @Override
    public void deleteFooter(int id) {
         footerRepo.deleteById(id);
    }

    @Override
    public Footer findFooter(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  

    
}
