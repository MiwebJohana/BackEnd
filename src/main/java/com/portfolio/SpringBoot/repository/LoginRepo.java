
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {

    
}
