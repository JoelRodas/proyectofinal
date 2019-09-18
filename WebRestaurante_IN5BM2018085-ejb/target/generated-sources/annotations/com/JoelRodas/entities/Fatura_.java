package com.JoelRodas.entities;

import com.JoelRodas.entities.Clientes;
import com.JoelRodas.entities.Detallefactura;
import com.JoelRodas.entities.Mesas;
import com.JoelRodas.entities.Mesero;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:39")
@StaticMetamodel(Fatura.class)
public class Fatura_ { 

    public static volatile SingularAttribute<Fatura, Date> fecha;
    public static volatile SingularAttribute<Fatura, Mesas> idMesa;
    public static volatile SingularAttribute<Fatura, Clientes> idCliente;
    public static volatile SingularAttribute<Fatura, Mesero> idMesero;
    public static volatile ListAttribute<Fatura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Fatura, Integer> idFactura;

}