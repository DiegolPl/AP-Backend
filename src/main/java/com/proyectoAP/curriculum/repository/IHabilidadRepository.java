
package com.proyectoAP.curriculum.repository;

import com.proyectoAP.curriculum.Model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository<Habilidad, Long>{
    
}
