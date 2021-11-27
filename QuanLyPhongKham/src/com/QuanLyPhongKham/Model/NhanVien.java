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
public class NhanVien {
    private String manhanvien;
    private String tennhanvien;
    private String gioitinh;
    private Date ngaysinh;
    private String matkhau;
    private String chucvu;
    private String sodienthoai;
    private String diachi;
    private String hinh;

    public NhanVien(String manhanvien, String tennhanvien, String gioitinh, Date ngaysinh, String matkhau, String chucvu, String sodienthoai, String diachi, String hinh) {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.matkhau = matkhau;
        this.chucvu = chucvu;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
        this.hinh = hinh;
    }

    public NhanVien() {
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
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

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return this.manhanvien;
    }
    
    
}
