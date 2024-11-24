package Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.controlador;

import Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.IUsuarioCrud;
import Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Controller
@Slf4j  
public class ControladorInicio  {
    
    private final IUsuarioCrud crudUsuario;

    // Inyección de dependencias a través del constructor
    @Autowired
    public ControladorInicio(IUsuarioCrud crudUsuario) {
        this.crudUsuario = crudUsuario;
    }

    @GetMapping("/")
    public String inicio(Model modelo){
        // Recupera todos los usuarios desde la base de datos
        List<Usuario> listaUsuario = (List<Usuario>) crudUsuario.findAll();
        
        // Agrega los usuarios al modelo para que Thymeleaf los muestre en la vista
        modelo.addAttribute("usuarios", listaUsuario);
        
        log.info("Ejecutando el Controlador - Lista de Usuarios: {}", listaUsuario);
        
        // Retorna el nombre de la vista (index.html)
        return "index";
    }
}
