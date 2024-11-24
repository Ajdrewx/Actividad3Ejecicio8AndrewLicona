
package Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot;

import Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public interface IUsuarioCrud extends CrudRepository<Usuario, String>{
    
}
