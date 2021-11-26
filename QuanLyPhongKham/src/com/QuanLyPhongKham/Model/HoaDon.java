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
public class HoaDon {
    private int maphieudichvu;
    private String madichvu;
    private float dongia;

    public HoaDon(int maphieudichvu, String madichvu, float dongia) {
        this.maphieudichvu = maphieudichvu;
        this.madichvu = madichvu;
        this.dongia = dongia;
    }

    public HoaDon() {
    }

    public int getMaphieudichvu() {
        return maphieudichvu;
    }

    public void setMaphieudichvu(int maphieudichvu) {
        this.maphieudichvu = maphieudichvu;
    }

    public String getMadichvu() {
        return madichvu;
    }

    public void setMadichvu(String madichvu) {
        this.madichvu = madichvu;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    
}
