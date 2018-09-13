/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.TcpServerForAccessControlMongoDB.entity;

import java.io.Serializable;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author apu
 */
@XmlRootElement
@Document(collection = "EventType")
public class EventType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer eventId;
    private String description;

    public EventType() {
    }

    public EventType(Integer eventId) {
        this.eventId = eventId;
    }

    public EventType(Integer eventId, String description) {
        super();
        this.eventId = eventId;
        this.description = description;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventType)) {
            return false;
        }
        EventType other = (EventType) object;
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apu.TcpServerForAccessControlMongoDB.entity.EventType[ eventId=" + eventId + " ]";
    }
    
}
