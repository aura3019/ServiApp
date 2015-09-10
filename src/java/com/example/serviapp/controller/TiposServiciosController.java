/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.controller;

import com.example.serviapp.entities.TiposServicio;
import com.example.serviapp.session.TiposServicioSession;
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
public class TiposServiciosController implements Serializable {
    

  @EJB
  private TiposServicioSession tiposServicioSession;
  private TiposServicio currentTiposServicio;
  private List<TiposServicio> itemTiposServicio = null;

    public TiposServiciosController() {
    }

    public TiposServicio getCurrentTiposServicio() {
        if (currentTiposServicio == null){
            currentTiposServicio = new TiposServicio();}
        return currentTiposServicio;
    }

    public TiposServicioSession getTiposServicioSession() {
        return tiposServicioSession;
    }

    public void setTiposServicioSession(TiposServicioSession TiposServicioSession) {
        this.tiposServicioSession = TiposServicioSession;
    }

    public List<TiposServicio> getItemTiposServicio() {
        if (itemTiposServicio == null){
            try {
                itemTiposServicio = getTiposServicioSession().findAll();
                }catch (Exception ex){
                    System.err.println(ex.getMessage());}
        }
        return itemTiposServicio;
    }

    public void setItemTiposServicio(List<TiposServicio> itemTiposServicio) {
        this.itemTiposServicio = itemTiposServicio;
    }
 public void create(){
     try {
         getTiposServicioSession().create(currentTiposServicio);
     }catch (Exception ex){
         System.err.println(ex.getMessage());
     }
 } 
  
}
