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
@Document(collection = "AccessMessageWrong")
public class AccessMessageWrong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer accessMessId;
    private String cardNumber;
    private Integer deviceNumber;
    private Integer eventId;
    private String description;
    private Date date;

    public AccessMessageWrong() {
    }

    public AccessMessageWrong(Integer accessMessId) {
        this.accessMessId = accessMessId;
    }
    
    public AccessMessageWrong(String cardNumber, Integer deviceNumber, Integer eventId, Date date, String description) {
        this.cardNumber = cardNumber;
        this.deviceNumber = deviceNumber;
        this.eventId = eventId;
        this.description = description;
        this.date = date;
    }

    public AccessMessageWrong(Integer accessMessId, String cardNumber, Integer deviceNumber, Integer eventId, String description, Date date) {
        this.accessMessId = accessMessId;
        this.cardNumber = cardNumber;
        this.deviceNumber = deviceNumber;
        this.eventId = eventId;
        this.description = description;
        this.date = date;
    }

    public Integer getAccessMessId() {
        return accessMessId;
    }

    public void setAccessMessId(Integer accessMessId) {
        this.accessMessId = accessMessId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceId(Integer deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
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
        hash += (accessMessId != null ? accessMessId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessMessageWrong)) {
            return false;
        }
        AccessMessageWrong other = (AccessMessageWrong) object;
        if ((this.accessMessId == null && other.accessMessId != null) || (this.accessMessId != null && !this.accessMessId.equals(other.accessMessId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apu.TcpServerForAccessControlMongoDB.entity.AccessMessageWrong[ accessMessId=" + accessMessId + " ]";
    }
    
}
