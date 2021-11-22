/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.Utilities;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author OS
 */
public class Validation {
    public static boolean isempty(JTextField txt , String msg){
        String text = txt.getText();
        if(text.equals("")){
            JOptionPane.showMessageDialog(null, msg,"Error",JOptionPane.ERROR_MESSAGE);
//            txt.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean isemptyTXA(JTextArea txt , String msg){
        String text = txt.getText();
        if(text.equals("")){
            JOptionPane.showMessageDialog(txt, msg,"Error",JOptionPane.ERROR_MESSAGE);
            txt.requestFocus();
            return false;
        }
        return true;
    }
}
