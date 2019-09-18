package com.JoelRodas.entities;

import com.JoelRodas.entities.Mesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T20:35:40")
@StaticMetamodel(Areas.class)
public class Areas_ { 

    public static volatile SingularAttribute<Areas, String> nombrearea;
    public static volatile SingularAttribute<Areas, Integer> idAreas;
    public static volatile ListAttribute<Areas, Mesas> mesasList;

}