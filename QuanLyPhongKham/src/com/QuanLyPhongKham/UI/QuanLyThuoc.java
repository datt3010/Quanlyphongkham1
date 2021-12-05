/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.UI;

import com.QuanLyPhongKham.DAO.loaithuocDAO;
import com.QuanLyPhongKham.DAO.thuocDAO;
import com.QuanLyPhongKham.Model.LoaiThuoc;
import com.QuanLyPhongKham.Model.Thuoc;
import com.QuanLyPhongKham.Utilities.MsgBox;
import com.QuanLyPhongKham.Utilities.Validation;
import com.QuanLyPhongKham.Utilities.XDate;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author OS
 */
public class QuanLyThuoc extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyPhongKham
     */
    public QuanLyThuoc() {
        initComponents();
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTong = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblXinChao = new javax.swing.JLabel();
        lblTieuDe = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblAnhNV = new rojerusan.RSFotoCircle();
        pnlLeft = new javax.swing.JPanel();
        lblDanhMuc = new javax.swing.JLabel();
        pnlQuanLyBacSi = new javax.swing.JPanel();
        lblIconBacSi = new javax.swing.JLabel();
        lblQuanLyBacSi = new javax.swing.JLabel();
        pnlQuanLyNhanVien = new javax.swing.JPanel();
        lblIconNhanVien = new javax.swing.JLabel();
        lblQuanLyNhanVien = new javax.swing.JLabel();
        pnlQuanLyBenhNhan = new javax.swing.JPanel();
        lblIconBenhNhan = new javax.swing.JLabel();
        lblQuanLyBenhNhan = new javax.swing.JLabel();
        pnlQuanLyHoaDon = new javax.swing.JPanel();
        lblIconHoaDon = new javax.swing.JLabel();
        lblQuanLyHoaDon = new javax.swing.JLabel();
        pnlQuanLyPhieuKham = new javax.swing.JPanel();
        lblIconPhieuKham = new javax.swing.JLabel();
        lblQuanLyPhieuKham = new javax.swing.JLabel();
        pnlQuanLyThuoc = new javax.swing.JPanel();
        lblIconThuoc = new javax.swing.JLabel();
        lblQuanLyThuoc = new javax.swing.JLabel();
        pnlQuanLyThongKe = new javax.swing.JPanel();
        lblIconThongKe = new javax.swing.JLabel();
        lblThongKe = new javax.swing.JLabel();
        pnlDichVu = new javax.swing.JPanel();
        lblIconDichVu = new javax.swing.JLabel();
        lblDichVu = new javax.swing.JLabel();
        btnDangXuat = new rojeru_san.complementos.RSButtonHover();
        pnlRight = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMaThuoc = new javax.swing.JLabel();
        txtMaThuoc = new javax.swing.JTextField();
        lblTenThuoc = new javax.swing.JLabel();
        txtTenThuoc = new javax.swing.JTextField();
        lblDonViTinh = new javax.swing.JLabel();
        cboDonViTinh = new javax.swing.JComboBox<>();
        lblMaLoaiThuoc = new javax.swing.JLabel();
        cboMaLoaiThuoc = new javax.swing.JComboBox<>();
        btnThem = new rojeru_san.complementos.RSButtonHover();
        btnSua = new rojeru_san.complementos.RSButtonHover();
        btnXoa = new rojeru_san.complementos.RSButtonHover();
        btnMoi = new rojeru_san.complementos.RSButtonHover();
        btnTim = new rojeru_san.complementos.RSButtonHover();
        btnPrevious = new rojeru_san.complementos.RSButtonHover();
        btnNext = new rojeru_san.complementos.RSButtonHover();
        btnLast = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThuoc = new rojeru_san.complementos.RSTableMetro();
        txtSearch = new javax.swing.JTextField();
        btnFirst = new rojeru_san.complementos.RSButtonHover();
        btnExcel = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÝ THUỐC\n\n\n");

        pnlTong.setBackground(new java.awt.Color(255, 255, 255));
        pnlTong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(51, 153, 255));

        lblXinChao.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        lblXinChao.setText("Xin chào, ");

        lblTieuDe.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieuDe.setText("PHÒNG KHÁM AN NHIÊN");

        lblDay.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDay.setText("dd/MM/yyyy");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MANG ĐẾN SỰ BÌNH YÊN");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAnhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblXinChao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                        .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTieuDe)
                            .addComponent(lblDay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(lblAnhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblXinChao)
                .addGap(34, 34, 34))
        );

        pnlTong.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 100));

        pnlLeft.setBackground(new java.awt.Color(54, 70, 78));
        pnlLeft.setForeground(new java.awt.Color(54, 70, 78));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDanhMuc.setBackground(new java.awt.Color(54, 70, 78));
        lblDanhMuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-menu-30.png"))); // NOI18N
        lblDanhMuc.setOpaque(true);
        lblDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDanhMucMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDanhMucMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDanhMucMouseExited(evt);
            }
        });
        pnlLeft.add(lblDanhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        pnlQuanLyBacSi.setBackground(new java.awt.Color(54, 70, 78));
        pnlQuanLyBacSi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconBacSi.setBackground(new java.awt.Color(54, 70, 78));
        lblIconBacSi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconBacSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_doctor_male_30px.png"))); // NOI18N
        lblIconBacSi.setToolTipText("Quản Lý Bác Sĩ");
        lblIconBacSi.setOpaque(true);
        lblIconBacSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconBacSiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconBacSiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconBacSiMouseExited(evt);
            }
        });
        pnlQuanLyBacSi.add(lblIconBacSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lblQuanLyBacSi.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblQuanLyBacSi.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyBacSi.setText("Quản Lý Bác Sĩ");
        lblQuanLyBacSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuanLyBacSiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuanLyBacSiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuanLyBacSiMouseExited(evt);
            }
        });
        pnlQuanLyBacSi.add(lblQuanLyBacSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        pnlLeft.add(pnlQuanLyBacSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 40));

        pnlQuanLyNhanVien.setBackground(new java.awt.Color(54, 70, 78));
        pnlQuanLyNhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconNhanVien.setBackground(new java.awt.Color(54, 70, 78));
        lblIconNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_manager_30px.png"))); // NOI18N
        lblIconNhanVien.setToolTipText("Quản Lý Nhân Viên");
        lblIconNhanVien.setOpaque(true);
        lblIconNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconNhanVienMouseExited(evt);
            }
        });
        pnlQuanLyNhanVien.add(lblIconNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lblQuanLyNhanVien.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblQuanLyNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyNhanVien.setText("Quản Lý Nhân Viên");
        lblQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuanLyNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuanLyNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuanLyNhanVienMouseExited(evt);
            }
        });
        pnlQuanLyNhanVien.add(lblQuanLyNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        pnlLeft.add(pnlQuanLyNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, 40));

        pnlQuanLyBenhNhan.setBackground(new java.awt.Color(54, 70, 78));
        pnlQuanLyBenhNhan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconBenhNhan.setBackground(new java.awt.Color(54, 70, 78));
        lblIconBenhNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconBenhNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-male-user-23.png"))); // NOI18N
        lblIconBenhNhan.setToolTipText("Quản Lý Bệnh Nhân");
        lblIconBenhNhan.setOpaque(true);
        lblIconBenhNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconBenhNhanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconBenhNhanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconBenhNhanMouseExited(evt);
            }
        });
        pnlQuanLyBenhNhan.add(lblIconBenhNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lblQuanLyBenhNhan.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblQuanLyBenhNhan.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyBenhNhan.setText("Quản Lý Bệnh Nhân");
        lblQuanLyBenhNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuanLyBenhNhanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuanLyBenhNhanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuanLyBenhNhanMouseExited(evt);
            }
        });
        pnlQuanLyBenhNhan.add(lblQuanLyBenhNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        pnlLeft.add(pnlQuanLyBenhNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 40));

        pnlQuanLyHoaDon.setBackground(new java.awt.Color(54, 70, 78));
        pnlQuanLyHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconHoaDon.setBackground(new java.awt.Color(54, 70, 78));
        lblIconHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_dollar_place_marker_30px.png"))); // NOI18N
        lblIconHoaDon.setToolTipText("Quản Lý Hoá Đơn");
        lblIconHoaDon.setOpaque(true);
        lblIconHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconHoaDonMouseExited(evt);
            }
        });
        pnlQuanLyHoaDon.add(lblIconHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lblQuanLyHoaDon.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblQuanLyHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyHoaDon.setText("Quản Lý Hoá Đơn");
        lblQuanLyHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuanLyHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuanLyHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuanLyHoaDonMouseExited(evt);
            }
        });
        pnlQuanLyHoaDon.add(lblQuanLyHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        pnlLeft.add(pnlQuanLyHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 40));

        pnlQuanLyPhieuKham.setBackground(new java.awt.Color(54, 70, 78));
        pnlQuanLyPhieuKham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconPhieuKham.setBackground(new java.awt.Color(54, 70, 78));
        lblIconPhieuKham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconPhieuKham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_ticket_30px.png"))); // NOI18N
        lblIconPhieuKham.setToolTipText("Quản Lý Phiếu Khám");
        lblIconPhieuKham.setOpaque(true);
        lblIconPhieuKham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconPhieuKhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconPhieuKhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconPhieuKhamMouseExited(evt);
            }
        });
        pnlQuanLyPhieuKham.add(lblIconPhieuKham, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lblQuanLyPhieuKham.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblQuanLyPhieuKham.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyPhieuKham.setText("Quản Lý Phiếu Khám\n");
        lblQuanLyPhieuKham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuanLyPhieuKhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuanLyPhieuKhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuanLyPhieuKhamMouseExited(evt);
            }
        });
        pnlQuanLyPhieuKham.add(lblQuanLyPhieuKham, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 20));

        pnlLeft.add(pnlQuanLyPhieuKham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 40));

        pnlQuanLyThuoc.setBackground(new java.awt.Color(54, 70, 78));
        pnlQuanLyThuoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconThuoc.setBackground(new java.awt.Color(54, 70, 78));
        lblIconThuoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconThuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_clinic_30px.png"))); // NOI18N
        lblIconThuoc.setToolTipText("Quản Lý Thuốc");
        lblIconThuoc.setOpaque(true);
        lblIconThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconThuocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconThuocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconThuocMouseExited(evt);
            }
        });
        pnlQuanLyThuoc.add(lblIconThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lblQuanLyThuoc.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblQuanLyThuoc.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyThuoc.setText("Quản Lý Thuốc");
        lblQuanLyThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuanLyThuocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuanLyThuocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuanLyThuocMouseExited(evt);
            }
        });
        pnlQuanLyThuoc.add(lblQuanLyThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        pnlLeft.add(pnlQuanLyThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, 40));

        pnlQuanLyThongKe.setBackground(new java.awt.Color(54, 70, 78));
        pnlQuanLyThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconThongKe.setBackground(new java.awt.Color(54, 70, 78));
        lblIconThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-increase-23.png"))); // NOI18N
        lblIconThongKe.setToolTipText("Quản Lý Thống Kê");
        lblIconThongKe.setOpaque(true);
        lblIconThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconThongKeMouseExited(evt);
            }
        });
        pnlQuanLyThongKe.add(lblIconThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lblThongKe.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setText("Thống Kê");
        lblThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThongKeMouseExited(evt);
            }
        });
        pnlQuanLyThongKe.add(lblThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        pnlLeft.add(pnlQuanLyThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 210, 40));

        pnlDichVu.setBackground(new java.awt.Color(54, 70, 78));
        pnlDichVu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconDichVu.setBackground(new java.awt.Color(54, 70, 78));
        lblIconDichVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-magazine-23.png"))); // NOI18N
        lblIconDichVu.setToolTipText("Quản Lý Dịch Vụ");
        lblIconDichVu.setOpaque(true);
        lblIconDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconDichVuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconDichVuMouseExited(evt);
            }
        });
        pnlDichVu.add(lblIconDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        lblDichVu.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblDichVu.setForeground(new java.awt.Color(255, 255, 255));
        lblDichVu.setText("Quản Lý Dịch Vụ");
        lblDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDichVuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDichVuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDichVuMouseExited(evt);
            }
        });
        pnlDichVu.add(lblDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        pnlLeft.add(pnlDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 40));

        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        pnlLeft.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 170, -1));

        pnlTong.add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 790));

        pnlRight.setBackground(new java.awt.Color(255, 255, 255));
        pnlRight.setFocusable(false);
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("QUẢN LÝ THUỐC");
        pnlRight.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 13, -1, -1));

        lblMaThuoc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMaThuoc.setText("Mã Thuốc :");
        pnlRight.add(lblMaThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 62, -1, -1));

        txtMaThuoc.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtMaThuoc.setForeground(new java.awt.Color(255, 0, 0));
        txtMaThuoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRight.add(txtMaThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 60, 240, 28));

        lblTenThuoc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTenThuoc.setText("Tên Thuốc :");
        pnlRight.add(lblTenThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 62, -1, -1));

        txtTenThuoc.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtTenThuoc.setForeground(new java.awt.Color(255, 0, 0));
        txtTenThuoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pnlRight.add(txtTenThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 59, 239, 28));

        lblDonViTinh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDonViTinh.setText("Đơn vị tính: ");
        pnlRight.add(lblDonViTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 136, -1, -1));

        cboDonViTinh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cboDonViTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gói", "Viên", "Hộp" }));
        pnlRight.add(cboDonViTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 133, 229, -1));

        lblMaLoaiThuoc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMaLoaiThuoc.setText("Mã Loại Thuốc:");
        pnlRight.add(lblMaLoaiThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 136, -1, -1));

        cboMaLoaiThuoc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pnlRight.add(cboMaLoaiThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 133, 212, -1));

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlRight.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 211, 87, -1));

        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlRight.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 211, 87, -1));

        btnXoa.setText("XOÁ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlRight.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 211, 87, -1));

        btnMoi.setText("MỚI");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        pnlRight.add(btnMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 211, 87, -1));

        btnTim.setText("TÌM KIẾM");
        pnlRight.add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 110, 43));

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyPhongKham/Icon/icons8_skip_to_start_32px_1.png"))); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        pnlRight.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 211, 87, -1));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyPhongKham/Icon/icons8_end_32px_1.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlRight.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 211, 87, -1));

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyPhongKham/Icon/icons8_fast_forward_32px.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlRight.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 211, 87, -1));

        tblThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Thuốc", "Tên Thuốc", "ĐVT", "Mã Loại Thuốc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThuoc.setAltoHead(35);
        tblThuoc.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblThuoc.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tblThuoc.setFuenteHead(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tblThuoc.setRowHeight(27);
        tblThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThuoc);
        if (tblThuoc.getColumnModel().getColumnCount() > 0) {
            tblThuoc.getColumnModel().getColumn(0).setMinWidth(100);
            tblThuoc.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblThuoc.getColumnModel().getColumn(0).setMaxWidth(100);
            tblThuoc.getColumnModel().getColumn(2).setMinWidth(100);
            tblThuoc.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblThuoc.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        pnlRight.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 357, 870, 420));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        pnlRight.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 520, 43));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QuanLyPhongKham/Icon/icons8_rewind_32px.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlRight.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 211, 87, -1));

        btnExcel.setText("XUẤT EXCEL");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        pnlRight.add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 160, -1));

        pnlTong.add(pnlRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 1190, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int x = 210;
    int i = 0;
    private void lblDanhMucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucMouseClicked
        if (x == 210) {
            pnlLeft.setSize(210, 790);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (i = 210; i >= 60; i--) {
                            Thread.sleep(1, 5);
                            pnlLeft.setSize(i, 790);
                            pnlRight.setLocation(60, 100);
                            pnlRight.setSize(1340, 790);
                            btnDangXuat.show(false);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 60;
        } else if (x == 60) {
            pnlLeft.setSize(x, 790);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (i = 60; i <= x; i++) {
                            Thread.sleep(1);
                            pnlLeft.setSize(i, 790);
                            pnlRight.setLocation(210, 110);
                            pnlRight.setSize(1190, 790);
                            btnDangXuat.show(true);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 210;
        }
    }//GEN-LAST:event_lblDanhMucMouseClicked

    private void lblIconNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconNhanVienMouseClicked
        this.OpenNhanVien();
    }//GEN-LAST:event_lblIconNhanVienMouseClicked

    private void lblQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyNhanVienMouseClicked
        this.OpenNhanVien();
    }//GEN-LAST:event_lblQuanLyNhanVienMouseClicked

    private void lblIconBacSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBacSiMouseClicked
        this.OpenBacSi();
    }//GEN-LAST:event_lblIconBacSiMouseClicked

    private void lblQuanLyBacSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyBacSiMouseClicked
        this.OpenBacSi();
    }//GEN-LAST:event_lblQuanLyBacSiMouseClicked

    private void lblIconHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHoaDonMouseClicked
        this.OpenHoaDon();
    }//GEN-LAST:event_lblIconHoaDonMouseClicked

    private void lblQuanLyHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyHoaDonMouseClicked
        this.OpenHoaDon();
    }//GEN-LAST:event_lblQuanLyHoaDonMouseClicked

    private void lblIconBenhNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBenhNhanMouseClicked
        this.OpenBenhNhan();
    }//GEN-LAST:event_lblIconBenhNhanMouseClicked

    private void lblQuanLyBenhNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyBenhNhanMouseClicked
        this.OpenBenhNhan();
    }//GEN-LAST:event_lblQuanLyBenhNhanMouseClicked

    private void lblIconPhieuKhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconPhieuKhamMouseClicked
        this.OpenPhieuKham();
    }//GEN-LAST:event_lblIconPhieuKhamMouseClicked

    private void lblQuanLyPhieuKhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyPhieuKhamMouseClicked
        this.OpenPhieuKham();
    }//GEN-LAST:event_lblQuanLyPhieuKhamMouseClicked

    private void lblIconThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconThongKeMouseClicked
        this.OpenThongKe();
    }//GEN-LAST:event_lblIconThongKeMouseClicked

    private void lblThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseClicked
        this.OpenThongKe();
    }//GEN-LAST:event_lblThongKeMouseClicked

    private void lblIconThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconThuocMouseClicked
        //this.OpenThuoc();
    }//GEN-LAST:event_lblIconThuocMouseClicked

    private void lblQuanLyThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyThuocMouseClicked
        //this.OpenThuoc();
    }//GEN-LAST:event_lblQuanLyThuocMouseClicked

    private void lblIconBacSiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBacSiMouseEntered
        hover(lblIconBacSi);
    }//GEN-LAST:event_lblIconBacSiMouseEntered

    private void lblIconBacSiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBacSiMouseExited
        NotHover(lblIconBacSi);
    }//GEN-LAST:event_lblIconBacSiMouseExited

    private void lblIconNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconNhanVienMouseEntered
        hover(lblIconNhanVien);
    }//GEN-LAST:event_lblIconNhanVienMouseEntered

    private void lblIconNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconNhanVienMouseExited
        NotHover(lblIconNhanVien);
    }//GEN-LAST:event_lblIconNhanVienMouseExited

    private void lblIconBenhNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBenhNhanMouseEntered
        hover(lblIconBenhNhan);
    }//GEN-LAST:event_lblIconBenhNhanMouseEntered

    private void lblIconBenhNhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconBenhNhanMouseExited
        NotHover(lblIconBenhNhan);
    }//GEN-LAST:event_lblIconBenhNhanMouseExited

    private void lblIconHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHoaDonMouseEntered
        hover(lblIconHoaDon);
    }//GEN-LAST:event_lblIconHoaDonMouseEntered

    private void lblIconHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconHoaDonMouseExited
        NotHover(lblIconHoaDon);
    }//GEN-LAST:event_lblIconHoaDonMouseExited

    private void lblIconPhieuKhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconPhieuKhamMouseEntered
        hover(lblIconPhieuKham);
    }//GEN-LAST:event_lblIconPhieuKhamMouseEntered

    private void lblIconPhieuKhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconPhieuKhamMouseExited
        NotHover(lblIconPhieuKham);
    }//GEN-LAST:event_lblIconPhieuKhamMouseExited

    private void lblIconThuocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconThuocMouseEntered
        //hover(lblIconThuoc);
    }//GEN-LAST:event_lblIconThuocMouseEntered

    private void lblIconThuocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconThuocMouseExited
        //NotHover(lblIconThuoc);
    }//GEN-LAST:event_lblIconThuocMouseExited

    private void lblIconThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconThongKeMouseEntered
        hover(lblIconThongKe);
    }//GEN-LAST:event_lblIconThongKeMouseEntered

    private void lblIconThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconThongKeMouseExited
        NotHover(lblIconThongKe);
    }//GEN-LAST:event_lblIconThongKeMouseExited

    private void lblDanhMucMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucMouseEntered
        hover(lblDanhMuc);
    }//GEN-LAST:event_lblDanhMucMouseEntered

    private void lblDanhMucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDanhMucMouseExited
        NotHover(lblDanhMuc);
    }//GEN-LAST:event_lblDanhMucMouseExited

    private void lblQuanLyBacSiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyBacSiMouseEntered
        hoverPanel(pnlQuanLyBacSi, lblIconBacSi);

    }//GEN-LAST:event_lblQuanLyBacSiMouseEntered

    private void lblQuanLyBacSiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyBacSiMouseExited
        NotHoverPanel(pnlQuanLyBacSi, lblIconBacSi);

    }//GEN-LAST:event_lblQuanLyBacSiMouseExited

    private void lblQuanLyNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyNhanVienMouseEntered
        hoverPanel(pnlQuanLyNhanVien, lblIconNhanVien);
    }//GEN-LAST:event_lblQuanLyNhanVienMouseEntered

    private void lblQuanLyNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyNhanVienMouseExited
        NotHoverPanel(pnlQuanLyNhanVien, lblIconNhanVien);
    }//GEN-LAST:event_lblQuanLyNhanVienMouseExited

    private void lblQuanLyBenhNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyBenhNhanMouseEntered
        hoverPanel(pnlQuanLyBenhNhan, lblIconBenhNhan);
    }//GEN-LAST:event_lblQuanLyBenhNhanMouseEntered

    private void lblQuanLyBenhNhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyBenhNhanMouseExited
        NotHoverPanel(pnlQuanLyBenhNhan, lblIconBenhNhan);
    }//GEN-LAST:event_lblQuanLyBenhNhanMouseExited

    private void lblQuanLyHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyHoaDonMouseEntered
        hoverPanel(pnlQuanLyHoaDon, lblIconHoaDon);
    }//GEN-LAST:event_lblQuanLyHoaDonMouseEntered

    private void lblQuanLyHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyHoaDonMouseExited
        NotHoverPanel(pnlQuanLyHoaDon, lblIconHoaDon);
    }//GEN-LAST:event_lblQuanLyHoaDonMouseExited

    private void lblQuanLyPhieuKhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyPhieuKhamMouseEntered
        hoverPanel(pnlQuanLyPhieuKham, lblIconPhieuKham);
    }//GEN-LAST:event_lblQuanLyPhieuKhamMouseEntered

    private void lblQuanLyPhieuKhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyPhieuKhamMouseExited
        NotHoverPanel(pnlQuanLyPhieuKham, lblIconPhieuKham);
    }//GEN-LAST:event_lblQuanLyPhieuKhamMouseExited

    private void lblQuanLyThuocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyThuocMouseEntered
        //hoverPanel(pnlQuanLyThuoc,lblIconThuoc);
    }//GEN-LAST:event_lblQuanLyThuocMouseEntered

    private void lblQuanLyThuocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuanLyThuocMouseExited
        //NotHoverPanel(pnlQuanLyThuoc,lblIconThuoc);
    }//GEN-LAST:event_lblQuanLyThuocMouseExited

    private void lblThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseEntered
        hoverPanel(pnlQuanLyThongKe, lblIconThongKe);
    }//GEN-LAST:event_lblThongKeMouseEntered

    private void lblThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThongKeMouseExited
        NotHoverPanel(pnlQuanLyThongKe, lblIconThongKe);
    }//GEN-LAST:event_lblThongKeMouseExited

    private void lblIconDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDichVuMouseClicked
        this.OpenDichVu();
    }//GEN-LAST:event_lblIconDichVuMouseClicked

    private void lblIconDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDichVuMouseEntered
        hover(lblIconDichVu);
    }//GEN-LAST:event_lblIconDichVuMouseEntered

    private void lblIconDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconDichVuMouseExited
        NotHover(lblIconDichVu);
    }//GEN-LAST:event_lblIconDichVuMouseExited

    private void lblDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDichVuMouseClicked
        this.OpenDichVu();
    }//GEN-LAST:event_lblDichVuMouseClicked

    private void lblDichVuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDichVuMouseEntered
        hoverPanel(pnlDichVu, lblIconDichVu);
    }//GEN-LAST:event_lblDichVuMouseEntered

    private void lblDichVuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDichVuMouseExited
        NotHoverPanel(pnlDichVu, lblIconDichVu);
    }//GEN-LAST:event_lblDichVuMouseExited

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.OpenLogin();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (txtSearch.getText().length() == 0) {
            this.filltable();
        } else {
            this.filltable();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThuocMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblThuoc.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblThuocMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clear();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        this.previous();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
       this.Export();
    }//GEN-LAST:event_btnExcelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyThuoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btnDangXuat;
    private rojeru_san.complementos.RSButtonHover btnExcel;
    private rojeru_san.complementos.RSButtonHover btnFirst;
    private rojeru_san.complementos.RSButtonHover btnLast;
    private rojeru_san.complementos.RSButtonHover btnMoi;
    private rojeru_san.complementos.RSButtonHover btnNext;
    private rojeru_san.complementos.RSButtonHover btnPrevious;
    private rojeru_san.complementos.RSButtonHover btnSua;
    private rojeru_san.complementos.RSButtonHover btnThem;
    private rojeru_san.complementos.RSButtonHover btnTim;
    private rojeru_san.complementos.RSButtonHover btnXoa;
    private javax.swing.JComboBox<String> cboDonViTinh;
    private javax.swing.JComboBox<String> cboMaLoaiThuoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSFotoCircle lblAnhNV;
    private javax.swing.JLabel lblDanhMuc;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblDichVu;
    private javax.swing.JLabel lblDonViTinh;
    private javax.swing.JLabel lblIconBacSi;
    private javax.swing.JLabel lblIconBenhNhan;
    private javax.swing.JLabel lblIconDichVu;
    private javax.swing.JLabel lblIconHoaDon;
    private javax.swing.JLabel lblIconNhanVien;
    private javax.swing.JLabel lblIconPhieuKham;
    private javax.swing.JLabel lblIconThongKe;
    private javax.swing.JLabel lblIconThuoc;
    private javax.swing.JLabel lblMaLoaiThuoc;
    private javax.swing.JLabel lblMaThuoc;
    private javax.swing.JLabel lblQuanLyBacSi;
    private javax.swing.JLabel lblQuanLyBenhNhan;
    private javax.swing.JLabel lblQuanLyHoaDon;
    private javax.swing.JLabel lblQuanLyNhanVien;
    private javax.swing.JLabel lblQuanLyPhieuKham;
    private javax.swing.JLabel lblQuanLyThuoc;
    private javax.swing.JLabel lblTenThuoc;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblXinChao;
    private javax.swing.JPanel pnlDichVu;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlQuanLyBacSi;
    private javax.swing.JPanel pnlQuanLyBenhNhan;
    private javax.swing.JPanel pnlQuanLyHoaDon;
    private javax.swing.JPanel pnlQuanLyNhanVien;
    private javax.swing.JPanel pnlQuanLyPhieuKham;
    private javax.swing.JPanel pnlQuanLyThongKe;
    private javax.swing.JPanel pnlQuanLyThuoc;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTong;
    private rojeru_san.complementos.RSTableMetro tblThuoc;
    private javax.swing.JTextField txtMaThuoc;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenThuoc;
    // End of variables declaration//GEN-END:variables
    thuocDAO thdao = new thuocDAO();
    loaithuocDAO ltdao = new loaithuocDAO();
    int row = -1;

    private void init() {
        hoverPanel(pnlQuanLyThuoc, lblIconThuoc);
        setLocationRelativeTo(null);
        this.LoadNgay();
        this.filltable();
        this.fillComboBox();
        this.updateStatus();
    }

    //Hover màu
    private void hover(JLabel lbl) {
        lbl.setBackground(new java.awt.Color(53, 162, 107));
    }

    private void NotHover(JLabel lbl) {
        lbl.setBackground(new java.awt.Color(54, 70, 78));
    }

    private void hoverPanel(JPanel pnl, JLabel lbl) {
        pnl.setBackground(new java.awt.Color(53, 162, 107));
        lbl.setBackground(new java.awt.Color(53, 162, 107));
    }

    private void NotHoverPanel(JPanel pnl, JLabel lbl) {
        pnl.setBackground(new java.awt.Color(54, 70, 78));
        lbl.setBackground(new java.awt.Color(54, 70, 78));
    }

    private void LoadNgay() {
        new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                //SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss a");
                String day = sdf.format(date);
                //String time = sdf1.format(date);
                lblDay.setText(day);
                //lblTime.setText(time);
            }
        }).start();
    }
