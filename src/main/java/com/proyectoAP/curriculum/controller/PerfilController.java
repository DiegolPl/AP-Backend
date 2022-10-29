
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Archivo;
import com.proyectoAP.curriculum.Model.Perfil;
import com.proyectoAP.curriculum.service.IPerfilService;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins={"https://apfrontdiego.web.app/"})
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired
    private IPerfilService perfServ;
    
    @GetMapping("/{id}")
    public Perfil getPerfil(@PathVariable Long id){
        return perfServ.getData(id);
    }
    
    @PutMapping("/editar")
    public void editPerfil(@RequestBody Perfil perfil){
        perfServ.editPerfil(perfil);
    }
    
//    @PutMapping("/editar")
//    public void editPerfil(@RequestParam("id") String idperfil, @RequestParam("nombre") String nombre, @RequestParam("titulo") String titulo, @RequestParam("sobreMi") String sobreMi, @RequestParam("archivo") MultipartFile imagen){
//        
//        //System.out.println("Entro?");
//        
//        Long idPerfil = Long.parseLong(idperfil);
//        
//        Perfil perfil = perfServ.getData(idPerfil);
//        perfil.setId(idPerfil);
//        perfil.setNombre(nombre);
//        perfil.setTitulo(titulo);
//        perfil.setSobreMi(sobreMi);
//        
//        if(imagen == null){
//            perfServ.editPerfil(perfil);
//        }else{
//            Archivo newImg = new Archivo();
//            if(!imagen.isEmpty()){
//                //Obtenemos la ruta relativa donde se va a almacenar la imagen
//                Path directorioImagenes = Paths.get("src//main//resources//static//images/perfil");
//                //Obtenemos la ruta absoluta
//                String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
//                //Leemos los bytes de la imagen
//                try {
//                    //Obtenemos la imagen en bytes y los guardamos en una variable
//                    byte[] bytesImg = imagen.getBytes();
//                    //Establecemos la ruta donde se guardara el archivo
//                    //Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + imagen.getOriginalFilename());
//                    Path rutaCompleta = Paths.get(rutaAbsoluta + "//perfil.jpg");
//                    //Escribimos el archivo
//                    Files.write(rutaCompleta, bytesImg);
//
//                    //newImg.setNombre(imagen.getOriginalFilename());
//                    newImg.setUrl(rutaCompleta.toString());
//
//                    perfil.setUrlImg(rutaCompleta.toString());
//
//                } catch(IOException e){
//                    e.printStackTrace();
//                }
//            }
//            perfServ.editPerfil(perfil);
//        }
//        
//    }
    
     
//    @PutMapping("/editar-sin-foto")
//    public void editPerfilSinFoto(@RequestParam("nombre") String nombre, @RequestParam("titulo") String titulo, @RequestParam("sobreMi") String sobreMi){
//        
//        System.out.println("Entro?");
//        
//        Long idPerfil = Long.parseLong("1");
//        
//        Perfil perfil = perfServ.getData(idPerfil);
//        //perfil.setId(id);
//        perfil.setNombre(nombre);
//        perfil.setTitulo(titulo);
//        perfil.setSobreMi(sobreMi);
//        
//        perfServ.editPerfil(perfil);
//        
//    }
    
//    @GetMapping("/obtener-recurso/{ruta}")
//    public File obtenerRecurso(@PathVariable String ruta){
//        
//        Path rutaRecurso = Paths.get(ruta);
//        
//        return Files.
//    }
    
}
