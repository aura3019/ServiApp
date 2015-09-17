package com.example.serviapp.jpa.entities;

import com.example.serviapp.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T14:14:32")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> idRol;
    public static volatile SingularAttribute<Rol, String> nombreRol;
    public static volatile ListAttribute<Rol, Usuario> usuarios;

}