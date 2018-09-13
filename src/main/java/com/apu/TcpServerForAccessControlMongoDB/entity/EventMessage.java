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
@Document(collection = "EventMessage")
public class EventMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer eventMessId;
    private String description;
    private Date date;   
    private Integer deviceId;
    private Integer eventId;
    private Integer baseAccessMessId;
    private Integer ruleId;    

    public EventMessage() {
    }

    public EventMessage(Integer eventMessId) {
        this.eventMessId = eventMessId;
    }
    
    public EventMessage(Integer deviceId, Integer eventId, Integer baseAccessMessId, Integer ruleId, Date date, String description) {
        super();
        this.deviceId = deviceId;
        this.eventId = eventId;
        this.baseAccessMessId = baseAccessMessId;
        this.ruleId = ruleId;
        this.date = date;
        this.description = description;               
    }

    public Integer getEventMessId() {
        return eventMessId;
    }

    public void setEventMessId(Integer eventMessId) {
        this.eventMessId = eventMessId;
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

    public Integer getBaseAccessMessId() {
        return baseAccessMessId;
    }

    public void setBaseAccessMessId(Integer baseAccessMessId) {
        this.baseAccessMessId = baseAccessMessId;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventMessId != null ? eventMessId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventMessage)) {
            return false;
        }
        EventMessage other = (EventMessage) object;
        if ((this.eventMessId == null && other.eventMessId != null) || (this.eventMessId != null && !this.eventMessId.equals(other.eventMessId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apu.TcpServerForAccessControlMongoDB.entity.EventMessage[ eventMessId=" + eventMessId + " ]";
    }
    
}
