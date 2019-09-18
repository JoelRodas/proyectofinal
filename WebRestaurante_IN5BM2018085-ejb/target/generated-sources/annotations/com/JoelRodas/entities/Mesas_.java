package com.JoelRodas.entities;

import com.JoelRodas.entities.Areas;
import com.JoelRodas.entities.Fatura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:40")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idMesa;
    public static volatile SingularAttribute<Mesas, Areas> idAreas;
    public static volatile SingularAttribute<Mesas, String> escripcion;
    public static volatile ListAttribute<Mesas, Fatura> faturaList;

}