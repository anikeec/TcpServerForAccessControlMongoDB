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
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author apu
 */
@XmlRootElement
@Document(collection = "AccessMessage")
public class AccessMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer accessMessId;    
    private String description;
    private Date date;
    private Integer cardId;
    private Integer deviceId;
    private Integer eventId;

    public AccessMessage() {
    }

    public AccessMessage(Integer deviceId, Integer cardId, Integer eventId, Date date, String description) {
        super();
        this.description = description;
        this.date = date;
        this.cardId = cardId;
        this.deviceId = deviceId;
        this.eventId = eventId;
    }

    public AccessMessage(Integer accessMessId) {
        this.accessMessId = accessMessId;
    }

    public Integer getAccessMessId() {
        return accessMessId;
    }

    public void setAccessMessId(Integer accessMessId) {
        this.accessMessId = accessMessId;
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

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accessMessId != null ? accessMessId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessMessage)) {
            return false;
        }
        AccessMessage other = (AccessMessage) object;
        if ((this.accessMessId == null && other.accessMessId != null) || (this.accessMessId != null && !this.accessMessId.equals(other.accessMessId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apu.TcpServerForAccessControlMongoDB.entity.AccessMessage[ accessMessId=" + accessMessId + " ]";
    }
    
}
