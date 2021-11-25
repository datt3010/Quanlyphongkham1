/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.QuanLyPhongKham.Model.Thuoc;
import com.QuanLyPhongKham.Utilities.JdbcHelper;
import com.QuanLyPhongKham.Utilities.XDate;

/**
 *
 * @author OS
 */
public class thuocDAO extends QLPhongKham_DAO<Thuoc, String> {
    
    String Insert_Thuoc = "INSERT INTO thuoc(mathuoc,tenthuoc,donvitinh,maloaithuoc) values (?,?,?,?);";
    String Update_Thuoc = "UPDATE thuoc SET tenthuoc=? , donvitinh=? , maloaithuoc=? WHERE mathuoc =?;";
    String Delete_Thuoc = "DELETE FROM thuoc Where mathuoc =?;";
    String SelectAll_Thuoc = "Select * from thuoc;";
    String SelectByID_Thuoc = "Select * from thuoc where mathuoc = ?;";

    @Override
    public void insert(Thuoc entity) {
        try {
            jdbcHelper.update(Insert_Thuoc, entity.getMaThuoc(),entity.getTenthuoc(),entity.getDonvitinh(),entity.getMaloaithuoc());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Thuoc entity) {
        try {
            jdbcHelper.update(Update_Thuoc,entity.getTenthuoc(),entity.getDonvitinh(),entity.getMaloaithuoc(), entity.getMaThuoc());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        jdbcHelper.update(Delete_Thuoc, id);
    }

    @Override
    public List<Thuoc> SelectAll() {
        return this.SelectBySQL(SelectAll_Thuoc);
    }

    @Override
    public Thuoc SelectByID(String id) {
        List<Thuoc> list = this.SelectBySQL(SelectByID_Thuoc, id);
        return list.size()>0?list.get(0):null;
    }

    @Override
    protected List<Thuoc> SelectBySQL(String sql, Object... args) {
        List<Thuoc> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                Thuoc th = new Thuoc();
                th.setMaThuoc(rs.getString("mathuoc"));
                th.setTenthuoc(rs.getString("tenthuoc"));
                th.setDonvitinh(rs.getString("donvitinh"));
                th.setMaloaithuoc(rs.getInt("maloaithuoc"));
                list.add(th);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Thuoc> SearchKeyWord(String k1,String k2,String k3){
        String sql ="select * from thuoc\n"
                +"where mathuoc like ? or tenthuoc like ? or donvitinh like ?;";
        return this.SelectBySQL(sql, "%"+k1+"%", "%"+k2+"%", "%"+k3+"%" );
    }
    
    public List<Thuoc> SearchtoMaLoaiThuoc(int tenloai, String k1 , String k2, String k3){
        String sql = "Select * from thuoc where maloaithuoc = ? and (mathuoc like ? or tenthuoc like ? or donvitinh like ?)";
        return this.SelectBySQL(sql, tenloai,"%"+k1+"%","%"+k2+"%","%"+k3+"%");
    }
    
    public Thuoc selectMaThuoc(String tenthuoc){
        String sql = "select * where tenthuoc like ?";
        List<Thuoc> list = this.SelectBySQL(sql, "%"+tenthuoc+"%");
        return list.size()>0?list.get(0):null;
    }
   
}
