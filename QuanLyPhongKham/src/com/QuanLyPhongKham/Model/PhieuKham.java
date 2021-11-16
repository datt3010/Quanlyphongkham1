/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.Model;

import com.QuanLyPhongKham.Utilities.XDate;
import java.util.Date;

/**
 *
 * @author OS
 */
public class PhieuKham {
    private int maphieukham;
    private Date ngaykham;
    private String mabacsy;
    private int mabenhnhan;
    private String manhanvien;
    private String ketluan;

    public PhieuKham(int maphieukham, String mabacsy, int mabenhnhan, String manhanvien, String ketluan) {
        this.maphieukham = maphieukham;
        this.mabacsy = mabacsy;
        this.mabenhnhan = mabenhnhan;
        this.manhanvien = manhanvien;
        this.ketluan = ketluan;
    }

    public PhieuKham() {
    }

    public int getMaphieukham() {
        return maphieukham;
    }

    public void setMaphieukham(int maphieukham) {
        this.maphieukham = maphieukham;
    }

    public Date getNgaykham() {
        return ngaykham;
    }

    public void setNgaykham(Date ngaykham) {
        this.ngaykham = ngaykham;
    }

    public String getMabacsy() {
        return mabacsy;
    }

    public void setMabacsy(String mabacsy) {
        this.mabacsy = mabacsy;
    }

    public int getMabenhnhan() {
        return mabenhnhan;
    }

    public void setMabenhnhan(int mabenhnhan) {
        this.mabenhnhan = mabenhnhan;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getKetluan() {
        return ketluan;
    }

    public void setKetluan(String ketluan) {
        this.ketluan = ketluan;
    }
    
    
}
