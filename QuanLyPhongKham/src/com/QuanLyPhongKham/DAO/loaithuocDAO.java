/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import com.QuanLyPhongKham.Model.LoaiThuoc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OS
 */
public class loaithuocDAO extends QLPhongKham_DAO<LoaiThuoc, Integer>{
    String Insert_LoaiThuoc = "INSERT INTO loaithuoc (tenloai) VALUES(?)";
    String Update_LoaiThuoc = "UPDATE loaithuoc SET tenloai=? WHERE maloaithuoc = ?";
    String DELETE_LoaiThuoc = "DELETE FROM loaithuoc WHERE maloaithuoc=?";
    String SELECTALL_LoaiThuoc = "SELECT * FROM loaithuoc";
    String SELECT_BY_ID_LoaiThuoc ="SELECT * FROM loaithuoc WHERE maloaithuoc=?";
    @Override
    public void insert(LoaiThuoc entity) {
        try {
            jdbcHelper.update(Insert_LoaiThuoc, entity.getTenloai());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(LoaiThuoc entity) {
        try {
            jdbcHelper.update(Update_LoaiThuoc, entity.getTenloai(),entity.getMaloaithuoc());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            jdbcHelper.update(DELETE_LoaiThuoc, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<LoaiThuoc> SelectAll() {
        return this.SelectBySQL(SELECTALL_LoaiThuoc);
    }

    @Override
    public LoaiThuoc SelectByID(Integer id) {
        List<LoaiThuoc> list =this.SelectBySQL(SELECT_BY_ID_LoaiThuoc, id);
        return list.size()>0?list.get(0):null;
    }

    @Override
    protected List<LoaiThuoc> SelectBySQL(String sql, Object... args) {
        List<LoaiThuoc> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                LoaiThuoc lt = new LoaiThuoc();
                lt.setMaloaithuoc(rs.getInt("maloaithuoc"));
                lt.setTenloai(rs.getString("tenloai"));
                list.add(lt);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
