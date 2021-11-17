/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.Model;

import java.util.Date;

/**
 *
 * @author OS
 */
public class BacSi {
    private String mabacsy;
    private String tenbacsy;
    private String gioitinh;
    private String dienthoai;
    private String email;
    private Date ngaysinh;
    private String hinh;
    private String machuyennganh;

    public BacSi(String mabacsy, String tenbacsy, String gioitinh, String dienthoai, String email, Date ngaysinh, String hinh, String machuyennganh) {
        this.mabacsy = mabacsy;
        this.tenbacsy = tenbacsy;
        this.gioitinh = gioitinh;
        this.dienthoai = dienthoai;
        this.email = email;
        this.ngaysinh = ngaysinh;
        this.hinh = hinh;
        this.machuyennganh = machuyennganh;
    }

    public String getMabacsy() {
        return mabacsy;
    }

    public void setMabacsy(String mabacsy) {
        this.mabacsy = mabacsy;
    }

    public String getTenbacsy() {
        return tenbacsy;
    }

    public BacSi() {
    }

    public void setTenbacsy(String tenbacsy) {
        this.tenbacsy = tenbacsy;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMachuyennganh() {
        return machuyennganh;
    }

    public void setMachuyennganh(String machuyennganh) {
        this.machuyennganh = machuyennganh;
    }
    
}
