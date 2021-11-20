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
public class BenhNhan {

    private int mabenhnhan;
    private String tenbenhnhan;
    private String sodienthoai;
    private String gioitinh;
    private Date ngaysinh;
    private String diachi;
    private String madichvu;
    private String trangthai;

    public BenhNhan(int mabenhnhan, String tenbenhnhan, String sodienthoai, String gioitinh, Date ngaysinh, String diachi, String madichvu, String trangthai) {
        this.mabenhnhan = mabenhnhan;
        this.tenbenhnhan = tenbenhnhan;
        this.sodienthoai = sodienthoai;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.madichvu = madichvu;
        this.trangthai = trangthai;
    }

    public BenhNhan() {
    }

    public int getMabenhnhan() {
        return mabenhnhan;
    }

    public void setMabenhnhan(int mabenhnhan) {
        this.mabenhnhan = mabenhnhan;
    }

    public String getTenbenhnhan() {
        return tenbenhnhan;
    }

    public void setTenbenhnhan(String tenbenhnhan) {
        this.tenbenhnhan = tenbenhnhan;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getMadichvu() {
        return madichvu;
    }

    public void setMadichvu(String madichvu) {
        this.madichvu = madichvu;
    }
}
