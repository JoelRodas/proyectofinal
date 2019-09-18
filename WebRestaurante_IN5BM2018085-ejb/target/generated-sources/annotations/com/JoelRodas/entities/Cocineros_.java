package com.JoelRodas.entities;

import com.JoelRodas.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:40")
@StaticMetamodel(Cocineros.class)
public class Cocineros_ { 

    public static volatile SingularAttribute<Cocineros, String> apellidos;
    public static volatile ListAttribute<Cocineros, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Cocineros, Integer> idCocinero;
    public static volatile SingularAttribute<Cocineros, String> nombres;

}