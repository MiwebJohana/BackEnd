
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectoRepo extends JpaRepository<Proyecto, Integer> {
    
}
