/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoelRodas.sessionbeans;

import com.JoelRodas.entities.Mesas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sergi
 */
@Local
public interface MesasFacadeLocal {

    void create(Mesas mesas);

    void edit(Mesas mesas);

    void remove(Mesas mesas);

    Mesas find(Object id);

    List<Mesas> findAll();

    List<Mesas> findRange(int[] range);

    int count();
    
}
