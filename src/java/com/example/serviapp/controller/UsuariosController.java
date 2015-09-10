/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.controller;

import com.example.serviapp.entities.Usuarios;
import com.example.serviapp.session.UsuariosSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author adsi
 */
@Named
@ViewScoped
public class UsuariosController implements Serializable {
    
    @EJB
    private UsuariosSession usuariosSession;
    
    private Usuarios currentUsuarios;
    private int idCiudad;
    private int idDepartamento;
    private String idRoles;
    private List<Usuarios> itemUsuarios = null;

    public UsuariosController() {
    }

    public Usuarios getCurrentUsuarios() {
        return currentUsuarios;
    }

    public UsuariosSession getUsuariosSession() {
        return usuariosSession;
    }

    public void setUsuariosSession(UsuariosSession usuariosSession) {
        this.usuariosSession = usuariosSession;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        
        this.idCiudad = idCiudad;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(String idRoles) {
        this.idRoles = idRoles;
    }

    public List<Usuarios> getItemUsuarios() {
        return itemUsuarios;
    }

    public void setItemUsuarios(List<Usuarios> itemUsuarios) {
        this.itemUsuarios = itemUsuarios;
    }

   
    public void create(){
        try {
            getUsuariosSession().create(currentUsuarios);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
