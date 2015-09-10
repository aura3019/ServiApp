 
package com.example.serviapp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="ROLES")
public class Roles implements Serializable{
    
    @Id
    @Column (name="id_rol")
    private int idRol;
    
    @Column (name = "nombre_roles")
    @Size(max =45)
    private String nombreRoles;
    
    @OneToMany(mappedBy = "roles")
    private List<Usuarios> usuarios;

    public Roles() {
    }

    public Roles(int idRol) {
        this.idRol = idRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRoles() {
        return nombreRoles;
    }

    public void setNombreRoles(String nombreRoles) {
        this.nombreRoles = nombreRoles;
    }

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }
    
    
}
