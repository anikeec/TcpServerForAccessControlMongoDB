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
@Document(collection = "Rule")
public class Rule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer ruleId;
    private Integer cardId;
    private Integer deviceId;
    private Integer eventId;
    private Integer ruleTypeId;
    private Date dateBegin;
    private Date dateEnd;


    public Rule() {
    }

    public Rule(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Rule(Integer ruleId, Integer cardId, Integer deviceId, Integer eventId, Integer ruleTypeId, Date dateBegin,
            Date dateEnd) {
        super();
        this.ruleId = ruleId;
        this.cardId = cardId;
        this.deviceId = deviceId;
        this.eventId = eventId;
        this.ruleTypeId = ruleTypeId;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
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

    public Integer getRuleTypeId() {
        return ruleTypeId;
    }

    public void setRuleTypeId(Integer ruleTypeId) {
        this.ruleTypeId = ruleTypeId;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ruleId != null ? ruleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rule)) {
            return false;
        }
        Rule other = (Rule) object;
        if ((this.ruleId == null && other.ruleId != null) || (this.ruleId != null && !this.ruleId.equals(other.ruleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apu.TcpServerForAccessControlMongoDB.entity.Rule[ ruleId=" + ruleId + " ]";
    }
    
}
