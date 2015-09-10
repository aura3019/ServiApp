/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.controller;


import com.example.serviapp.entities.Ciudad;
import com.example.serviapp.session.CiudadSession;
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
public class CiudadController implements Serializable {
    
    @EJB
    private CiudadSession ciudadSession;
    
    private Ciudad currentCiudad;
    private List<Ciudad> itemCiudad = null;

    public CiudadController() {
    }

    public Ciudad getCurrentCiudad() {
        if (currentCiudad == null) {
            currentCiudad = new Ciudad();}
        
        return currentCiudad;
    }

    public void setCurrentCiudad(Ciudad currentCiudad) {
        this.currentCiudad = currentCiudad;
    }

    public CiudadSession getCiudadSession() {
        return ciudadSession;
    }

    public List<Ciudad> getItemCiudad() { 
        if (itemCiudad == null){
            try {
                itemCiudad = getCiudadSession().findAll();
            } catch (Exception ex){
                System.err.println(ex.getMessage());}
        }
        return itemCiudad;
    }
        
    
    public void create(){
        try {
            getCiudadSession().create(currentCiudad);
        }catch (Exception ex) {
            System.err.println(ex.getMessage());
 
}
}
}