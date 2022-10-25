
package com.proyectoAP.curriculum.repository;

import com.proyectoAP.curriculum.Model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginRepository extends JpaRepository<Login, Long>{
    
}
