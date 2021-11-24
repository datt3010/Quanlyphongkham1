/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import com.QuanLyPhongKham.Model.Thuoc;
import com.QuanLyPhongKham.Model.ToaThuoc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OS
 */
public class ToaThuocDao extends QLPhongKham_DAO<ToaThuoc, Integer> {

    String Insert_ToaThuoc = "INSERT INTO toathuoc (maphieukham,mathuoc,soluong,cachdung) VALUES(?,?,?,?)";
    //String Update_ToaThuoc = "UPDATE toathuoc SET maphieukham=? , mathuoc=? , soluong=? , manhanvien=? , ketluan=? WHERE maphieukham = ?";
    String DELETE_ToaThuoc = "DELETE FROM toathuoc WHERE maphieukham=?";
    String SELECTALL_ToaThuoc = "SELECT * FROM toathuoc";
    String SELECT_BY_ID_ToaThuoc = "SELECT * FROM toathuoc WHERE maphieukham=?";

    @Override
    public void insert(ToaThuoc entity) {
        try {
            jdbcHelper.update(Insert_ToaThuoc, entity.getMaphieukham(), entity.getMathuoc(), entity.getSoluong(), entity.getCachdung());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ToaThuoc entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        jdbcHelper.update(DELETE_ToaThuoc, id);
    }

    @Override
    public List<ToaThuoc> SelectAll() {
        return this.SelectBySQL(SELECTALL_ToaThuoc);
    }

    @Override
    public ToaThuoc SelectByID(Integer id) {
        List<ToaThuoc> list = this.SelectBySQL(SELECT_BY_ID_ToaThuoc, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<ToaThuoc> SelectBySQL(String sql, Object... args) {
        List<ToaThuoc> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                ToaThuoc th = new ToaThuoc();
                th.setMaphieukham(rs.getInt("maphieukham"));
                th.setMathuoc(rs.getString("mathuoc"));
                th.setSoluong(rs.getInt("soluong"));
                th.setCachdung(rs.getString("cachdung"));
                list.add(th);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    

}
