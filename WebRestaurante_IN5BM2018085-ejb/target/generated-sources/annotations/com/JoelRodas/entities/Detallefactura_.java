package com.JoelRodas.entities;

import com.JoelRodas.entities.Cocineros;
import com.JoelRodas.entities.DetallefacturaPK;
import com.JoelRodas.entities.Fatura;
import com.JoelRodas.entities.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:40")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Fatura> fatura;
    public static volatile SingularAttribute<Detallefactura, DetallefacturaPK> detallefacturaPK;
    public static volatile SingularAttribute<Detallefactura, Double> totalventa;
    public static volatile SingularAttribute<Detallefactura, Cocineros> idCocinero;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Double> precioventa;
    public static volatile SingularAttribute<Detallefactura, Menu> menu;

}