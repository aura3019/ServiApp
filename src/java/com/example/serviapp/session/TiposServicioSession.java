/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.session;

import com.example.serviapp.entities.TiposServicio;
import com.example.serviapp.entities.TiposServicio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Jimmy
 */
@Stateless
public class TiposServicioSession {

    @PersistenceContext
   private EntityManager entityManager;
   
   public void create(TiposServicio tiposServicio){
       entityManager.persist(tiposServicio);
   }    
   public void edit(TiposServicio tiposServicio){
       entityManager.merge(tiposServicio);
   }
       
   public void remove(TiposServicio tiposServicio){
       entityManager.remove(tiposServicio);
   }    
   public List<TiposServicio> findAll(){
       CriteriaQuery cq=
               entityManager.getCriteriaBuilder().createQuery();
       cq.select(cq.from(TiposServicio.class));
       return entityManager.createQuery(cq).getResultList();         
   }
}
  