//   

    private void OpenBacSi() {
        this.dispose();
        new QuanLyBacSi().setVisible(true);
    }

    private void OpenBenhNhan() {
        this.dispose();
        new QuanLyBenhNhan().setVisible(true);
    }

    private void OpenNhanVien() {
        this.dispose();
        new QuanLyNhanVien().setVisible(true);
    }

    private void OpenHoaDon() {
        this.dispose();
        new QuanLyHoaDon().setVisible(true);
    }

    private void OpenPhieuKham() {
        this.dispose();
        new QuanLyPhieuKham().setVisible(true);
    }

    private void OpenThuoc() {
        this.dispose();
        new QuanLyThuoc().setVisible(true);
    }

    private void OpenDichVu() {
        this.dispose();
        new QuanLyHoaDon().setVisible(true);
    }

    private void OpenLogin() {
        this.dispose();
        new dangnhap(this, true).setVisible(true);
    }

    private void OpenThongKe() {
       // this.dispose();
        //new ThongKe().setVisible(true);
    }

    private void filltable() {
        DefaultTableModel model = (DefaultTableModel) tblThuoc.getModel();
        model.setRowCount(0);
        try {
            String text = txtSearch.getText();
            List<Thuoc> list = thdao.SearchKeyWord(text, text, text);
            for (Thuoc th : list) {
                model.addRow(new Object[]{
                    th.getMaThuoc(), th.getTenthuoc(), th.getDonvitinh(), th.getMaloaithuoc()
                });
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fillComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaLoaiThuoc.getModel();
        model.removeAllElements();
        try {
            List<LoaiThuoc> list = ltdao.SelectAll();
            for (LoaiThuoc lt : list) {
                model.addElement(lt);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private Thuoc getForm() {
        int maloai = cboMaLoaiThuoc.getSelectedIndex();
        Thuoc th = new Thuoc();
        th.setMaThuoc(txtMaThuoc.getText());
        th.setTenthuoc(txtTenThuoc.getText());
        th.setDonvitinh((String) cboDonViTinh.getSelectedItem());
        th.setMaloaithuoc(maloai + 1);
        return th;
    }

    private void setForm(Thuoc th) {
        int maloaithuoc = (int) tblThuoc.getValueAt(row, 3);
        txtMaThuoc.setText(th.getMaThuoc());
        txtTenThuoc.setText(th.getTenthuoc());
        cboDonViTinh.setSelectedItem(th.getDonvitinh());
        cboMaLoaiThuoc.setSelectedIndex(maloaithuoc - 1);
    }

    private void edit() {
        String mathuoc = (String) tblThuoc.getValueAt(row, 0);
        Thuoc th = thdao.SelectByID(mathuoc);
        setForm(th);
        this.updateStatus();
    }

    private void clear() {
        txtMaThuoc.setText("");
        txtTenThuoc.setText("");
        cboDonViTinh.setSelectedIndex(0);
        cboMaLoaiThuoc.setSelectedIndex(0);
        this.row = -1;
        this.updateStatus();
    }

    private void insert() {
        if (Validate()) {
            try {
                Thuoc th = getForm();
                thdao.insert(th);
                this.filltable();
                MsgBox.alert(this, "Insert thành công!!");
                this.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        if (Validate()) {
            try {
                Thuoc th = getForm();
                thdao.update(th);
                this.filltable();
                MsgBox.alert(this, "Update thành công!!");
                this.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void delete() {
        if(Validation.isempty(txtMaThuoc, "Mã Thuốc đang rỗng!!")==false){
            return;
        }
        if (MsgBox.confirm(this, "Bạn có muốn xoá thuốc này không?")) {
            try {
                String mathuoc = txtMaThuoc.getText();
                thdao.delete(mathuoc);
                this.filltable();
                MsgBox.alert(this, "Delete thành công!!");
                this.clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void first() {
        row = 0;
        this.edit();
        tblThuoc.setRowSelectionInterval(row, row);
    }

    private void previous() {
        if (this.row > 0) {
            this.row--;
            this.edit();
            tblThuoc.setRowSelectionInterval(row, row);
        }
    }

    private void next() {
        if (this.row < tblThuoc.getRowCount() - 1) {
            this.row++;
            this.edit();
            tblThuoc.setRowSelectionInterval(row, row);
        }
    }

    private void last() {
        row = tblThuoc.getRowCount() - 1;
        this.edit();
        tblThuoc.setRowSelectionInterval(row, row);
    }

    private boolean Validate() {
        if (Validation.isempty(txtMaThuoc, "Mã Thuốc đang rỗng!!!") == false) {
            return false;
        }

        if (Validation.isempty(txtTenThuoc, "Tên Thuốc đang rỗng!!!") == false) {
            return false;
        }

        return true;
    }
    
    private void updateStatus(){
        boolean edit = (this.row>=0);
        boolean first = (this.row==0);
        boolean last = (this.row == tblThuoc.getRowCount()-1);
        
        txtMaThuoc.setEnabled(!edit);
        btnThem.setEnabled(!edit);
        btnXoa.setEnabled(edit);
        btnSua.setEnabled(edit);
        btnMoi.setEnabled(edit);
        
        btnFirst.setEnabled(edit && !first);
        btnPrevious.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
        
    }
    
    XSSFWorkbook workbook;

    private CellStyle headerCellStyle() {
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
        cellStyle.setBorderBottom(BorderStyle.THICK);
        cellStyle.setBorderLeft(BorderStyle.THICK);
        cellStyle.setBorderRight(BorderStyle.THICK);
        cellStyle.setBorderTop(BorderStyle.THICK);

        org.apache.poi.ss.usermodel.Font font = workbook.createFont();
        font.setBold(true);
        font.setFontName("Times New Roman");
        font.setFontHeight((short) 350);
        cellStyle.setFont(font);
        return cellStyle;
    }
    
    private CellStyle coCellStyle() {
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(org.apache.poi.ss.usermodel.VerticalAlignment.CENTER);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THICK);
        cellStyle.setBorderRight(BorderStyle.THICK);
        cellStyle.setBorderTop(BorderStyle.THIN);

        org.apache.poi.ss.usermodel.Font font = workbook.createFont();
        font.setFontName("Times New Roman");
        font.setFontHeight((short) 250);
        cellStyle.setFont(font);
        return cellStyle;
    }
    
    private void Export() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save as");
        FileNameExtensionFilter f = new FileNameExtensionFilter("xls", "xlsx");
        FileOutputStream out = null;
        chooser.setFileFilter(f);
        int excel = chooser.showSaveDialog(null);
        if (excel == JFileChooser.APPROVE_OPTION) {
            try {
                workbook = new XSSFWorkbook();
                XSSFSheet spreadsheet1 = workbook.createSheet("Danh sách Thuốc");
                XSSFRow rows1 = null;
                Cell cells1 = null;
                CellStyle cs = headerCellStyle();
                CellStyle csc = coCellStyle();

                rows1 = spreadsheet1.createRow((short) 1);
                rows1.setHeight((short) 500);

                //HEADER
                cells1 = rows1.createCell(0, CellType.STRING);
                cells1.setCellValue("Thông tin Thuốc");
                rows1 = spreadsheet1.createRow((short) 2);
                rows1.setHeight((short) 500);
                cells1 = rows1.createCell(0, CellType.STRING);
                cells1.setCellValue("Mã Thuốc");
                cells1.setCellStyle(cs);
                cells1 = rows1.createCell(1, CellType.STRING);
                cells1.setCellValue("Tên Thuốc");
                cells1.setCellStyle(cs);
                cells1 = rows1.createCell(2, CellType.STRING);
                cells1.setCellValue("Đơn Vị Tính");
                cells1.setCellStyle(cs);
                cells1 = rows1.createCell(3, CellType.STRING);
                cells1.setCellValue("Mã Loại Thuốc");
                cells1.setCellStyle(cs);
      

                //ROW
                List<Thuoc> list = thdao.SelectAll();
                for (int i = 0; i < list.size(); i++) {
                    Thuoc dt = list.get(i);
                    rows1 = spreadsheet1.createRow((short) 3 + i);
                    rows1.setHeight((short) 500);
                    cells1 = rows1.createCell(0);
                    cells1.setCellValue(dt.getMaThuoc());
                    cells1.setCellStyle(csc);
                    cells1 = rows1.createCell(1);
                    cells1.setCellValue(dt.getTenthuoc());
                    cells1.setCellStyle(csc);
                    cells1 = rows1.createCell(2);
                    cells1.setCellValue(dt.getDonvitinh());
                    cells1.setCellStyle(csc);
                    cells1.setCellStyle(csc);
                    cells1 = rows1.createCell(3);
                    cells1.setCellValue(dt.getMaloaithuoc());
                    cells1.setCellStyle(csc);
                    
                }
                for (int i = 0; i < 4; i++) {
                    spreadsheet1.autoSizeColumn(i);
                }
                out = new FileOutputStream(chooser.getSelectedFile() + ".xlsx");
                workbook.write(out);
                out.close();
                JOptionPane.showMessageDialog(this, "Xuất file thành công");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ổ đĩa");
        }
    }

}
