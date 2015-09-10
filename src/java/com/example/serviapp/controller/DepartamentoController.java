/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.controller;

import com.example.serviapp.entities.Departamento;
import com.example.serviapp.session.DepartamentoSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Jimmy
 */
@Named
@ViewScoped

public class DepartamentoController implements Serializable {
    
    @EJB
    private DepartamentoSession departamentoSession;
    private Departamento currentDepartamento;
    private List<Departamento> itemDepartamento=null;

    public DepartamentoController() {
    }

    public Departamento getCurrentDepartamento() {
        return currentDepartamento;
    }

    public DepartamentoSession getDepartamentoSession() {
        return departamentoSession;
    }

    public void setDepartamentoSession(DepartamentoSession DepartamentoSession) {
        this.departamentoSession = DepartamentoSession;
    }

    public List<Departamento> getItemDepartamento() {
        return itemDepartamento;
    }

    public void setItemDepartamento(List<Departamento> itemDepartamento) {
        this.itemDepartamento = itemDepartamento;
    }
    

    
    /**
     * Creates a new instance of DepartamentoController
     */

    
}
