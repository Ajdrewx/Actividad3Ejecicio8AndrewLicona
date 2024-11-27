/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8SpringBoot.Actividad3AndrewLiconaSpringboot.modelo;



import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    private Float presupuesto;

    private Integer duracion;

    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Estudiante usuario;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Float getPresupuesto() { return presupuesto; }
    public void setPresupuesto(Float presupuesto) { this.presupuesto = presupuesto; }

    public Integer getDuracion() { return duracion; }
    public void setDuracion(Integer duracion) { this.duracion = duracion; }

    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Estudiante getUsuario() { return usuario; }
    public void setUsuario(Estudiante usuario) { this.usuario = usuario; }
}

