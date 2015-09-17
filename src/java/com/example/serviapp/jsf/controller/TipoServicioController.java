package com.example.serviapp.jsf.controller;


import com.example.serviapp.jpa.entities.TipoServicio;
import com.example.serviapp.jpa.sessions.TipoServicioSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class TipoServicioController implements Serializable {
    
    @EJB //Enterprise Java Beans
    private TipoServicioSession tipoServicioSession;
    
    private TipoServicio selectedTipoServicio;
    private List<TipoServicio> itemsTipoServicio = null;

   
    public TipoServicioController() {
    }

    public TipoServicio getSelectedTipoServicio() {
        if (selectedTipoServicio == null) {
            selectedTipoServicio = new TipoServicio();
        }
        return selectedTipoServicio;
    }

    public void setSelectedTipoServicio(TipoServicio selectedTipoServicio) {
        this.selectedTipoServicio = selectedTipoServicio;
    }

    public TipoServicioSession getTipoServicioSession() {
        return tipoServicioSession;
    }
    
    public void create () {
        try {
            getTipoServicioSession().create(selectedTipoServicio);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public List<TipoServicio> getItemsTipoServicio() {
        if (itemsTipoServicio == null) {
            try {
                itemsTipoServicio = getTipoServicioSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsTipoServicio;
    }    
}
