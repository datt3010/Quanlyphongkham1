/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.Utilities;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author OS
 */
public class MsgBox {
    // tạo 1 component cho tin nhắn
    public static void alert(Component parent,String mess){
        JOptionPane.showMessageDialog(parent, mess,"Phòng khám An Nhiên",JOptionPane.INFORMATION_MESSAGE);
    }
    // tạo 1 component để xác nhận
    public static boolean confirm(Component parent,String mess){
        int result =JOptionPane.showConfirmDialog(parent, mess,"Phòng khám An Nhiên",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return  result==JOptionPane.YES_OPTION; 
    }
    // tạo 1 component cho người dùng nhập
    public static String prompt(Component parent,String mess){
        return JOptionPane.showInputDialog(parent,mess,"Phòng khám An Nhiên",JOptionPane.INFORMATION_MESSAGE);
    }
}
