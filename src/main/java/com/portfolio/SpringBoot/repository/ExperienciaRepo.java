
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Integer>{
    
}
