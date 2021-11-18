/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import com.QuanLyPhongKham.Model.BenhNhan;
import com.QuanLyPhongKham.Model.DichVu;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OS
 */
public class dichVuDAO extends QLPhongKham_DAO<DichVu, String> {

//    String Insert_LoaiThuoc = "INSERT INTO loaithuoc (tenloai) VALUES(?)";
//    String Update_LoaiThuoc = "UPDATE loaithuoc SET tenloai=? WHERE maloaithuoc = ?";
//    String DELETE_LoaiThuoc = "DELETE FROM loaithuoc WHERE maloaithuoc=?";
    String SELECTALL_DichVu = "SELECT * FROM dichvu";
    String SELECT_BY_ID_DichVu = "SELECT * FROM dichvu WHERE madichvu like ?";

    @Override
    public void insert(DichVu entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(DichVu entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DichVu> SelectAll() {
       return this.SelectBySQL(SELECTALL_DichVu);
    }

    @Override
    public DichVu SelectByID(String id) {
        List<DichVu> list = this.SelectBySQL(SELECT_BY_ID_DichVu, id);
        return list.size()>0?list.get(0):null;
    }

    @Override
    protected List<DichVu> SelectBySQL(String sql, Object... args) {
        List<DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                DichVu dv = new DichVu();
                dv.setMadichvu(rs.getString("madichvu"));
                dv.setTendichvu(rs.getString("tendichvu"));
                dv.setGiatien(rs.getFloat("giatien"));
                list.add(dv);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<DichVu> SelectKeyword(String keyword,String keyword2) {
        String sql = "SELECT * FROM dichvu\n"
                + "WHERE madichvu LIKE ? OR tendichvu LIKE ?;";
        return this.SelectBySQL(sql, "%"+keyword+"%", "%"+keyword2+"%");
    }

}
