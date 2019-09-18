/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoelRodas.sessionbeans;

import com.JoelRodas.entities.Fatura;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sergi
 */
@Local
public interface FaturaFacadeLocal {

    void create(Fatura fatura);

    void edit(Fatura fatura);

    void remove(Fatura fatura);

    Fatura find(Object id);

    List<Fatura> findAll();

    List<Fatura> findRange(int[] range);

    int count();
    
}
