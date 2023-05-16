
package com.portfolio.SpringBoot.repository;

import com.portfolio.SpringBoot.models.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Integer> {

    public Optional<Educacion>findBynombreEdu(String nombreEdu);
    public boolean existsBynombreEdu(String nombreEdu);

    public Optional<Educacion> findByNombreEdu(String nombreEdu);

    public boolean existsByNombreEdu(String nombreEdu);

    
}
