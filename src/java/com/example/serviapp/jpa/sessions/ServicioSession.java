
package com.example.serviapp.jpa.sessions;


import com.example.serviapp.jpa.entities.Servicio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class ServicioSession {

   @PersistenceContext
   private EntityManager entityManager;
   
   public void create(Servicio servicio){
       entityManager.persist(servicio);
   }  
   
   public void edit(Servicio servicio) {
       entityManager.merge(servicio);
   }
   
   public void remove(Servicio servicio) {
       entityManager.remove(servicio);
   }
   
   public List<Servicio> findAll(){
       CriteriaQuery cq =
               entityManager.getCriteriaBuilder().createQuery();
       cq.select(cq.from(Servicio.class));
       return entityManager.createQuery(cq).getResultList();
   }
           
}
