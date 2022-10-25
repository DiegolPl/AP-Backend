
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Login;
import com.proyectoAP.curriculum.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private LoginService loginServ;
    
    @PostMapping("/verificar")
    public String estaRegistrado(@RequestParam("usuario") String user,@RequestParam("password") String password){
        Login datosBD = loginServ.getLogin(Long.parseLong("1"));
        
        if (datosBD.getUsuario().equals(user) && datosBD.getPassword().equals(password)){
            return "Esto es un token ya que el usuario esta registrado";
        }else{
            return "El usuario no se encuentra registrado.";
        }
    }
    
    @PostMapping("/crear")
    public void registrar(@RequestBody Login data){
        loginServ.addLogin(data);
    }
}
