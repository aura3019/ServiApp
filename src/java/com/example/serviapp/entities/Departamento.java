
package com.example.serviapp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="DEPARTAMENTOS")
public class Departamento implements Serializable{
    
    @Id
    @Column (name = "id_departamento")
    private int id_departamento;
    
    @Column (name="nombre_departamento")
    private String nombreDepartamento;
    
    @ManyToOne
    @JoinColumn (name = "id_pais")
    private Pais idPais;
    
    @OneToMany (mappedBy="idDepatamento")
    private List<Ciudad> ciudad;

    public Departamento() {
    }

    public Departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }
    
    

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Pais getIdPais() {
        return idPais;
    }

    public void setIdPais(Pais idPais) {
        this.idPais = idPais;
    }

    public List<Ciudad> getCiudad() {
        return ciudad;
    }

    public void setCiudad(List<Ciudad> ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
