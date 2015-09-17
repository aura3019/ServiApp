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


/**
 *
 * @author USUARIO
 */
@Entity
@Table(name="TIPO_DOCUMENTOS")
public class TipoDocumento implements Serializable{
    
    @Id
    @Column(name="id_tipo_documento")
    private String idTipoDocumento;
   
   @Column(name="nombre_documento")
   private String nombreDocumento;
    
    @OneToMany(mappedBy ="tipoDocumento")
    private List<Usuario> usuarios;

    public TipoDocumento() {
    }

    public TipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}