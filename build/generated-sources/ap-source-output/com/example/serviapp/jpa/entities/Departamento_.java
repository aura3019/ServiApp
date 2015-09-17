package com.example.serviapp.jpa.entities;

import com.example.serviapp.jpa.entities.Ciudad;
import com.example.serviapp.jpa.entities.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T14:14:32")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> idDepartamento;
    public static volatile SingularAttribute<Departamento, String> nombreDepartamento;
    public static volatile ListAttribute<Departamento, Ciudad> ciudades;
    public static volatile SingularAttribute<Departamento, Pais> pais;

}