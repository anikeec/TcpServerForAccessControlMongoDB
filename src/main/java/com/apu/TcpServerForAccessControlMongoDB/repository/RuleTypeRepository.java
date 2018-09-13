/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.TcpServerForAccessControlMongoDB.repository;

import com.apu.TcpServerForAccessControlMongoDB.entity.RuleType;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author apu
 */
public interface RuleTypeRepository extends MongoRepository<RuleType, Integer>{
    
    List<RuleType> findByRuleTypeId(Integer ruleTypeId);
    
}
