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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name="TIPOS_SERVICIO")
public class TipoServicio implements Serializable{
    
    
    @Id //Clave Primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Clave Primaria Autoincrementable
    @Column(name = "id_tipo_servicio") //nombre de la columna en la base de datos
    private short idTipoServicio;

    private String nombre;
    
    @OneToMany(mappedBy = "tipoServicio")
    private List<Servicio> servicios;

    public TipoServicio() {
    }

    public TipoServicio(short idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public short getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(short idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    
    
    
}
