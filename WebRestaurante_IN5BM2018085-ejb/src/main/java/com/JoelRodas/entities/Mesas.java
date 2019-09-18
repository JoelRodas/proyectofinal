/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoelRodas.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sergi
 */
@Entity
@Table(name = "mesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesas.findAll", query = "SELECT m FROM Mesas m")
    , @NamedQuery(name = "Mesas.findByIdMesa", query = "SELECT m FROM Mesas m WHERE m.idMesa = :idMesa")
    , @NamedQuery(name = "Mesas.findByEscripcion", query = "SELECT m FROM Mesas m WHERE m.escripcion = :escripcion")})
public class Mesas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mesa")
    private Integer idMesa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "escripcion")
    private String escripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMesa")
    private List<Fatura> faturaList;
    @JoinColumn(name = "id_areas", referencedColumnName = "id_areas")
    @ManyToOne(optional = false)
    private Areas idAreas;

    public Mesas() {
    }

    public Mesas(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public Mesas(Integer idMesa, String escripcion) {
        this.idMesa = idMesa;
        this.escripcion = escripcion;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public String getEscripcion() {
        return escripcion;
    }

    public void setEscripcion(String escripcion) {
        this.escripcion = escripcion;
    }

    @XmlTransient
    public List<Fatura> getFaturaList() {
        return faturaList;
    }

    public void setFaturaList(List<Fatura> faturaList) {
        this.faturaList = faturaList;
    }

    public Areas getIdAreas() {
        return idAreas;
    }

    public void setIdAreas(Areas idAreas) {
        this.idAreas = idAreas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMesa != null ? idMesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesas)) {
            return false;
        }
        Mesas other = (Mesas) object;
        if ((this.idMesa == null && other.idMesa != null) || (this.idMesa != null && !this.idMesa.equals(other.idMesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoelRodas.entities.Mesas[ idMesa=" + idMesa + " ]";
    }
    
}
