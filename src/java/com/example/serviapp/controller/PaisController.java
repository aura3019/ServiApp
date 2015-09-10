/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.controller;


import com.example.serviapp.entities.Pais;
import com.example.serviapp.session.PaisSession;
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

public class PaisController implements Serializable {
    
    @EJB
    private PaisSession paisSession;
    private Pais currentPais;
    private List<Pais>itemPais = null;

    public PaisController() {
    }

    public Pais getCurrentPais() {
        if (currentPais == null){
            currentPais = new Pais();
        }
        return currentPais;
    }

    public PaisSession getPaisSession() {
        return paisSession;
    }

    public void setPaisSession(PaisSession PaisSession) {
        this.paisSession = PaisSession;
    }

    public List<Pais> getItemPais() {
        if (itemPais == null){
            try{
                itemPais = getPaisSession().findAll();
            }  catch (Exception ex){
            System.err.print(ex.getMessage());}
        }
        return itemPais;
    }

    public void setItemPais(List<Pais> itemPais) {
        this.itemPais = itemPais;
    }
    
    public void create(){
        try {
            getPaisSession().create(currentPais);
        }catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * Creates a new instance of PaisController
     */

    
}
