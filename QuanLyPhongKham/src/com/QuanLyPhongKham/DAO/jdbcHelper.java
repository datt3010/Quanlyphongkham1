/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author OS
 */
public class jdbcHelper {

    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url = "jdbc:sqlserver://localhost:1433;database=quanlyphongkham;";
    static String user = "sa";
    static String pass = "123";
    static{
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Tạo ra Statement
    //String sql = câu lệnh sql
    //Object...args : Các dấu ?
    public static PreparedStatement getstmt(String sql , Object...args) throws SQLException{
        Connection con = DriverManager.getConnection(url,user,pass);
        PreparedStatement psmt = null;
        if(sql.trim().startsWith("{")){
            psmt = con.prepareCall(sql);
        }else{
            psmt = con.prepareStatement(sql);
        }
        
        //Xác định các dâu ? cho câu sql
        for(int i=0 ; i<args.length;i++){
            psmt.setObject(i+1,args[i]);
        }
        return psmt;
    }
    
    //Insert, Update, Delete dùng update (Trả về int)
    public static int update(String sql , Object...args){
        try {
            PreparedStatement psmt = jdbcHelper.getstmt(sql, args);
            try {
                return psmt.executeUpdate();
            } finally{
                psmt.getConnection().close();
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //Truy vấn(Select) dùng query (Trả về resultset)
    public static ResultSet query(String sql, Object...args) throws SQLException{
        PreparedStatement psmt = jdbcHelper.getstmt(sql, args);
        return psmt.executeQuery();
    }
    
    //Sum,Count,Min,Max trả về 1 object
    public static Object value(String sql, Object...args){
        try {
            //Dùng query để truy vấn ra
            ResultSet rs = jdbcHelper.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
