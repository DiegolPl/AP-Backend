
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Login;

public interface ILoginService{
    public Login getLogin(Long id);
    public void addLogin(Login data);
}
