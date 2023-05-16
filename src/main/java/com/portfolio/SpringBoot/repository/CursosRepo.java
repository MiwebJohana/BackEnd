
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.models.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepo extends JpaRepository<Cursos, Integer> {
    
}
