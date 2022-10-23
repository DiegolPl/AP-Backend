
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Archivo;
import com.proyectoAP.curriculum.Model.Proyecto;
import com.proyectoAP.curriculum.service.ProyectoService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins={"http://localhost:4200"})
@RequestMapping("/proyectos")
public class ProyectoController {
    
    @Autowired
    private ProyectoService proyServ;
    
    @GetMapping("/listar")
    public List<Proyecto> getAllProyectos(){
        return proyServ.getAllProyectos();
    }
    
    @GetMapping("/proyecto/{id}")
    public Proyecto getProyecto(@PathVariable Long id){
        return proyServ.getProyecto(id);
    }
    
    @PostMapping("/crear")
    public void addProyecto(@RequestParam("titulo") String titulo, @RequestParam("fecha") String fecha, @RequestParam("link") String link, @RequestParam("descripcion") String descripcion, @RequestParam("archivo") MultipartFile imagen){
        
        Proyecto proyecto = new Proyecto();
//        proyecto.setId(id);
        proyecto.setTitulo(titulo);
        proyecto.setFecha(fecha);
        proyecto.setLink(link);
        proyecto.setDescripcion(descripcion);
        
        Archivo newImg = new Archivo();
        
        if(!imagen.isEmpty()){
            //Obtenemos la ruta relativa donde se va a almacenar la imagen
            Path directorioImagenes = Paths.get("src//main//resources//static//images/proyectos");
            //Obtenemos la ruta absoluta
            String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
            //Leemos los bytes de la imagen
            try {
                //Obtenemos la imagen en bytes y los guardamos en una variable
                byte[] bytesImg = imagen.getBytes();
                //Establecemos la ruta donde se guardara el archivo
                String tituloSinEspacios = titulo.replace(" ","");
                Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + tituloSinEspacios + imagen.getOriginalFilename());  
                //Path rutaCompleta = Paths.get(rutaAbsoluta + "//perfil.jpg");
                //Escribimos el archivo
                Files.write(rutaCompleta, bytesImg);
                
                //newImg.setNombre(imagen.getOriginalFilename());
                newImg.setUrl(rutaCompleta.toString());
                
                proyecto.setUrl_imagen(rutaCompleta.toString());
                
            } catch(IOException e){
                e.printStackTrace();
            }
            
        }
        
        proyServ.addProyecto(proyecto);
    }
    
    @PutMapping("/editar")
    public void editProyecto(@RequestParam("id") String id, @RequestParam("titulo") String titulo, @RequestParam("fecha") String fecha, @RequestParam("link") String link, @RequestParam("descripcion") String descripcion, @RequestParam("archivo") MultipartFile imagen){
        
        Long idProy = Long.parseLong(id);
        
        Proyecto proyecto = new Proyecto();
        proyecto.setId(idProy);
        proyecto.setTitulo(titulo);
        proyecto.setFecha(fecha);
        proyecto.setLink(link);
        proyecto.setDescripcion(descripcion);
        
        Archivo newImg = new Archivo();
        
        if(!imagen.isEmpty()){
            //Obtenemos la ruta relativa donde se va a almacenar la imagen
            Path directorioImagenes = Paths.get("src//main//resources//static//images/proyectos");
            //Obtenemos la ruta absoluta
            String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
            //Leemos los bytes de la imagen
            try {
                //Obtenemos la imagen en bytes y los guardamos en una variable
                byte[] bytesImg = imagen.getBytes();
                //Establecemos la ruta donde se guardara el archivo
                Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + imagen.getOriginalFilename());  
                //Path rutaCompleta = Paths.get(rutaAbsoluta + "//perfil.jpg");
                //Escribimos el archivo
                Files.write(rutaCompleta, bytesImg);
                
                //newImg.setNombre(imagen.getOriginalFilename());
                newImg.setUrl(rutaCompleta.toString());
                
                proyecto.setUrl_imagen(rutaCompleta.toString());
                
            } catch(IOException e){
                e.printStackTrace();
            }
            
        }
        
        
        proyServ.editProyecto(proyecto);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        
        Proyecto proyecto = proyServ.getProyecto(id);
        
        String urlImagen = proyecto.getUrl_imagen();
        
        Path path = Paths.get(urlImagen);
        try {
            boolean result = Files.deleteIfExists(path);
            if (result) {
                System.out.println("File is deleted!");
            } else {
                System.out.println("Sorry, could not delete the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        proyServ.deleteProyecto(id);
    }
}
