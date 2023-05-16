
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.models.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FormacionRepo extends JpaRepository<Formacion, Integer>{
    
}
