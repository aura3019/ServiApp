package com.example.serviapp.jpa.entities;


import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T14:14:32")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, Rol> rol;
    public static volatile SingularAttribute<Usuario, String> nombres;
    public static volatile SingularAttribute<Usuario, Date> fechaNac;
    public static volatile SingularAttribute<Usuario, TipoDocumento> tipoDocumento;
    public static volatile ListAttribute<Usuario, CalificacionServicio> calificacionesServicios;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Ciudad> ciudad;
    public static volatile SingularAttribute<Usuario, String> telefono;
    public static volatile SingularAttribute<Usuario, Character> sexo;
    public static volatile SingularAttribute<Usuario, Integer> idUsuarios;
    public static volatile SingularAttribute<Usuario, String> email;

}