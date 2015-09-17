package com.example.serviapp.jpa.entities;

import com.example.serviapp.jpa.entities.TipoServicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T14:14:32")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> descripcion;
    public static volatile SingularAttribute<Servicio, TipoServicio> tipoServicio;
    public static volatile SingularAttribute<Servicio, Double> valor;
    public static volatile SingularAttribute<Servicio, Integer> idServicio;
    public static volatile SingularAttribute<Servicio, String> nombre;

}