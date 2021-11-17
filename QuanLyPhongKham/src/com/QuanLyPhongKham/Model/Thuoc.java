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
    private String Tennthuoc;
    private String donvi;
    private int donggia;
    private String cachdung;
    private Date hansudung;
    private int maloaithuoc;

    public String getMaThuoc() {
        return maThuoc;
    }

    public int getMaloaithuoc() {
        return maloaithuoc;
    }

    public void setMaloaithuoc(int maloaithuoc) {
        this.maloaithuoc = maloaithuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTennthuoc() {
        return Tennthuoc;
    }

    public void setTennthuoc(String Tennthuoc) {
        this.Tennthuoc = Tennthuoc;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getDonggia() {
        return donggia;
    }

    public void setDonggia(int donggia) {
        this.donggia = donggia;
    }

    public String getCachdung() {
        return cachdung;
    }

    public void setCachdung(String cachdung) {
        this.cachdung = cachdung;
    }

    public Date getHansudung() {
        return hansudung;
    }

    public void setHansudung(Date hansudung) {
        this.hansudung = hansudung;
    }
}
