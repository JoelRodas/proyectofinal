/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoelRodas.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sergi
 */
@Embeddable
public class DetallefacturaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_factura")
    private int idFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_menu")
    private int idMenu;

    public DetallefacturaPK() {
    }

    public DetallefacturaPK(int idFactura, int idMenu) {
        this.idFactura = idFactura;
        this.idMenu = idMenu;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idFactura;
        hash += (int) idMenu;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallefacturaPK)) {
            return false;
        }
        DetallefacturaPK other = (DetallefacturaPK) object;
        if (this.idFactura != other.idFactura) {
            return false;
        }
        if (this.idMenu != other.idMenu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoelRodas.entities.DetallefacturaPK[ idFactura=" + idFactura + ", idMenu=" + idMenu + " ]";
    }
    
}
