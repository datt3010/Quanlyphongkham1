/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.Utilities;

import com.QuanLyPhongKham.Model.BacSi;
import com.QuanLyPhongKham.Model.NhanVien;

/**
 *
 * @author OS
 */
public class Auths {
    //Tạo ra tài khoản nhân viên đang đăng nhập vào
    public static NhanVien user = null;
    public static BacSi userbacsy=null; 
    
    //Xoá tài khoản đang đăng nhâp
    public static void ClearUser(){
        Auths.user = null;
        Auths.userbacsy=null; 
    }
    
    //Kiểm tra hệ thống có đăng nhập hay chưa (Có ==> T or Chưa ==> F)
    public static boolean isLogin(){
        return Auths.user!=null; 
    }
    public  static boolean isLogin1(){
        return Auths.userbacsy!=null; 
    }
    //Kiểm tra tài khoản có phải là quản lí hay không?
    
}
