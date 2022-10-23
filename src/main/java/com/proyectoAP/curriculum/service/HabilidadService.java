
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Habilidad;
import com.proyectoAP.curriculum.repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    private IHabilidadRepository habRepo;
    
    @Override
    public List<Habilidad> getAllHabilidades() {
        return habRepo.findAll();
    }

    @Override
    public Habilidad getHabilidad(Long id) {
        return habRepo.findById(id).orElse(null);
    }

    @Override
    public void addHabilidad(Habilidad habilidad) {
        habRepo.save(habilidad);
    }

    @Override
    public void editHabilidad(Habilidad habilidad) {
        habRepo.save(habilidad);
    }

    @Override
    public void deleteHabilidad(Long id) {
        habRepo.deleteById(id);
    }
    
}
