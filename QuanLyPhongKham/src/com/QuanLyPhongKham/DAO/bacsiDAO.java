/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;
import com.QuanLyPhongKham.Model.BacSi;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author OS
 */
public class bacsiDAO extends QLPhongKham_DAO<BacSi, String>{
    String Insert_BacSy = "INSERT INTO bacsy(mabacsy,tenbacsy,gioitinh,dienthoai,email,ngaysinh,hinh,machuyennganh) values(?,?,?,?,?,?,?,?) ";
    String Update_BacSy = "UPDATE bacsy SET tenbacsy = ?, gioitinh = ?, dienthoai = ?, email = ?, ngaysinh = ?, hinh = ?, machuyennganh = ? ";
    String Delete_BacSy = "DELETE FROM bacsy WHERE mabacsy=?";
    String SELECTALL_BacSy = "SELECT * FROM bacsy";
    String SELECT_BY_ID_BacSy ="SELECT * FROM bacsy WHERE mabacsy=?";
    @Override
    public void insert(BacSi entity) {
        try{
            jdbcHelper.update(Insert_BacSy, entity.getMabacsy(),entity.getTenbacsy(),entity.getGioitinh(),entity.getDienthoai(),entity.getEmail(),entity.getNgaysinh(),entity.getHinh(),entity.getMachuyennganh());
        }catch(Exception e){
            e.printStackTrace();
        }
               
    }

    @Override
    public void update(BacSi entity) {
        try{
            jdbcHelper.update(Update_BacSy, entity.getMabacsy(),entity.getTenbacsy(),entity.getGioitinh(),entity.getDienthoai(),entity.getEmail(),entity.getNgaysinh(),entity.getHinh(),entity.getMachuyennganh());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            jdbcHelper.update(Delete_BacSy, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<BacSi> SelectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BacSi SelectByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<BacSi> SelectBySQL(String sql, Object... args) {
        List<BacSi> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                BacSi bs = new BacSi();
                bs.setMabacsy(rs.getString("mabacsy"));
                bs.setTenbacsy(rs.getString("tenbacsy"));
                bs.setGioitinh(rs.getString("gioitinh"));
                bs.setDienthoai(rs.getString("dienthoai"));
                bs.setEmail(rs.getString("email"));
                bs.setHinh(rs.getString("hinh"));
                bs.setMachuyennganh(rs.getString("machuyennganh"));
                list.add(bs);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }      
}
