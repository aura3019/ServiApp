package com.example.serviapp.jpa.sessions;



import com.example.serviapp.jpa.entities.TipoDocumento;
import com.example.serviapp.jsf.controller.TipoDocumentoController;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import javax.persistence.criteria.CriteriaQuery;


@Stateless
public class TipoDocumentoSession {

    @PersistenceContext
    private EntityManager entityManager;
    
    public void create(TipoDocumento tipoDocumento) {
        entityManager.persist(tipoDocumento);
    }
    
    public void update(TipoDocumento tipoDocumento) {
        entityManager.merge(tipoDocumento);
    }
    
    public void remove(TipoDocumento tipoDocumento) {
        entityManager.remove(tipoDocumento);
    }
    
    public List<TipoDocumento> findAll(){
      CriteriaQuery cq =
              entityManager.getCriteriaBuilder().createQuery();
      cq.select(cq.from(TipoDocumento.class));
      return entityManager.createQuery(cq).getResultList();
              }  
    
}
