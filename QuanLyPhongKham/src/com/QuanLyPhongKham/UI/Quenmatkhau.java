/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.UI;

import java.awt.geom.RoundRectangle2D;
import com.QuanLyPhongKham.DAO.nhanvienDAO;
import com.QuanLyPhongKham.Utilities.MsgBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import javax.swing.Timer;
import com.QuanLyPhongKham.Model.NhanVien;
import javax.swing.JOptionPane;

/**
 *
 * @author OS
 */
public class Quenmatkhau extends javax.swing.JDialog {

    nhanvienDAO daonv = new nhanvienDAO();
    Random rand = new Random();
    int otp = rand.nextInt(9999);
    Timer timer;
    boolean testime = false;

    /**
     * Creates new form DangNhap_1
     */
    public Quenmatkhau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtnewpassword.enable(false);
        txtconfirmpassword.enable(false);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        btnXacNhan1.hide();
        

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
        txtTenDangNhap = new javax.swing.JTextField();
        btnThoat = new rojeru_san.complementos.RSButtonHover();
        btnlaycode = new rojeru_san.complementos.RSButtonHover();
        lblLoginPassword2 = new javax.swing.JLabel();
        lblLoginPassword4 = new javax.swing.JLabel();
        lblLoginPassword5 = new javax.swing.JLabel();
        txtconfirmpassword = new javax.swing.JPasswordField();
        lblLoginPassword6 = new javax.swing.JLabel();
        lblLoginPassword7 = new javax.swing.JLabel();
        txtnewpassword = new javax.swing.JPasswordField();
        lbltimer = new javax.swing.JLabel();
        txtotp = new javax.swing.JTextField();
        btnXacNhan1 = new rojeru_san.complementos.RSButtonHover();
        txtsodienthoai = new javax.swing.JTextField();

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
                .addContainerGap(349, Short.MAX_VALUE))
        );

        getContentPane().add(pnlleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 660));

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

        lblLogin.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 102, 102));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Quên mật khẩu");
        lblLogin.setToolTipText("");

        txtTenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTenDangNhap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnlaycode.setText("Lay Code");
        btnlaycode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaycodeActionPerformed(evt);
            }
        });

        lblLoginPassword2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLoginPassword2.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword2.setText("Tên tài khoản");

        lblLoginPassword4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLoginPassword4.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPassword4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword4.setText("Số điện thoại");

        lblLoginPassword5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLoginPassword5.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPassword5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword5.setText("Mã xác nhận");

        txtconfirmpassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtconfirmpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        lblLoginPassword6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLoginPassword6.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPassword6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword6.setText("Nhập mật khẩu mới");

        lblLoginPassword7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLoginPassword7.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPassword7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginPassword7.setText("Xác nhận mật khẩu");

        txtnewpassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtnewpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        lbltimer.setText("60");

        txtotp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtotp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        btnXacNhan1.setText("XÁC NHẬN");
        btnXacNhan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhan1ActionPerformed(evt);
            }
        });

        txtsodienthoai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtsodienthoai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout pnlrightLayout = new javax.swing.GroupLayout(pnlright);
        pnlright.setLayout(pnlrightLayout);
        pnlrightLayout.setHorizontalGroup(
            pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlrightLayout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlrightLayout.createSequentialGroup()
                .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlrightLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLoginPassword7)
                                    .addComponent(lblLoginPassword6)
                                    .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtconfirmpassword)
                                        .addComponent(lblLoginPassword5)
                                        .addComponent(lblLoginPassword4)
                                        .addComponent(lblLoginPassword2)
                                        .addComponent(txtTenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                        .addComponent(txtotp, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                        .addComponent(txtsodienthoai, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))))
                            .addGroup(pnlrightLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(lbltimer)))
                        .addGroup(pnlrightLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(btnXacNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlrightLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnlaycode, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlrightLayout.setVerticalGroup(
            pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlrightLayout.createSequentialGroup()
                .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlrightLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblLogin)))
                .addGap(35, 35, 35)
                .addComponent(lblLoginPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLoginPassword4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLoginPassword5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtotp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLoginPassword6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoginPassword7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lbltimer)
                .addGap(18, 18, 18)
                .addGroup(pnlrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnlaycode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(pnlright, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 370, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblThoatMouseClicked

    private void btnlaycodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaycodeActionPerformed
        checkuser();
    }//GEN-LAST:event_btnlaycodeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed

    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXacNhan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhan1ActionPerformed
        // TODO add your handling code here:
             checkuser2();
    }//GEN-LAST:event_btnXacNhan1ActionPerformed

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
            Quenmatkhau dialog = new Quenmatkhau(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    public void sendcodesdt() {
        try {
            String manv = txtTenDangNhap.getText();
            String to = getbySodienthoai();
            String str = "" + otp + "";
            String str2 = str.replaceAll("\\s", "+");
            URL url = new URL("http://192.168.1.5:8080/v1/sms/send/?phone=" + to + "&message=" + str2 + "");
            InputStream i = null;
            MsgBox.alert(this, "nhan ma otp thanh cong");
            txtnewpassword.enable(true);
            txtconfirmpassword.enable(true);
            btnlaycode.hide();
            btnXacNhan1.show();
            try {
                i = url.openStream();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i != null) {

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public String getbySodienthoai() {
        String manv = txtTenDangNhap.getText();
        return daonv.SelectByID(manv).getSodienthoai();
    }
    public void runclock() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(lbltimer.getText());
                if (x > 0) {
                    lbltimer.setText(String.valueOf(--x));
                    testime = true;
                }
                else if(x<=0){
                  btnXacNhan1.hide();
                  btnlaycode.show();
                }
                else {
                    lbltimer.setText("60");
                    testime = false;
                    timer.stop();
                }
            }
        });
        timer.start();
    }
    public boolean checkuser() {
        String user = txtTenDangNhap.getText();
        String sodienthoai = txtsodienthoai.getText();
        if (user.isEmpty()) {
            MsgBox.alert(this, "vui lòng nhập user để lấy OTP");
            return false;
        } else {
            if (daonv.SelectByID(user) != null) {
                if (sodienthoai.isEmpty()) {
                    MsgBox.alert(this, "Phone không được bỏ trống");
                    return false;
                } else {
                    if (daonv.Selectbyphone(sodienthoai) == null) {
                        MsgBox.alert(this, "số điện thoại này không tồn tại");
                        return false;
                    } else {
                        sendcodesdt();
                        runclock();
                    }
                }

            } else {
                MsgBox.alert(this, "không tìm thấy mã nhân viên này");
                return false;
            }
        }
        return true;
    }
    public boolean checkuser2() {
        String user = txtTenDangNhap.getText();
        NhanVien nv = daonv.SelectByID(user);
       int otp1=Integer.parseInt(txtotp.getText()); 
       String otp3=txtotp.getText(); 
        String newpass = new String(txtnewpassword.getPassword());
        String confirmpass = new String(txtconfirmpassword.getPassword());
        if (otp3.isEmpty()) {
            MsgBox.alert(this, "vui lòng nhập mã xác thực");
            return false;
        } else {
            if (otp1!=otp) {
                MsgBox.alert(this, "mã xác thực không đúng");
                return false;
            } else {
                if (newpass.isEmpty()) {
                    MsgBox.alert(this, "hãy nhập mật khẩu mới");
                    return false;
                } else {
                    if (confirmpass.isEmpty()) {
                        MsgBox.alert(this, "hãy nhập xác nhận mật khẩu");
                        return false;
                    } else {
                        if (!confirmpass.equals(newpass)) {
                            MsgBox.alert(this, "mật khẩu xác nhận không trùng khớp");
                            return false;
                        } else {
                            nv.setMatkhau(confirmpass);
                            daonv.update(nv);

                        }
                    }
                }
            }
        }
        MsgBox.alert(this, "Đổi mật khẩu thành công");
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnThoat;
    private rojeru_san.complementos.RSButtonHover btnXacNhan1;
    private rojeru_san.complementos.RSButtonHover btnlaycode;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblLoginPassword2;
    private javax.swing.JLabel lblLoginPassword4;
    private javax.swing.JLabel lblLoginPassword5;
    private javax.swing.JLabel lblLoginPassword6;
    private javax.swing.JLabel lblLoginPassword7;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lbltimer;
    private javax.swing.JPanel pnlThoat;
    private javax.swing.JPanel pnlleft;
    private javax.swing.JPanel pnlright;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JPasswordField txtconfirmpassword;
    private javax.swing.JPasswordField txtnewpassword;
    private javax.swing.JTextField txtotp;
    private javax.swing.JTextField txtsodienthoai;
    // End of variables declaration//GEN-END:variables

}
