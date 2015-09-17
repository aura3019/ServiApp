package com.example.serviapp.jpa.entities;

import com.example.serviapp.jpa.entities.Servicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T14:14:32")
@StaticMetamodel(TipoServicio.class)
public class TipoServicio_ { 

    public static volatile ListAttribute<TipoServicio, Servicio> servicios;
    public static volatile SingularAttribute<TipoServicio, String> nombre;
    public static volatile SingularAttribute<TipoServicio, Short> idTipoServicio;

}