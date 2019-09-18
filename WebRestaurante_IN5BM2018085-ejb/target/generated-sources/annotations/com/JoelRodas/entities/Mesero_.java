package com.JoelRodas.entities;

import com.JoelRodas.entities.Fatura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:40")
@StaticMetamodel(Mesero.class)
public class Mesero_ { 

    public static volatile SingularAttribute<Mesero, String> apellidos;
    public static volatile SingularAttribute<Mesero, Integer> idMesero;
    public static volatile SingularAttribute<Mesero, Integer> porcentajepropina;
    public static volatile SingularAttribute<Mesero, String> nombres;
    public static volatile ListAttribute<Mesero, Fatura> faturaList;

}