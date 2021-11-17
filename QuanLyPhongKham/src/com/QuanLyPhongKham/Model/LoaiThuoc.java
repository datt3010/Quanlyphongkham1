/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.Model;

/**
 *
 * @author OS
 */
public class LoaiThuoc {
    private int maloaithuoc;
    private String tenloai;

    public LoaiThuoc(int maloaithuoc, String tenloai) {
        this.maloaithuoc = maloaithuoc;
        this.tenloai = tenloai;
    }

    public LoaiThuoc() {
    }

    public int getMaloaithuoc() {
        return maloaithuoc;
    }

    public void setMaloaithuoc(int maloaithuoc) {
        this.maloaithuoc = maloaithuoc;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }

    @Override
    public String toString() {
        return this.tenloai;
    }
    
    
}
