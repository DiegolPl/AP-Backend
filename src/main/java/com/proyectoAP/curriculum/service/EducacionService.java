
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Educacion;
import com.proyectoAP.curriculum.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    private IEducacionRepository eduRepo;
    
    @Override
    public List<Educacion> getAllEducacions() {
        return eduRepo.findAll();
    }

    @Override
    public void addEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void editEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public Educacion getEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
    @Override
    public void deleteEducacion(Long id) {
        eduRepo.deleteById(id);
    }
}
