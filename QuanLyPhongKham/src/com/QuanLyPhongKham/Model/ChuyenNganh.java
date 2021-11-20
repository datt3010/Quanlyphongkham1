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
public class ChuyenNganh {
    String machuyennganh;
    String tenchuyennganh;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String machuyennganh, String tenchuyennganh) {
        this.machuyennganh = machuyennganh;
        this.tenchuyennganh = tenchuyennganh;
    }

    public String getMachuyennganh() {
        return machuyennganh;
    }

    public void setMachuyennganh(String machuyennganh) {
        this.machuyennganh = machuyennganh;
    }

    public String getTenchuyennganh() {
        return tenchuyennganh;
    }

    public void setTenchuyennganh(String tenchuyennganh) {
        this.tenchuyennganh = tenchuyennganh;
    }
    
}
