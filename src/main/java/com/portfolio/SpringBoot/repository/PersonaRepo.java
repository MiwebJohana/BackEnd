
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona,Integer> {
    
}
