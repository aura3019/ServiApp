/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.controller;

import com.example.serviapp.entities.Servicios;
import com.example.serviapp.session.ServiciosSession;
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
public class ServiciosController implements Serializable {
    
    @EJB
    private ServiciosSession serviciosSession;
    private Servicios currentServicios;
    private List<Servicios> itemServicios = null;

    public ServiciosController() {
    }

    public Servicios getCurrentServicios() {
        if (currentServicios == null){
            currentServicios = new Servicios();}
        return currentServicios;
    }

    public ServiciosSession getServiciosSession() {
        return serviciosSession;
    }

    public void setServiciosSession(ServiciosSession ServiciosSession) {
        this.serviciosSession = ServiciosSession;
    }

    public List<Servicios> getItemServicios() {
        if (itemServicios == null){
            try {
                itemServicios = getServiciosSession().findAll();
            } catch (Exception ex){
                System.err.println(ex.getMessage());}
        }
        return itemServicios;
    }

    public void setItemServicios(List<Servicios> itemServicios) {
        this.itemServicios = itemServicios;
    }
    
    public void create (){
        try {
            getServiciosSession().create(currentServicios);
        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    } 

    /**
     * Creates a new instance of ServiciosController
     */
 
    
}
