/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;
import com.QuanLyPhongKham.Model.HoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author OS
 */
public class hoadonDAO extends QLPhongKham_DAO<HoaDon, Integer>{
    String Insert_ToaThuoc = "INSERT INTO chitietphieudichvu (maphieudichvu,madichvu,dongia) VALUES(?,?,?)";
    //String Update_ToaThuoc = "UPDATE toathuoc SET maphieukham=? , mathuoc=? , soluong=? , manhanvien=? , ketluan=? WHERE maphieukham = ?";
    String DELETE_ToaThuoc = "DELETE FROM chitietphieudichvu WHERE maphieudichvu=?";
    String SELECTALL_ToaThuoc = "SELECT * FROM chitietphieudichvu";
    String SELECT_BY_ID_ToaThuoc = "SELECT * FROM chitietphieudichvu WHERE maphieudichvu=?";

    @Override
    public void insert(HoaDon entity) {
        try {
            jdbcHelper.update(Insert_ToaThuoc, entity.getMaphieudichvu(), entity.getMadichvu(), entity.getDongia());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        jdbcHelper.update(DELETE_ToaThuoc, id);
    }

    @Override
    public List<HoaDon> SelectAll() {
        return this.SelectBySQL(SELECTALL_ToaThuoc);
    }

    @Override
    public HoaDon SelectByID(Integer id) {
        List<HoaDon> list = this.SelectBySQL(SELECT_BY_ID_ToaThuoc, id);
        return list.size()>0?list.get(0):null;
    }

    @Override
    protected List<HoaDon> SelectBySQL(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaphieudichvu(rs.getInt("maphieudichvu"));
                hd.setMadichvu(rs.getString("madichvu"));
                hd.setDongia(rs.getFloat("dongia"));
                list.add(hd);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
