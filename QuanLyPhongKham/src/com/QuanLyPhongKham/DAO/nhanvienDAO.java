/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;
import com.QuanLyPhongKham.Model.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author p
 */
public class nhanvienDAO extends QLPhongKham_DAO<NhanVien, String>{
    String Insert_NhanVien = "Insert into NhanVien ( manhanvien, tennhanvien, gioitinh, ngaysinh, matkhau, chucvu, sodienthoai, diachi, hinh ) VALUES(?,?,?,?,?,?,?,?,?,?)";
    String Update_NhanVien = "Update NhanVien SET manhienvien=?, tennhanvien=?, gioitinh=?, ngaysinh=?, matkhau=?, chucvu=?, sodienthoai=?, diachi=?, hinh=? Where manhanvien=?";
    String DELETE_NhanVien = "DELETE FROM nhanvien WHERE manhanvien=?";
    String SELECTALL_NhanVien = "SELECT * FROM nhanvien";
    String SELECT_BY_ID_NhanVien ="SELECT * FROM nhanvien WHERE manhanvien=?";
    @Override
    public void insert(NhanVien entity) {
         try {
            jdbcHelper.update(Insert_NhanVien, entity.getManhanvien(),entity.getTennhanvien(),entity.getGioitinh(),entity.getNgaysinh(),entity.getMatkhau(),
                    entity.getChucvu(),entity.getSodienthoai(),entity.getDiachi(),entity.getHinh());
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override
    public void update(NhanVien entity) {
         try {
            jdbcHelper.update(Update_NhanVien, entity.getManhanvien(),entity.getTennhanvien(),entity.getGioitinh(),entity.getNgaysinh(),entity.getMatkhau(),
                    entity.getChucvu(),entity.getSodienthoai(),entity.getDiachi(),entity.getHinh());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete(String id) {
        try {
            jdbcHelper.update(DELETE_NhanVien, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public List<NhanVien> SelectAll() {
        String sql="select * from nhanvien";
        return SelectBySQL(sql);
    }

    @Override
    public NhanVien SelectByID(String id) {
        String sql = "select * from nhanvien where manhanvien like ?";
        List<NhanVien> list = SelectBySQL(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
 
    @Override
    protected List<NhanVien> SelectBySQL(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien model = new NhanVien();
                model.setManhanvien(rs.getString("manhanvien"));
                model.setTennhanvien(rs.getString("tennhanvien"));
                model.setGioitinh(rs.getString("gioitinh"));
                model.setNgaysinh(rs.getDate("ngaysinh"));
                model.setMatkhau(rs.getString("matkhau"));
                model.setChucvu(rs.getString("chucvu"));
                model.setSodienthoai(rs.getString("sodienthoai"));
                model.setDiachi(rs.getString("diachi"));
                model.setHinh(rs.getString("hinh"));
                list.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
