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
@Table(name = "areas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Areas.findAll", query = "SELECT a FROM Areas a")
    , @NamedQuery(name = "Areas.findByIdAreas", query = "SELECT a FROM Areas a WHERE a.idAreas = :idAreas")
    , @NamedQuery(name = "Areas.findByNombrearea", query = "SELECT a FROM Areas a WHERE a.nombrearea = :nombrearea")})
public class Areas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_areas")
    private Integer idAreas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrearea")
    private String nombrearea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAreas")
    private List<Mesas> mesasList;

    public Areas() {
    }

    public Areas(Integer idAreas) {
        this.idAreas = idAreas;
    }

    public Areas(Integer idAreas, String nombrearea) {
        this.idAreas = idAreas;
        this.nombrearea = nombrearea;
    }

    public Integer getIdAreas() {
        return idAreas;
    }

    public void setIdAreas(Integer idAreas) {
        this.idAreas = idAreas;
    }

    public String getNombrearea() {
        return nombrearea;
    }

    public void setNombrearea(String nombrearea) {
        this.nombrearea = nombrearea;
    }

    @XmlTransient
    public List<Mesas> getMesasList() {
        return mesasList;
    }

    public void setMesasList(List<Mesas> mesasList) {
        this.mesasList = mesasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAreas != null ? idAreas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areas)) {
            return false;
        }
        Areas other = (Areas) object;
        if ((this.idAreas == null && other.idAreas != null) || (this.idAreas != null && !this.idAreas.equals(other.idAreas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoelRodas.entities.Areas[ idAreas=" + idAreas + " ]";
    }
    
}
