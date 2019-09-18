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
@Table(name = "mesero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesero.findAll", query = "SELECT m FROM Mesero m")
    , @NamedQuery(name = "Mesero.findByIdMesero", query = "SELECT m FROM Mesero m WHERE m.idMesero = :idMesero")
    , @NamedQuery(name = "Mesero.findByNombres", query = "SELECT m FROM Mesero m WHERE m.nombres = :nombres")
    , @NamedQuery(name = "Mesero.findByApellidos", query = "SELECT m FROM Mesero m WHERE m.apellidos = :apellidos")
    , @NamedQuery(name = "Mesero.findByPorcentajepropina", query = "SELECT m FROM Mesero m WHERE m.porcentajepropina = :porcentajepropina")})
public class Mesero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mesero")
    private Integer idMesero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentajepropina")
    private int porcentajepropina;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMesero")
    private List<Fatura> faturaList;

    public Mesero() {
    }

    public Mesero(Integer idMesero) {
        this.idMesero = idMesero;
    }

    public Mesero(Integer idMesero, String nombres, String apellidos, int porcentajepropina) {
        this.idMesero = idMesero;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.porcentajepropina = porcentajepropina;
    }

    public Integer getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(Integer idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getPorcentajepropina() {
        return porcentajepropina;
    }

    public void setPorcentajepropina(int porcentajepropina) {
        this.porcentajepropina = porcentajepropina;
    }

    @XmlTransient
    public List<Fatura> getFaturaList() {
        return faturaList;
    }

    public void setFaturaList(List<Fatura> faturaList) {
        this.faturaList = faturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMesero != null ? idMesero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesero)) {
            return false;
        }
        Mesero other = (Mesero) object;
        if ((this.idMesero == null && other.idMesero != null) || (this.idMesero != null && !this.idMesero.equals(other.idMesero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoelRodas.entities.Mesero[ idMesero=" + idMesero + " ]";
    }
    
}
