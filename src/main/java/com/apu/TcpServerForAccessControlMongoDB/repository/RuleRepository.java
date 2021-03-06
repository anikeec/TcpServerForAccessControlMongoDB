/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.TcpServerForAccessControlMongoDB.repository;

import com.apu.TcpServerForAccessControlMongoDB.entity.Rule;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author apu
 */
public interface RuleRepository extends MongoRepository<Rule, Integer>{
    
    List<Rule> findByDeviceIdAndCardId(Integer deviceId, Integer cardId);
    
}
