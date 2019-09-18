/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoelRodas.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sergi
 */
@Entity
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d")
    , @NamedQuery(name = "Detallefactura.findByIdFactura", query = "SELECT d FROM Detallefactura d WHERE d.detallefacturaPK.idFactura = :idFactura")
    , @NamedQuery(name = "Detallefactura.findByIdMenu", query = "SELECT d FROM Detallefactura d WHERE d.detallefacturaPK.idMenu = :idMenu")
    , @NamedQuery(name = "Detallefactura.findByCantidad", query = "SELECT d FROM Detallefactura d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallefactura.findByPrecioventa", query = "SELECT d FROM Detallefactura d WHERE d.precioventa = :precioventa")
    , @NamedQuery(name = "Detallefactura.findByTotalventa", query = "SELECT d FROM Detallefactura d WHERE d.totalventa = :totalventa")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallefacturaPK detallefacturaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioventa")
    private double precioventa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalventa")
    private Double totalventa;
    @JoinColumn(name = "id_factura", referencedColumnName = "id_factura", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Fatura fatura;
    @JoinColumn(name = "id_menu", referencedColumnName = "id_menu", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Menu menu;
    @JoinColumn(name = "id_cocinero", referencedColumnName = "id_cocinero")
    @ManyToOne(optional = false)
    private Cocineros idCocinero;

    public Detallefactura() {
    }

    public Detallefactura(DetallefacturaPK detallefacturaPK) {
        this.detallefacturaPK = detallefacturaPK;
    }

    public Detallefactura(DetallefacturaPK detallefacturaPK, int cantidad, double precioventa) {
        this.detallefacturaPK = detallefacturaPK;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
    }

    public Detallefactura(int idFactura, int idMenu) {
        this.detallefacturaPK = new DetallefacturaPK(idFactura, idMenu);
    }

    public DetallefacturaPK getDetallefacturaPK() {
        return detallefacturaPK;
    }

    public void setDetallefacturaPK(DetallefacturaPK detallefacturaPK) {
        this.detallefacturaPK = detallefacturaPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public Double getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(Double totalventa) {
        this.totalventa = totalventa;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Cocineros getIdCocinero() {
        return idCocinero;
    }

    public void setIdCocinero(Cocineros idCocinero) {
        this.idCocinero = idCocinero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallefacturaPK != null ? detallefacturaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.detallefacturaPK == null && other.detallefacturaPK != null) || (this.detallefacturaPK != null && !this.detallefacturaPK.equals(other.detallefacturaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoelRodas.entities.Detallefactura[ detallefacturaPK=" + detallefacturaPK + " ]";
    }
    
}
