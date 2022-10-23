
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Experiencia;
import com.proyectoAP.curriculum.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    private IExperienciaRepository expRepo;

    @Override
    public List<Experiencia> getAllExperiencias() {
       return expRepo.findAll();
    }

    @Override
    public void addExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void editExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public Experiencia getExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepo.deleteById(id);
    }
    
}
