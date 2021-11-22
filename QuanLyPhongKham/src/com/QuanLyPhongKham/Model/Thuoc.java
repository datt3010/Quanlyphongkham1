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
public class Thuoc {

    private String maThuoc;
    private String tenthuoc;
    private String donvitinh;
    private int maloaithuoc;

    public Thuoc(String maThuoc, String tenthuoc, String donvitinh, int maloaithuoc) {
        this.maThuoc = maThuoc;
        this.tenthuoc = tenthuoc;
        this.donvitinh = donvitinh;
        this.maloaithuoc = maloaithuoc;
    }

    public Thuoc() {
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenthuoc() {
        return tenthuoc;
    }

    public void setTenthuoc(String tenthuoc) {
        this.tenthuoc = tenthuoc;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(String donvitinh) {
        this.donvitinh = donvitinh;
    }

    public int getMaloaithuoc() {
        return maloaithuoc;
    }

    public void setMaloaithuoc(int maloaithuoc) {
        this.maloaithuoc = maloaithuoc;
    }

    

    

  


}
