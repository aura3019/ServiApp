/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name="CIUDADES")
public class Ciudad implements Serializable{
    
    @Id
    @Column(name="id_ciudad")
    private int idCiudad;
    
    @Id
    @ManyToOne
    @JoinColumn(name="id_departamento")
    private Departamento departamento;
    
    @Column(name="nombre_ciudad")
    private String nombreCiudad;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, Departamento departamento) {
        this.idCiudad = idCiudad;
        this.departamento = departamento;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    
    
}
