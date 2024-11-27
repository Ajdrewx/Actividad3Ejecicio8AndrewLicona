package Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.servicio;

import Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.modelo.Usuario;
import java.util.List;

public interface IUsuarioservicio {
    List<Usuario> listarUsuarios();
    void guardar(Usuario user);
    void eliminar(Usuario user);
    Usuario buscar(Usuario user); 
}
