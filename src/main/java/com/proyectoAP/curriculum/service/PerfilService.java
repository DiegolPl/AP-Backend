
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Perfil;
import com.proyectoAP.curriculum.repository.IPerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService{

    @Autowired
    private IPerfilRepository perfRepo;
    
    @Override
    public Perfil getData(Long id) {
        return perfRepo.findById(id).orElse(null);
    }

    @Override
    public void editPerfil(Perfil perfil) {
        perfRepo.save(perfil);
    }
    
}
