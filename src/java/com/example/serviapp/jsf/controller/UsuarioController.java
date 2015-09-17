package com.example.serviapp.jsf.controller;

import com.example.serviapp.jpa.entities.Ciudad;
import com.example.serviapp.jpa.entities.Departamento;
import com.example.serviapp.jpa.entities.TipoDocumento;
import com.example.serviapp.jpa.entities.Usuario;
import com.example.serviapp.jpa.sessions.UsuarioSession;
import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import java.util.List;
import java.util.StringTokenizer;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ViewScoped
public class UsuarioController implements Serializable {

    @EJB
    private UsuarioSession usuarioSession;

    private int idUsuario;
    private Usuario selectedUsuario;
    private int idCiudad;
    private int idDepartamento;
 private String idRol;
 private String idTipoDocumento;
    private List<Usuario> itemsUsuario = null;

    
    public UsuarioController() {
    }

    public Usuario getSelectedUsuario() {
        if (selectedUsuario == null) {
            selectedUsuario = new Usuario();
        }
        return selectedUsuario;
    }

    public void setSelectedUsuario(Usuario selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }

    public String getCiudad() {
        return idCiudad + "," + idDepartamento;
    }

    public void setCiudad(String ciudad) {
        StringTokenizer tokens = new StringTokenizer(ciudad, ",");
        idCiudad = Integer.parseInt(tokens.nextToken());
        idDepartamento = Integer.parseInt(tokens.nextToken());
    }


    public UsuarioSession getUsuarioSession() {
        return usuarioSession;
    }

    public List<Usuario> getItemsUsuario() {
        if (itemsUsuario == null) {
            try {
                itemsUsuario = getUsuarioSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsUsuario;
    }

    public void create() {
        try {
            selectedUsuario.setCiudad(new Ciudad(idCiudad, new Departamento(idDepartamento)));
            selectedUsuario.setTipoDocumento(new TipoDocumento(idTipoDocumento));
            getUsuarioSession().create(selectedUsuario);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
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

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(String idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    
}
