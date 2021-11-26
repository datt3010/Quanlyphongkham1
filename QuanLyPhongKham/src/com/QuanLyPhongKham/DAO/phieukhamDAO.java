/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import com.QuanLyPhongKham.Model.PhieuKham;
import com.QuanLyPhongKham.Utilities.XDate;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List; 

/**
 *
 * @author OS
 */
public class phieukhamDAO extends QLPhongKham_DAO<PhieuKham, Integer>{
    String Insert_PhieuKham = "INSERT INTO phieukham (ngaykham,mabacsy,mabenhnhan,manhanvien,ketluan) VALUES(?,?,?,?,?)";
    String Update_PhieuKham = "UPDATE phieukham SET ngaykham=? , mabacsy=? , mabenhnhan=? , manhanvien=? , ketluan=? WHERE maphieukham = ?";
    String DELETE_PhieuKham = "DELETE FROM phieukham WHERE maphieukham=?";
    String SELECTALL_PhieuKham = "SELECT * FROM phieukham";
    String SELECT_BY_ID_PhieuKham ="SELECT * FROM phieukham WHERE maphieukham=?";
    
    @Override
    public void insert(PhieuKham entity) {
        try {
            jdbcHelper.update(Insert_PhieuKham, XDate.toString(entity.getNgaykham(), "yyyy-MM-dd"),entity.getMabacsy(),entity.getMabenhnhan(),entity.getManhanvien(),entity.getKetluan());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(PhieuKham entity) {
        try {
            jdbcHelper.update(Update_PhieuKham, XDate.toString(entity.getNgaykham(), "yyyy-MM-dd"),entity.getMabacsy(),entity.getMabenhnhan(),entity.getManhanvien(),entity.getKetluan(),entity.getMaphieukham());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            jdbcHelper.update(DELETE_PhieuKham, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<PhieuKham> SelectAll() {
        return this.SelectBySQL(SELECTALL_PhieuKham);
    }

    @Override
    public PhieuKham SelectByID(Integer id) {
       List<PhieuKham> list = this.SelectBySQL(SELECT_BY_ID_PhieuKham, id);
       if(list.isEmpty()){
           return null;
       }
       return list.get(0);
    }

    @Override
    protected List<PhieuKham> SelectBySQL(String sql, Object... args) {
        List<PhieuKham> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                PhieuKham pk = new PhieuKham();
                pk.setMaphieukham(rs.getInt("maphieukham"));
                pk.setNgaykham(rs.getDate("ngaykham"));
                pk.setMabacsy(rs.getString("mabacsy"));
                pk.setMabenhnhan(rs.getString("mabenhnhan"));
                pk.setManhanvien(rs.getString("manhanvien"));
                pk.setKetluan(rs.getString("ketluan"));
                list.add(pk);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<PhieuKham> Search(String k1,String k2, String k3){
        String sql = "Select * from phieukham where maphieukham not in (select maphieukham from toathuoc) and (ngaykham like ? or mabacsy like ? or manhanvien like ?)";
        return this.SelectBySQL(sql, "%"+k1+"%", "%"+k2+"%", "%"+k3+"%");
    }
    
}
