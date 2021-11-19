/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;
import com.QuanLyPhongKham.Model.ChuyenNganh;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author OS
 */
public class chuyennganhDAO extends QLPhongKham_DAO<ChuyenNganh, String>{
     String SELECTALL_BacSy = "SELECT * FROM chuyennganh";
    String SELECT_BY_ID_BacSy ="SELECT * FROM chuyennganh WHERE machuyennganh=?";
    @Override
    public void insert(ChuyenNganh entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ChuyenNganh entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChuyenNganh> SelectAll() {
        return this.SelectBySQL(SELECTALL_BacSy);
    }

    @Override
    public ChuyenNganh SelectByID(String id) {
        List<ChuyenNganh> list = SelectBySQL(SELECT_BY_ID_BacSy, id);
        return list.size()>0?list.get(0):null;
    }

    @Override
    protected List<ChuyenNganh> SelectBySQL(String sql, Object... args) {
        
        List<ChuyenNganh> list = new ArrayList<>();
        try{
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                ChuyenNganh cn = new ChuyenNganh();
                cn.setMachuyennganh(rs.getString("machuyennganh"));
                cn.setTenchuyennganh(rs.getString("tenchuyennganh"));
                list.add(cn);
            }
            rs.getStatement().getConnection().close();
        }catch(Exception e){
            e.fillInStackTrace();
        }
        return list;
        
    }
    
}
