
package com.example.serviapp.jpa.entities;

import java.io.Serializable;


public class CalificacionServicioPK implements Serializable {
    
    private int usuario;
    private int servicio;

    public CalificacionServicioPK() {
    }    

    public CalificacionServicioPK(int usuario, int servicio) {
        this.usuario = usuario;
        this.servicio = servicio;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.usuario;
        hash = 89 * hash + this.servicio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CalificacionServicioPK other = (CalificacionServicioPK) obj;
        if (this.usuario != other.usuario) {
            return false;
        }
        if (this.servicio != other.servicio) {
            return false;
        }
        return true;
    }
    
}
