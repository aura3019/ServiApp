package com.example.serviapp.jsf.controller;





import com.example.serviapp.jpa.entities.TipoDocumento;
import com.example.serviapp.jpa.sessions.TipoDocumentoSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class TipoDocumentoController implements Serializable {
    
    @EJB //Enterprise Java Beans
    private TipoDocumentoSession tipoDocumentoSession;
    
    private TipoDocumento selectedTipoDocumento;
    private List<TipoDocumento> itemsTipoDocumento = null;

    public TipoDocumentoController() {
    }

    public TipoDocumento getSelectedTipoDocumento() {
        if (selectedTipoDocumento == null){
            selectedTipoDocumento = new TipoDocumento();
        }
        return selectedTipoDocumento;
    }

    public void setSelectedTipoDocumento(TipoDocumento selectedTipoDocumento) {
        this.selectedTipoDocumento = selectedTipoDocumento;
    }

    public TipoDocumentoSession getTipoDocumentoSession() {
        return tipoDocumentoSession;
    }

    public void create (){
        try {
            getTipoDocumentoSession().create(selectedTipoDocumento);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } 
    }

    public List<TipoDocumento> getItemsTipoDocumento() {
       if (itemsTipoDocumento == null){
           try{
               itemsTipoDocumento = getTipoDocumentoSession().findAll();
           } catch (Exception ex){
               System.err.println(ex.getMessage());
           }
       }
      return itemsTipoDocumento;
    }
}