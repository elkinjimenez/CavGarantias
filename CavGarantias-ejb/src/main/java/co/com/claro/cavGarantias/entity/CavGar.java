/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.cavGarantias.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jimenezelkg
 */
@Entity
@Table(name = "CAV_GAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CavGar.findAll", query = "SELECT c FROM CavGar c")
    , @NamedQuery(name = "CavGar.findById", query = "SELECT c FROM CavGar c WHERE c.id = :id")
    , @NamedQuery(name = "CavGar.findByCodeCav", query = "SELECT c FROM CavGar c WHERE c.codeCav = :codeCav")
    , @NamedQuery(name = "CavGar.findByNameCav", query = "SELECT c FROM CavGar c WHERE c.nameCav = :nameCav")
    , @NamedQuery(name = "CavGar.findByAddress", query = "SELECT c FROM CavGar c WHERE c.address = :address")
    , @NamedQuery(name = "CavGar.findByCst", query = "SELECT c FROM CavGar c WHERE c.cst = :cst")
    , @NamedQuery(name = "CavGar.findByModel", query = "SELECT c FROM CavGar c WHERE c.model = :model")})
public class CavGar implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_CAV")
    private short codeCav;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "NAME_CAV")
    private String nameCav;
    @Size(max = 250)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CST")
    private String cst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "MODEL")
    private String model;

    public CavGar() {
    }

    public CavGar(BigDecimal id) {
        this.id = id;
    }

    public CavGar(BigDecimal id, short codeCav, String nameCav, String cst, String model) {
        this.id = id;
        this.codeCav = codeCav;
        this.nameCav = nameCav;
        this.cst = cst;
        this.model = model;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public short getCodeCav() {
        return codeCav;
    }

    public void setCodeCav(short codeCav) {
        this.codeCav = codeCav;
    }

    public String getNameCav() {
        return nameCav;
    }

    public void setNameCav(String nameCav) {
        this.nameCav = nameCav;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CavGar)) {
            return false;
        }
        CavGar other = (CavGar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.cavGarantias.entity.CavGar[ id=" + id + " ]";
    }
    
}
