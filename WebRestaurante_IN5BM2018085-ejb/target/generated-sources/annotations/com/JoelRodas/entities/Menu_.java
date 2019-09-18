package com.JoelRodas.entities;

import com.JoelRodas.entities.Detallefactura;
import com.JoelRodas.entities.Platos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:40")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, Double> costo;
    public static volatile ListAttribute<Menu, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Menu, Integer> idMenu;
    public static volatile SingularAttribute<Menu, Platos> idPlato;
    public static volatile SingularAttribute<Menu, String> disponible;

}