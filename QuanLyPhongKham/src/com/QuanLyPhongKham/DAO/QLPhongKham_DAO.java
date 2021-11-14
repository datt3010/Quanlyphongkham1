/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import java.util.List;

/**
 *
 * @author OS
 */
abstract public class QLPhongKham_DAO <EntityType, KeyValue >{
    
    abstract public void insert(EntityType entity);
    abstract public void update(EntityType entity);
    abstract public void delete(KeyValue id);
    abstract public List<EntityType> SelectAll();
    abstract public EntityType SelectByID(KeyValue id);
    
    abstract protected List<EntityType> SelectBySQL(String sql , Object...args); 
}
