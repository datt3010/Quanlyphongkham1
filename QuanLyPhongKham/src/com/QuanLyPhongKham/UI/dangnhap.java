/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.UI;

import com.QuanLyPhongKham.Model.NhanVien;
import com.QuanLyPhongKham.DAO.nhanvienDAO;
import com.QuanLyPhongKham.Utilities.MsgBox;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author p
 */
public class dangnhap extends javax.swing.JFrame {

    nhanvienDAO daonv = new nhanvienDAO();

    /**
     * Creates new form dangnhap
     */
    public dangnhap() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        text();
    }
    final int max = 100;
    final int min = 50;

    public void text() {
        Thread ani = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 10;
                int y = 450;
                boolean checked = true;
                while (true) {
                    if (checked) {
                        lblchu.setLocation(x, y);
                        x += 10;
                    } else {
                        lblchu.setLocation(x, y);
                        x -= 10;
                    }
                    if (x > max) {
                        checked = false;
                        x = 10;
                    }
                    if (x < min) {
                        checked = true;
                    }
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                    }
                }
            }

        });
        ani.start();
    }

//        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblchu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblquenmatkhau = new javax.swing.JLabel();
        btndoimatkhau = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btndangnhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(77, 195, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/favicon.png"))); // NOI18N

        lblchu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblchu.setForeground(new java.awt.Color(102, 0, 204));
        lblchu.setText("Phòng Khám An Nhiên Mang Đến Sự Bình Yên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblchu, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblchu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblquenmatkhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblquenmatkhau.setText("Quên mật khẩu ?");
        jPanel3.add(lblquenmatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        btndoimatkhau.setBackground(new java.awt.Color(102, 204, 255));
        btndoimatkhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btndoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-home-page-23.png"))); // NOI18N
        btndoimatkhau.setText("Đổi mật khẩu?");
        jPanel3.add(btndoimatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 190, 50));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 320, 10));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 320, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel3.setText("Đăng nhập");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 85, 113, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mật khẩu");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 77, -1));

        txtuser.setBackground(new java.awt.Color(102, 204, 255));
        txtuser.setBorder(null);
        jPanel3.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 164, 326, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tài Khoản");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 160, -1, 33));

        txtpassword.setBackground(new java.awt.Color(102, 204, 255));
        txtpassword.setBorder(null);
        jPanel3.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 326, 33));

        btndangnhap.setBackground(new java.awt.Color(102, 204, 255));
        btndangnhap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_chart_30px.png"))); // NOI18N
        btndangnhap.setText("Đăng nhập");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });
        jPanel3.add(btndangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 550, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_btndangnhapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dangnhap().setVisible(true);
            }
        });
    }

    public void login() {
        String taikhoan = txtuser.getText();
        String pass = new String(txtpassword.getPassword());
        NhanVien nhanVien = daonv.SelectByID(taikhoan);
        if (nhanVien == null) {
            MsgBox.alert(this, "sai tên đăng nhập");
        } else if (!pass.equals(nhanVien.getMatkhau())) {
            MsgBox.alert(this, "sai mật khẩu");
        } else {
            com.QuanLyPhongKham.Utilities.Auths.user = nhanVien;
            //new QuanLyDichVu().setVisible(true);
            this.dispose();
        }
    }
    



//    public void login() {
//        String taikhoan = txtuser.getText();
//        String pass = new String(txtpassword.getPassword());
//        NhanVien nhanVien = daonv.SelectByID(taikhoan);
//        if (nhanVien == null) {
//            MsgBox.alert(this, "sai tên đăng nhập");
//        } else if (!pass.equals(nhanVien.getMatkhau())) {
//            MsgBox.alert(this, "sai mật khẩu");
//        } else {
//            Utilities.Auths.user = nhanVien;
//            new QuanLyphieukham().setVisible(true);
//            this.dispose();
//
//        }
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangnhap;
    private javax.swing.JButton btndoimatkhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblchu;
    private javax.swing.JLabel lblquenmatkhau;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
