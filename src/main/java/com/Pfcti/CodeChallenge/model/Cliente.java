package com.Pfcti.CodeChallenge.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String paisResidencia;
    private String paisNacimiento;
    private String direccionDomicilio;
    private String telefonoContacto;
    private Boolean estado;


}