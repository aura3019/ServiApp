
package com.example.serviapp.entities;

import java.io.Serializable;


public class CiudadPK implements Serializable{
    private int idCIudad;
    private int idDepartamento;

    public CiudadPK() {
    }

    public CiudadPK(int idCIudad, int idDepartamento) {
        this.idCIudad = idCIudad;
        this.idDepartamento = idDepartamento;
    }

    public int getIdCIudad() {
        return idCIudad;
    }

    public void setIdCIudad(int idCIudad) {
        this.idCIudad = idCIudad;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.idCIudad;
        hash = 31 * hash + this.idDepartamento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CiudadPK other = (CiudadPK) obj;
        if (this.idCIudad != other.idCIudad) {
            return false;
        }
        if (this.idDepartamento != other.idDepartamento) {
            return false;
        }
        return true;
    }
    
    
    
}
