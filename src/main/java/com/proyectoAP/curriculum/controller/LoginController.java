
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Login;
import com.proyectoAP.curriculum.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins={"http://localhost:4200"})
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private ILoginService loginServ;
    
    @PostMapping("/verificar")
    public boolean estaRegistrado(@RequestBody Login usuario){
        Login datosBD = loginServ.getLogin(Long.parseLong("1"));
        
        return datosBD.getUsername().equals(usuario.getUsername()) && datosBD.getPassword().equals(usuario.getPassword());
    }
    
    @PostMapping("/crear")
    public void registrar(@RequestBody Login data){
        loginServ.addLogin(data);
    }
}
