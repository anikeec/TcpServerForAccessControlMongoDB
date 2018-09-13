/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.TcpServerForAccessControlMongoDB.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apu
 */
@XmlRootElement
public class InfoMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer infoMessId;
    private String description;
    private Date date;

    public InfoMessage() {
    }

    public InfoMessage(Integer infoMessId) {
        this.infoMessId = infoMessId;
    }

    public Integer getInfoMessId() {
        return infoMessId;
    }

    public void setInfoMessId(Integer infoMessId) {
        this.infoMessId = infoMessId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infoMessId != null ? infoMessId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InfoMessage)) {
            return false;
        }
        InfoMessage other = (InfoMessage) object;
        if ((this.infoMessId == null && other.infoMessId != null) || (this.infoMessId != null && !this.infoMessId.equals(other.infoMessId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apu.TcpServerForAccessControlMongoDB.entity.InfoMessage[ infoMessId=" + infoMessId + " ]";
    }
    
}
