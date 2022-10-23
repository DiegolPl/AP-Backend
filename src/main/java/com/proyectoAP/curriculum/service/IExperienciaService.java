
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> getAllExperiencias();
    public void addExperiencia(Experiencia exp);
    public void editExperiencia(Experiencia exp);
    public Experiencia getExperiencia(Long id);
    public void deleteExperiencia(Long id);
}
