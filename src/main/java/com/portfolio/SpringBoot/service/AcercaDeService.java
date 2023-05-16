
package com.portfolio.SpringBoot.service;

import com.portfolio.SpringBoot.interfaz.IAcercaDeService;
import com.portfolio.SpringBoot.models.AcercaDe;
import com.portfolio.SpringBoot.repository.AcercaDeRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService{
    @Autowired
    private AcercaDeRepo acercaDeRepo;
    
    @Override
    public List<AcercaDe>getAcercaDe(){
        List<AcercaDe>listaAcerca = acercaDeRepo.findAll();
        return listaAcerca;
    }
    
    @Override
      public void saveAcercaDe(AcercaDe acercade) {
        acercaDeRepo.save(acercade);
    }
      
    @Override
    public void deleteAcercaDe(int id) {
        acercaDeRepo.deleteById(id);
    }
    

    @Override
    public AcercaDe findAcercaDe(int id) {
       AcercaDe acercade =acercaDeRepo.findById(id).orElse(null);
        return acercade;
    }

}
