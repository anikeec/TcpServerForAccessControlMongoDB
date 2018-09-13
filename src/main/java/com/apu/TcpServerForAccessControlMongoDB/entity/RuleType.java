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
@Document(collection = "RuleType")
public class RuleType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Integer ruleTypeId;
    private String description;

    public RuleType() {
    }

    public RuleType(Integer ruleTypeId) {
        this.ruleTypeId = ruleTypeId;
    }

    public RuleType(Integer ruleTypeId, String description) {
        super();
        this.ruleTypeId = ruleTypeId;
        this.description = description;
    }

    public Integer getRuleTypeId() {
        return ruleTypeId;
    }

    public void setRuleTypeId(Integer ruleTypeId) {
        this.ruleTypeId = ruleTypeId;
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
        hash += (ruleTypeId != null ? ruleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RuleType)) {
            return false;
        }
        RuleType other = (RuleType) object;
        if ((this.ruleTypeId == null && other.ruleTypeId != null) || (this.ruleTypeId != null && !this.ruleTypeId.equals(other.ruleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apu.TcpServerForAccessControlMongoDB.entity.RuleType[ ruleTypeId=" + ruleTypeId + " ]";
    }
    
}
