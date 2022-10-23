
package com.proyectoAP.curriculum.repository;

import com.proyectoAP.curriculum.Model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
