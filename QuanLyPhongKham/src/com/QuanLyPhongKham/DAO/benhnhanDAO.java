/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;
import com.QuanLyPhongKham.Model.BenhNhan; 
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author OS
 */
public class benhnhanDAO extends QLPhongKham_DAO<BenhNhan,Integer>{

    @Override
    public void insert(BenhNhan entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(BenhNhan entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BenhNhan> SelectAll() {
        String sql = "select * from benhnhan";
        return SelectBySQL(sql);
    }

    @Override
    public BenhNhan SelectByID(Integer id) {
        String sql = "select * from benhnhan where mabenhnhan=?";
        List<BenhNhan> list = SelectBySQL(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<BenhNhan> SelectBySQL(String sql, Object... args) {
        List<BenhNhan> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                BenhNhan model = new BenhNhan();
                model.setMabenhnhan(rs.getInt("mabenhnhan"));
                model.setTenbenhnhan(rs.getString("tenbenhnhan"));
                model.setSodienthoai(rs.getString("sodienthoai"));
                model.setGioitinh(rs.getString("gioitinh"));
                model.setNgaysinh(rs.getDate("ngaysinh"));
                model.setDiachi(rs.getString("diachi"));
                model.setManhanvien(rs.getString("manhanvien"));
                model.setTrangthai(rs.getString("trangthai"));
                list.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
