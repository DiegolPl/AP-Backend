
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> getAllProyectos();
    public Proyecto getProyecto(Long id);
    public void addProyecto(Proyecto proyecto);
    public void editProyecto(Proyecto proyecto);
    public void deleteProyecto(Long id);
}
