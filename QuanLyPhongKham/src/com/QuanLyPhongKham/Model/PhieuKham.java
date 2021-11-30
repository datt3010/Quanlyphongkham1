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
    private String mabenhnhan;
    private String manhanvien;
    private Date ngaytaikham;
    private String ketluan;
    
    public PhieuKham(int maphieukham, String mabacsy, String mabenhnhan, String manhanvien,Date ngaytaikham, String ketluan) {
        this.maphieukham = maphieukham;
        this.mabacsy = mabacsy;
        this.mabenhnhan = mabenhnhan;
        this.manhanvien = manhanvien;
        this.ngaytaikham = ngaytaikham;
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

    public String getMabenhnhan() {
        return mabenhnhan;
    }

    public void setMabenhnhan(String mabenhnhan) {
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

    public Date getNgaytaikham() {
        return ngaytaikham;
    }

    public void setNgaytaikham(Date ngaytaikham) {
        this.ngaytaikham = ngaytaikham;
    }
    
    
}
