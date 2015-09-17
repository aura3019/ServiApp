/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "PAISES")
public class Pais implements Serializable{
   
    @Id
    @Column(name ="id_pais")
    private String idPais;
    
    @Column(name ="nombre_pais")
    @Size(max=60)
    private String nombre_pais;
    
    @OneToMany(mappedBy="pais")
    private List<Departamento> departamento;

    public Pais() {
    }

    public Pais(String idPais) {
        this.idPais = idPais;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    public List<Departamento> getDepartamento() {
        return departamento;
    }

    public void setDepartamento(List<Departamento> departamento) {
        this.departamento = departamento;
    }

  
    }
    
    
    

