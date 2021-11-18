/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.Utilities;

import java.awt.AlphaComposite;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author OS
 */
public class XImages {
    public static Image getAppIcon(){
        URL url = XImages.class.getResource("");
        return new ImageIcon(url).getImage();
    }
    
    //Lưu File vào thư mục Logo
    public static void Save(File src){
        //Tạo ra File có thư mục tên Logo , và lấy tên File
        File file = new File("logo", src.getName());
        
        //Kiểm tra File có tồn tại hay chưa, Nếu chưa thì tạo mới
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        
        //Copy File vào thư mục
        try {
            Path from = Paths.get(src.getAbsolutePath());//Copy từ
            Path to = Paths.get(file.getAbsolutePath());//Copy đến
            
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING); //Nếu File đó đã tồn tại thì thay thế luôn
        } catch (Exception e) {
            e.printStackTrace();
              
        }
    }
    // tao file read de doc text cho icon 
    public static ImageIcon read(String filename) {
        File path = new File("logos", filename);
        return new ImageIcon(path.getAbsolutePath());
    }
}
