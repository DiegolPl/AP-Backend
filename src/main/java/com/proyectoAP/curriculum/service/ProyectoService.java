
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Proyecto;
import com.proyectoAP.curriculum.repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    private IProyectoRepository proyRepo;
    
    @Override
    public List<Proyecto> getAllProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public Proyecto getProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void addProyecto(Proyecto proyecto) {
        proyRepo.save(proyecto);
    }

    @Override
    public void editProyecto(Proyecto proyecto) {
        proyRepo.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyRepo.deleteById(id);
    }
    
}
