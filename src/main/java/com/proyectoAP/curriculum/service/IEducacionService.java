
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Educacion;
import java.util.List;

public interface IEducacionService{
    public List<Educacion> getAllEducacions();
    public void addEducacion(Educacion edu);
    public void editEducacion(Educacion edu);
    public Educacion getEducacion(Long id);
    public void deleteEducacion(Long id);
}
