package com.JoelRodas.entities;

import com.JoelRodas.entities.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:39")
@StaticMetamodel(Platos.class)
public class Platos_ { 

    public static volatile SingularAttribute<Platos, String> descripcion;
    public static volatile ListAttribute<Platos, Menu> menuList;
    public static volatile SingularAttribute<Platos, Integer> idPlato;

}