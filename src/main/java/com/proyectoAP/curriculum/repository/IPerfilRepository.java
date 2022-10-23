
package com.proyectoAP.curriculum.repository;

import com.proyectoAP.curriculum.Model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPerfilRepository extends JpaRepository<Perfil, Long> {
    
}
