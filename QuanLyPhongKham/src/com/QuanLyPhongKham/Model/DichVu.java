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
public class DichVu {
    private String madichvu;
    private String tendichvu;
    private float giatien;

    public DichVu(String madichvu, String tendichvu, float giatien) {
        this.madichvu = madichvu;
        this.tendichvu = tendichvu;
        this.giatien = giatien;
    }

    public DichVu() {
    }

    public String getMadichvu() {
        return madichvu;
    }

    public void setMadichvu(String madichvu) {
        this.madichvu = madichvu;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }
    
    
}
