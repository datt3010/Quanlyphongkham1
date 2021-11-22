/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import com.QuanLyPhongKham.Model.PhieuKham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ThongKeImpl implements ThongKeDAO{


    @Override
    public List<PhieuKham> getListByPhieuKham() {
        String sql = "SELECT ngay_dang_ky, COUNT(*) as so_luong FROM lop_hoc GROUP BY ngay_dang_ky;";
        List<PhieuKham> list = new ArrayList<>();
        try {
            
            ResultSet rs = jdbcHelper.query(sql);
            while (rs.next()) {
                PhieuKham pk = new PhieuKham();
                pk.setNgaykham(rs.getDate("ngaykham"));
                
                list.add(pk);
             }
            rs.close();
            
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
