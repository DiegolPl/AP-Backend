
package com.proyectoAP.curriculum.service;

import com.proyectoAP.curriculum.Model.Login;
import com.proyectoAP.curriculum.repository.ILoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{

    @Autowired
    private ILoginRepository loginRepo;
    
    @Override
    public Login getLogin(Long id) {
        return loginRepo.findById(id).orElse(null);
    }

    @Override
    public void addLogin(Login data) {
        loginRepo.save(data);
    }
    
}
