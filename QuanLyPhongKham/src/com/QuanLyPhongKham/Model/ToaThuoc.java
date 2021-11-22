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
public class ToaThuoc {
    private int maphieukham;
    private String mathuoc;
    private int soluong;
    private String cachdung ;

    public ToaThuoc(int maphieukham, String mathuoc, int soluong, String cachdung) {
        this.maphieukham = maphieukham;
        this.mathuoc = mathuoc;
        this.soluong = soluong;
        this.cachdung = cachdung;
    }

    public ToaThuoc() {
    }

    public int getMaphieukham() {
        return maphieukham;
    }

    public void setMaphieukham(int maphieukham) {
        this.maphieukham = maphieukham;
    }

    public String getMathuoc() {
        return mathuoc;
    }

    public void setMathuoc(String mathuoc) {
        this.mathuoc = mathuoc;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getCachdung() {
        return cachdung;
    }

    public void setCachdung(String cachdung) {
        this.cachdung = cachdung;
    }
    
    
    
}
