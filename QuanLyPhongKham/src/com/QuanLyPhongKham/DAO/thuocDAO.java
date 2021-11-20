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
public class thuocDAO {

    public void insert(Thuoc model) {
        String sql
                = "insert into thuoc(mathuoc,tenthuoc,donvitinh,hansudung,maloaithuoc) values (?, ?, ?, ?,?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaThuoc(),
                model.getTennthuoc(),
                model.getDonvi(),
                XDate.toString(model.getHansudung()),
                model.getMaloaithuoc()
        );
    }

    public void update(Thuoc model) {
        String sql
                = "UPDATE Thuoc SET tenthuoc=?,donvitinh=?,hansudung=?,maloaithuoc=? WHERE mathuoc = ?";
        JdbcHelper.executeUpdate(sql,
                model.getTennthuoc(),
                model.getDonvi(),
                XDate.toString(model.getHansudung()),
                model.getMaloaithuoc(),
                model.getMaThuoc()
        );
    }

    public void delete(String id) {
        String sql = "DELETE FROM Thuoc WHERE mathuoc=?";
        JdbcHelper.executeUpdate(sql, id);
    }

    public List<Thuoc> selectAll() {
        String sql = "SELECT * FROM Thuoc";
        return select(sql);
    }

    public Thuoc findById(String id) {
        String sql = "SELECT * FROM Thuoc WHERE mathuoc=?";
        List<Thuoc> list = select(sql, id);
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
        model.setHansudung(rs.getDate("hansudung"));
        model.setMaloaithuoc(rs.getInt("maloaithuoc"));
        return model;

    }
}
