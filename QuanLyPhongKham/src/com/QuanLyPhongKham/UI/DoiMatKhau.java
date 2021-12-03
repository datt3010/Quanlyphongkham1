/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.UI;

import com.QuanLyPhongKham.Utilities.Auths;
import com.QuanLyPhongKham.Utilities.MsgBox;
import java.awt.geom.RoundRectangle2D;
import com.QuanLyPhongKham.DAO.nhanvienDAO;

/**
 *
 * @author OS
 */
public class DoiMatKhau extends javax.swing.JDialog {

    nhanvienDAO daonv = new nhanvienDAO();

    /**
     * Creates new form DangNhap_1
     */
    public DoiMatKhau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Đổi mật khẩu");
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlleft = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblLogin1 = new javax.swing.JLabel();
        pnlright = new javax.swing.JPanel();
        pnlThoat = new javax.swing.JPanel();
        lblThoat = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblLoginID = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        lblLoginPassword = new javax.swing.JLabel();
        txtMatKhauCu = new javax.swing.JPasswordField();
        btnThoat = new rojeru_san.complementos.RSButtonHover();
        btnXacNhan = new rojeru_san.complementos.RSButtonHover();
        lblQuenMatKhau = new javax.swing.JLabel();
        lblLoginPassword1 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        lblLoginPassword2 = new javax.swing.JLabel();
        txtNhacLaiMatKhauMoi = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlleft.setBackground(new java.awt.Color(0, 102, 255));

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-change-user-100.png"))); // NOI18N

        lblLogin1.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        lblLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin1.setText("PLEASE LOGIN BEFORE USING");
        lblLogin1.setToolTipText("");

        javax.swing.GroupLayout pnlleftLayout = new javax.swing.GroupLayout(pnlleft);
        pnlleft.setLayout(pnlleftLayout);
        pnlleftLayout.setHorizontalGroup(
            pnlleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlleftLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlleftLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(lblLogin1)
                .addGap(43, 43, 43))
        );
        pnlleftLayout.setVerticalGroup(
            pnlleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlleftLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogin1)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        getContentPane().add(pnlleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 490));

        pnlright.setBackground(new java.awt.Color(255, 255, 255));

        pnlThoat.setBackground(new java.awt.Color(0, 102, 255));
        pnlThoat.setForeground(new java.awt.Color(255, 255, 255));
        pnlThoat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblThoat.setBackground(new java.awt.Color(0, 102, 255));
        lblThoat.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblThoat.setForeground(new java.awt.Color(255, 255, 255));
        lblThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThoat.setText("X");
        lblThoat.setOpaque(true);
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });
        pnlThoat.add(lblThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 39, 40));

        lblLogin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 102, 102));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Đổi mật khẩu");
        lblLogin.setToolTipText("");

        lblLoginID.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblLoginID.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginID.setText("Login ID");

        txtTenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTenDangNhap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        lblLoginPassword.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblLoginPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword.setText("Login Old Password");

        txtMatKhauCu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtMatKhauCu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnXacNhan.setText("XÁC NHẬN");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        lblQuenMatKhau.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        lblQuenMatKhau.setForeground(new java.awt.Color(255, 0, 0));
        lblQuenMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuenMatKhau.setText(" Forgot password ?");
        lblQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseClicked(evt);
            }
        });

        lblLoginPassword1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblLoginPassword1.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword1.setText("Login New Password");

        txtMatKhauMoi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtMatKhauMoi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        lblLoginPassword2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        lblLoginPassword2.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword2.setText("Enter a New Password");

        txtNhacLaiMatKhauMoi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNhacLaiMatKhauMoi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlrightLayout = new javax.swing.GroupLayout(pnlright);
        pnlright.setLayout(pnlrightLayout);
        pnlrightLayout.setHorizontalGroup(
            pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlrightLayout.createSequentialGroup()
                .addGap(0, 138, Short.MAX_VALUE)
                .addComponent(lblQuenMatKhau)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlrightLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlrightLayout.createSequentialGroup()
                .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlrightLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLoginPassword2)
                            .addComponent(lblLoginPassword1)
                            .addComponent(lblLoginID)
                            .addComponent(txtTenDangNhap)
                            .addComponent(lblLoginPassword)
                            .addComponent(txtMatKhauCu)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlrightLayout.createSequentialGroup()
                                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMatKhauMoi)
                            .addComponent(txtNhacLaiMatKhauMoi)))
                    .addGroup(pnlrightLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlrightLayout.setVerticalGroup(
            pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlrightLayout.createSequentialGroup()
                .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoginID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoginPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoginPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoginPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNhacLaiMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblQuenMatKhau)
                .addContainerGap())
        );

        getContentPane().add(pnlright, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 370, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        dispose();
    }//GEN-LAST:event_lblThoatMouseClicked

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        doimatkhau();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed

    }//GEN-LAST:event_btnThoatActionPerformed

    private void lblQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseClicked
//       new Quenmatkhau(parent, rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_lblQuenMatKhauMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        doimatkhau();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            DoiMatKhau dialog = new DoiMatKhau(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    public void doimatkhau() {
        String tendangnhap = txtTenDangNhap.getText();
        String oldpass = new String(txtMatKhauCu.getPassword());
        String newpass = new String(txtMatKhauMoi.getPassword());
        String confirmpass = new String(txtNhacLaiMatKhauMoi.getPassword());
        if (!tendangnhap.equals(Auths.user.getManhanvien())) {
            MsgBox.alert(this, "Sai tên đăng nhập");
            return;
        } else if (!oldpass.equals(Auths.user.getMatkhau())) {
            MsgBox.alert(this, "Sai mật khẩu");
            return;
        } else if (!confirmpass.equals(newpass)) {
            MsgBox.alert(this, "Mật khẩu xác nhận không khớp mật khẩu mới");
            return;
        } else {
            Auths.user.setMatkhau(confirmpass);
            daonv.update(Auths.user);
            MsgBox.alert(this, "đổi mật khẩu thành công");
            clear();
        }
    }

    public void clear() {
        txtTenDangNhap.setText("");
        txtMatKhauCu.setText("");
        txtMatKhauMoi.setText("");
        txtNhacLaiMatKhauMoi.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnThoat;
    private rojeru_san.complementos.RSButtonHover btnXacNhan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblLoginID;
    private javax.swing.JLabel lblLoginPassword;
    private javax.swing.JLabel lblLoginPassword1;
    private javax.swing.JLabel lblLoginPassword2;
    private javax.swing.JLabel lblQuenMatKhau;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JPanel pnlThoat;
    private javax.swing.JPanel pnlleft;
    private javax.swing.JPanel pnlright;
    private javax.swing.JPasswordField txtMatKhauCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhacLaiMatKhauMoi;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
