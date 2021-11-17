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

/**
 *
 * @author OS
 */
public class thuocDAO {

    private Object[] mathuoc;

    public void insert(Thuoc model) {
        String sql
                = "insert into thuoc(mathuoc,tenthuoc,donvitinh,dongia,cachdung,hansudung,maloaithuoc) values (?, ?, ?, ?, ?, ?,?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaThuoc(),
                model.getTennthuoc(),
                model.getDonvi(),
                model.getDonggia(),
                model.getCachdung(),
                model.getHansudung(),
                model.getMaloaithuoc()
        );
    }

    public void update(Thuoc model) {
        String sql
                = "UPDATE Thuoc SET tenthuoc=?,donvitinh=?,dongia=?,cachdung=?,hansudung=?,maloaithuoc=? WHERE mathuoc = ?";
        JdbcHelper.executeUpdate(sql,
                model.getMaThuoc(),
                model.getTennthuoc(),
                model.getDonvi(),
                model.getDonggia(),
                model.getCachdung(),
                model.getHansudung(),
                model.getMaloaithuoc(),
                model.getMaThuoc()
        );
    }

    public void delete(Integer MaKH) {
        String sql = "DELETE FROM Thuoc WHERE mathuoc=?";
        JdbcHelper.executeUpdate(sql, mathuoc);
    }

    public List<Thuoc> select() {
        String sql = "SELECT * FROM Thuoc";
        return select(sql);
    }

    public Thuoc findById(Integer makh) {
        String sql = "SELECT * FROM Thuoc WHERE mathuoc=?";
        List<Thuoc> list = select(sql, mathuoc);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<Thuoc> select(String sql, Object... args) {
        List<Thuoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Thuoc model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Thuoc readFromResultSet(ResultSet rs) throws SQLException {
        Thuoc model = new Thuoc();
        model.setMaThuoc(rs.getString("maThuoc"));
        model.setTennthuoc(rs.getString("tenthuoc"));
        model.setDonvi(rs.getString("donvitinh"));
        model.setDonggia(rs.getInt("dongia"));
        model.setCachdung(rs.getString("cachdung"));
        model.setHansudung(rs.getDate("hansudung"));
        model.setMaloaithuoc(rs.getInt("dongia"));
        return model;

    }
}
