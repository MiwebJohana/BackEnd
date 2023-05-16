
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepo extends JpaRepository<Skills, Integer>{
    
}
