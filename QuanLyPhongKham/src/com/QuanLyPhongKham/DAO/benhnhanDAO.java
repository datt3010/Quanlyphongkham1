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
public class benhnhanDAO extends QLPhongKham_DAO<BenhNhan, String> {

    String Insert_BenhNhan = "INSERT INTO benhnhan (mabenhnhan,tenbenhnhan,sodienthoai,gioitinh,ngaysinh,diachi,trangthai) VALUES(?,?,?,?,?,?,?)";
    String Update_BenhNhan = "UPDATE benhnhan SET tenbenhnhan=? , sodienthoai=? , gioitinh=? , ngaysinh=? , diachi=?,trangthai=? WHERE mabenhnhan like ?";
    String DELETE_BenhNhan = "DELETE FROM benhnhan WHERE mabenhnhan like ?";
    String SELECTALL_BenhNhan = "SELECT * FROM benhnhan";
    String SELECT_BY_ID_BenhNhan = "SELECT * FROM benhnhan WHERE mabenhnhan like ?";

    @Override
    public void insert(BenhNhan entity) {
        try {
            jdbcHelper.update(Insert_BenhNhan, entity.getMabenhnhan(), entity.getTenbenhnhan(), entity.getSodienthoai(), entity.getGioitinh(), XDate.toString(entity.getNgaysinh(), "YYYY-MM-dd"), entity.getDiachi(), entity.getTrangthai());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(BenhNhan entity) {

        String sql = "update benhnhan set tenbenhnhan=?,sodienthoai=?,gioitinh=?,ngaysinh=?,diachi=?,trangthai=? where mabenhnhan like?";
        jdbcHelper.update(sql, entity.getTenbenhnhan(), entity.getSodienthoai(), entity.getGioitinh(), XDate.toString(entity.getNgaysinh(), "YYYY-MM-dd"), entity.getDiachi(), entity.getTrangthai(), entity.getMabenhnhan());

        try {
            jdbcHelper.update(Update_BenhNhan, entity.getTenbenhnhan(), entity.getSodienthoai(), entity.getGioitinh(), XDate.toString(entity.getNgaysinh(), "YYYY-MM-dd"), entity.getDiachi(), entity.getTrangthai(), entity.getMabenhnhan());
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
    public BenhNhan SelectByID(String id) {
        String sql = "select * from benhnhan where mabenhnhan like ?";
        List<BenhNhan> list = SelectBySQL(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<BenhNhan> selectbyseach(String key1, String key2, String key3) {
        String sql = "select * from benhnhan where mabenhnhan like ? or tenbenhnhan like ? or gioitinh like ?";
        return SelectBySQL(sql, "%" + key1 + "%", "%" + key2 + "%", "%" + key3 + "%");
    }

    @Override
    protected List<BenhNhan> SelectBySQL(String sql, Object... args) {
        List<BenhNhan> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                BenhNhan model = new BenhNhan();
                model.setMabenhnhan(rs.getString("mabenhnhan"));
                model.setTenbenhnhan(rs.getString("tenbenhnhan"));
                model.setSodienthoai(rs.getString("sodienthoai"));
                model.setGioitinh(rs.getString("gioitinh"));
                model.setNgaysinh(rs.getDate("ngaysinh"));
                model.setDiachi(rs.getString("diachi"));
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
                + "WHERE tenbenhnhan LIKE ? OR sodienthoai LIKE ? OR diachi LIKE ?  OR mabenhnhan LIKE ?;";
        return this.SelectBySQL(sql, "%" + keyword + "%", "%" + keyword2 + "%", "%" + keyword3 + "%", "%" + keyword4 + "%");
    }

    @Override
    public void delete(String id) {
        String sql = "delete from benhnhan where mabenhnhan like ?";
        jdbcHelper.update(sql, id);

        try {
            jdbcHelper.update(DELETE_BenhNhan, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
