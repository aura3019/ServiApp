package com.example.serviapp.jpa.entities;

import com.example.serviapp.jpa.entities.Servicio;
import com.example.serviapp.jpa.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T14:14:32")
@StaticMetamodel(CalificacionServicio.class)
public class CalificacionServicio_ { 

    public static volatile SingularAttribute<CalificacionServicio, Date> fecha;
    public static volatile SingularAttribute<CalificacionServicio, Servicio> servicio;
    public static volatile SingularAttribute<CalificacionServicio, Byte> puntuacion;
    public static volatile SingularAttribute<CalificacionServicio, Usuario> usuario;
    public static volatile SingularAttribute<CalificacionServicio, String> comentario;

}