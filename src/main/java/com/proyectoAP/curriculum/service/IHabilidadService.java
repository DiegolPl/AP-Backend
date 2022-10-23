
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    public List<Habilidad> getAllHabilidades();
    public Habilidad getHabilidad(Long id);
    public void deleteHabilidad(Long id);
    public void addHabilidad(Habilidad habilidad);
    public void editHabilidad(Habilidad habilidad);
}
