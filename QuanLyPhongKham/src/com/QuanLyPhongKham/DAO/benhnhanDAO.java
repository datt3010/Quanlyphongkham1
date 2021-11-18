/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import com.QuanLyPhongKham.Model.BenhNhan;
import com.QuanLyPhongKham.Utilities.XDate;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.QuanLyPhongKham.Model.PhieuKham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OS
 */
public class benhnhanDAO extends QLPhongKham_DAO<BenhNhan, Integer> {

    String Insert_BenhNhan = "INSERT INTO benhnhan (tenbenhnhan,sodienthoai,gioitinh,ngaysinh,diachi,madichvu,trangthai) VALUES(?,?,?,?,?,?,?)";
    String Update_BenhNhan = "UPDATE benhnhan SET tenbenhnhan=? , sodienthoai=? , gioitinh=? , ngaysinh=? , diachi=?, madichvu=?,trangthai=? WHERE mabenhnhan = ?";
    String DELETE_BenhNhan = "DELETE FROM benhnhan WHERE mabenhnhan=?";
    String SELECTALL_BenhNhan = "SELECT * FROM benhnhan";
    String SELECT_BY_ID_BenhNhan = "SELECT * FROM benhnhan WHERE mabenhnhan=?";

    @Override
    public void insert(BenhNhan entity) {
        try {
            jdbcHelper.update(Insert_BenhNhan, entity.getTenbenhnhan(), entity.getSodienthoai(), entity.getGioitinh(), XDate.toString(entity.getNgaysinh(), "YYYY-MM-dd"), entity.getDiachi(), entity.getMadichvu(), entity.getTrangthai());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(BenhNhan entity) {

        String sql = "update benhnhan set tenbenhnhan=?,sodienthoai=?,gioitinh=?,ngaysinh=?,diachi=?,madichvu=?,trangthai=? where mabenhnhan=?";
        jdbcHelper.update(sql, entity.getTenbenhnhan(), entity.getSodienthoai(), entity.getGioitinh(), XDate.toString(entity.getNgaysinh(), "YYYY-MM-dd"), entity.getDiachi(), entity.getMadichvu(), entity.getTrangthai(), entity.getMabenhnhan());

        try {
            jdbcHelper.update(Update_BenhNhan, entity.getTenbenhnhan(), entity.getSodienthoai(), entity.getGioitinh(), XDate.toString(entity.getNgaysinh(), "YYYY-MM-dd"), entity.getDiachi(), entity.getMadichvu(), entity.getTrangthai(), entity.getMabenhnhan());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Integer id) {

        String sql = "delete from benhnhan where mabenhnhan=?";
        jdbcHelper.update(sql, id);

        try {
            jdbcHelper.update(DELETE_BenhNhan, id);
        } catch (Exception e) {
            e.printStackTrace();
        }

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

    public List<BenhNhan> selectbyseach(String key1, String key2) {
        String sql = "select * from benhnhan where mabenhnhan like ? or tenbenhnhan like ?";
        return SelectBySQL(sql, "%" + key1 + "%", "%" + key2 + "%");
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
                model.setMadichvu(rs.getString("madichvu"));
                model.setTrangthai(rs.getString("trangthai"));
                list.add(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<BenhNhan> SelectKeyword(String keyword, String keyword2, String keyword3, String keyword4, String keyword5) {
        String sql = "SELECT * FROM benhnhan\n"
                + "WHERE tenbenhnhan LIKE ? OR sodienthoai LIKE ? OR diachi LIKE ? OR manhanvien LIKE ? OR mabenhnhan LIKE ?;";
        return this.SelectBySQL(sql, "%" + keyword + "%", "%" + keyword2 + "%", "%" + keyword3 + "%", "%" + keyword4 + "%", "%" + keyword5 + "%");
    }

}
