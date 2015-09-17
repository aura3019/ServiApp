
package com.example.serviapp.jpa.sessions;


import com.example.serviapp.jpa.entities.CalificacionServicio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class CalificacionServicioSession {

   @PersistenceContext
   private EntityManager entityManager;
   
   public void create(CalificacionServicio calificacionServicio){
       entityManager.persist(calificacionServicio);
   }  
   
   public void edit(CalificacionServicio calificacionServicio) {
       entityManager.merge(calificacionServicio);
   }
   
   public void remove(CalificacionServicio calificacionServicio) {
       entityManager.remove(calificacionServicio);
   }
   
   public List<CalificacionServicio> findAll(){
       CriteriaQuery cq =
               entityManager.getCriteriaBuilder().createQuery();
       cq.select(cq.from(CalificacionServicio.class));
       return entityManager.createQuery(cq).getResultList();
   }
           
}
