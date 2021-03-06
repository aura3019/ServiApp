
package com.example.serviapp.jsf.controller;


import com.example.serviapp.jpa.entities.Pais;
import com.example.serviapp.jpa.sessions.PaisSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class PaisController implements Serializable {

    @EJB //Enterprise Java Beans
    private PaisSession paisSession;

    private Pais selectedPais;
    private List<Pais> itemsPais = null;

    public PaisController() {
    }

    public Pais getSelectedPais() {
        if (selectedPais == null) {
            selectedPais = new Pais();
        }
        return selectedPais;
    }

    public void setSelectedPais(Pais selectedPais) {
        this.selectedPais = selectedPais;
    }

    public PaisSession getPaisSession() {
        return paisSession;
    }

    public List<Pais> getItemsPais() {
        if (itemsPais == null) {
            try {
                itemsPais = getPaisSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsPais;
    }

    public void create() {
        try {
            getPaisSession().create(selectedPais);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
