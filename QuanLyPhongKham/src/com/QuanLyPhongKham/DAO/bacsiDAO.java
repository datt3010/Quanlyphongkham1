/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;
import com.QuanLyPhongKham.Model.BacSi;
import com.QuanLyPhongKham.Model.BenhNhan;
import com.QuanLyPhongKham.Utilities.XDate;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author OS
 */
public class bacsiDAO extends QLPhongKham_DAO<BacSi, String>{
    String Insert_BacSy = "INSERT INTO bacsy(mabacsy,matkhau,tenbacsy,gioitinh,dienthoai,email,ngaysinh,hinh,machuyennganh) values(?,?,?,?,?,?,?,?,?) ";
    String Update_BacSy = "UPDATE bacsy SET matkhau = ?, tenbacsy = ?, gioitinh = ?, dienthoai = ?, email = ?, ngaysinh = ?, hinh = ?, machuyennganh =? where mabacsy  like ?";
    String Delete_BacSy = "DELETE FROM bacsy WHERE mabacsy like ?";
    String SELECTALL_BacSy = "SELECT * FROM bacsy";
    String SELECT_BY_ID_BacSy ="SELECT * FROM bacsy WHERE mabacsy like ?";
    String SELECT_BY_EMAIL="SELECT * FROM bacsy where  email like ?";
    String SELECT_BY_ONEEMAIL="SELECT email FROM bacsy where mabacsy like ?";
    @Override
    public void insert(BacSi entity) {
        try{
            jdbcHelper.update(Insert_BacSy, entity.getMabacsy(),entity.getMatkhau(),entity.getTenbacsy(),entity.getGioitinh(),entity.getDienthoai(),entity.getEmail(),XDate.toString(entity.getNgaysinh(), "yyyy-MM-dd"),entity.getHinh(),entity.getMachuyennganh());
        }catch(Exception e){
            e.printStackTrace();
        }
               
    }

    @Override
    public void update(BacSi entity) {
        try{
            jdbcHelper.update(Update_BacSy, entity.getMatkhau(), entity.getTenbacsy(),entity.getGioitinh(),entity.getDienthoai(),entity.getEmail(),XDate.toString(entity.getNgaysinh(), "yyyy-MM-dd"),entity.getHinh(),entity.getMachuyennganh(),entity.getMabacsy());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            jdbcHelper.update(Delete_BacSy, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<BacSi> SelectAll() {
        return this.SelectBySQL(SELECTALL_BacSy);
    }

    @Override
    public BacSi SelectByID(String id) {
       List<BacSi> list = SelectBySQL(SELECT_BY_ID_BacSy, id);
       return list.size()>0?list.get(0):null;
    }
    public BacSi SelectByemail(String id) {
       List<BacSi> list = SelectBySQL(SELECT_BY_EMAIL, id);
       return list.size()>0?list.get(0):null;
    }
     public BacSi Selectbyoneemail(String id) {
       List<BacSi> list = SelectBySQL(SELECT_BY_ONEEMAIL, id);
       return list.size()>0?list.get(0):null;
    }
    @Override
    protected List<BacSi> SelectBySQL(String sql, Object... args) {
        List<BacSi> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                BacSi bs = new BacSi();
                bs.setMabacsy(rs.getString("mabacsy"));
                bs.setMatkhau(rs.getString("matkhau"));
                bs.setTenbacsy(rs.getString("tenbacsy"));
                bs.setGioitinh(rs.getString("gioitinh"));
                bs.setDienthoai(rs.getString("dienthoai"));
                bs.setEmail(rs.getString("email"));
                bs.setNgaysinh(rs.getDate("ngaysinh"));
                bs.setHinh(rs.getString("hinh"));
                bs.setMachuyennganh(rs.getString("machuyennganh"));
                list.add(bs);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }   
    
    public List<BacSi> SelectKeyword(String keyword,String keyword2,String keyword3,String keyword4,String keyword5, String keyword6) {
        String sql = "SELECT * FROM bacsy\n"
                + "WHERE mabacsy LIKE ? OR tenbacsy LIKE ? OR dienthoai LIKE ? OR machuyennganh LIKE ? OR email LIKE ? or gioitinh like ?;";
        return this.SelectBySQL(sql, "%"+keyword+"%", "%"+keyword2+"%", "%"+keyword3+"%","%"+keyword4+"%","%"+keyword5+"%","%"+keyword6+"%");
    }
}
