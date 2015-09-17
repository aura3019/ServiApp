package com.example.serviapp.jpa.entities;

import com.example.serviapp.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-17T14:14:32")
@StaticMetamodel(TipoDocumento.class)
public class TipoDocumento_ { 

    public static volatile SingularAttribute<TipoDocumento, String> nombreDocumento;
    public static volatile SingularAttribute<TipoDocumento, String> idTipoDocumento;
    public static volatile ListAttribute<TipoDocumento, Usuario> usuarios;

}