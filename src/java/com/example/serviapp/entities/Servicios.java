
package com.example.serviapp.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "SERVICIOS")

public class Servicios implements Serializable{

    @Id
    @Column(name = "id_servicios")
    private int idServicios;
    
    @Column(name = "nombre")
    @Size(max =20)
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "valor")
    private Double valor;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_servicio")
    private TiposServicio idTipoServicio;

    public Servicios() {
    }

    public Servicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TiposServicio getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(TiposServicio idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

   
    
    
}
