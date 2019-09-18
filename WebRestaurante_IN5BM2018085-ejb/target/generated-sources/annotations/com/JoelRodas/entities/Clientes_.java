package com.JoelRodas.entities;

import com.JoelRodas.entities.Fatura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:40")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile SingularAttribute<Clientes, Integer> idCliente;
    public static volatile SingularAttribute<Clientes, String> correo;
    public static volatile SingularAttribute<Clientes, String> nit;
    public static volatile SingularAttribute<Clientes, String> nombres;
    public static volatile ListAttribute<Clientes, Fatura> faturaList;

}