
package Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Entity
@Table(name = "usuarios")
@Data
public class Usuario implements Serializable {
    
    private static final long serialVerionUID = 1L;
    @Id
    
    private String code;
    private String password;
    private String name;
    private String apellidos;
    private String rol;
    private String email;
    private String telefono;
    private String estado;
    private String fechaRegistro;
    
    
    

    
    
    

    
}
