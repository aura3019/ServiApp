
package com.example.serviapp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TIPOS_SERVICIO")
public class TiposServicio implements  Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipos_servicio")
    private int idTiposServicios;
    
    @Column(name = "nombre")
    @Size(max=60)
    private String nombre;
    
    @OneToMany(mappedBy = "idTiposServicio")
    private List<Servicios> servicios;

    public TiposServicio() {
    }

    public TiposServicio(int idTiposServicios) {
        this.idTiposServicios = idTiposServicios;
    }

    public int getIdTiposServicios() {
        return idTiposServicios;
    }

    public void setIdTiposServicios(int idTiposServicios) {
        this.idTiposServicios = idTiposServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }
    
    
}
