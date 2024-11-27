
package Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot;

import Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface IUsuarioCrud extends CrudRepository<Usuario, String>{
    
}
