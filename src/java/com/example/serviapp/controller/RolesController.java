/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.controller;

import com.example.serviapp.entities.Roles;
import com.example.serviapp.session.RolesSession;
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
public class RolesController implements Serializable {
    
    @EJB
    private RolesSession rolesSession;
    private Roles currentRoles;
    private List<Roles> itemRoles = null;

    public RolesController() {
    }

    public Roles getCurrentRoles() {
        if (currentRoles == null){
            currentRoles = new Roles();}
        return currentRoles;
    }

    public RolesSession getRolesSession() {
        return rolesSession;
    }

    public void setRolesSession(RolesSession RolesSession) {
        this.rolesSession = RolesSession;
    }

    public List<Roles> getItemRoles() {
        if (itemRoles == null){
            try {
                itemRoles = getRolesSession().findAll();
            }catch (Exception ex){
                System.err.println(ex.getMessage());}
        }
        return itemRoles;
    }

    public void setItemRoles(List<Roles> itemRoles) {
        this.itemRoles = itemRoles;
    }
    
    public void create(){
        try {
            getRolesSession().create(currentRoles);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }

    /**
     * Creates a new instance of RolesController
     */
    
    
}
