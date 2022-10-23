
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Perfil;

public interface IPerfilService {
    public Perfil getData(Long id);
    public void editPerfil(Perfil perfil);
}
