
package com.proyectoAP.curriculum.repository;

import com.proyectoAP.curriculum.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Long> {
    
}
