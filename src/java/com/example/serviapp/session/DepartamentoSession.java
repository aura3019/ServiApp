/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.serviapp.session;

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
public class DepartamentoSession {

     @PersistenceContext
   private EntityManager entityManager;
   
   public void create(DepartamentoSession departamento){
       entityManager.persist(departamento);
   }    
   public void edit(DepartamentoSession departamento){
       entityManager.merge(departamento);
   }
       
   public void remove(DepartamentoSession departamento){
       entityManager.remove(departamento);
   }    
   public List<DepartamentoSession> findAll(){
       CriteriaQuery cq=
               entityManager.getCriteriaBuilder().createQuery();
       cq.select(cq.from(DepartamentoSession.class));
       return entityManager.createQuery(cq).getResultList();         
   }
}
       
