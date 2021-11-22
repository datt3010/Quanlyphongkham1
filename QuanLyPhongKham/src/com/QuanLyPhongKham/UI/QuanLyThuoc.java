/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.UI;

import com.QuanLyPhongKham.DAO.thuocDAO;
import com.QuanLyPhongKham.Model.Thuoc;
import com.QuanLyPhongKham.Utilities.MsgBox;
import com.QuanLyPhongKham.Utilities.XDate;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
        this.load();
    }
    thuocDAO dao = new thuocDAO();
    int index = 0;

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);
        try {
            List<Thuoc> list = dao.selectAll();
            for (Thuoc th : list) {
                Object[] row = {
                    th.getMaThuoc(),
                    th.getTennthuoc(),
                    th.getDonvi(),
                    XDate.toString(th.getHansudung()),
                    th.getMaloaithuoc()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void insert() {
        Thuoc model = getModel();
        try {
            dao.insert(model);
            this.load();
            this.clear();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (HeadlessException e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        Thuoc model = getModel();
        try {
            dao.update(model);
            this.load();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
//            DialogHelper.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }

    void delete() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa thuốc này?")) {
            String mathuoc = txtma.getText();
            try {

                dao.delete(mathuoc);
                this.load();
                this.clear();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }

    void clear() {
        Thuoc model = new Thuoc();

        this.setModel(model);
        setStatus(true);
    }

    void edit() {
        try {
            String mathuoc = (String) tblGridView.getValueAt(this.index, 0);
            Thuoc model = dao.findById(mathuoc);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setModel(Thuoc model) {
        txtma.setText(model.getMaThuoc());
        try {
        } catch (Exception ex) {
            MsgBox.alert(this, "Lỗi chuyển dịch");
        }
        txtma.setText(model.getMaThuoc());
        txtthuoc.setText(model.getTennthuoc());
        txtdonvi.setText(model.getDonvi());
        txtmaloai.setText(String.valueOf(model.getMaloaithuoc()));
    }

    Thuoc getModel() {
        Thuoc model = new Thuoc();
        model.setMaThuoc(txtma.getText());
        model.setTennthuoc(txtthuoc.getText());
        model.setDonvi(txtdonvi.getText());
        model.setMaloaithuoc(Integer.valueOf(txtmaloai.getText()));
        return model;
    }

    void setStatus(boolean insertable) {
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        btnDelete.setEnabled(!insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tblGridView.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnLast.setEnabled(!insertable && last);
        btnNext.setEnabled(!insertable && last);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        txtdonvi = new javax.swing.JTextField();
        txtthuoc = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtmaloai = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGridView = new rojeru_san.complementos.RSTableMetro();

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mã thuốc:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Tên thuốc:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Đơn vị tính:");

        btnInsert.setBackground(new java.awt.Color(255, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon("D:\\duan1111\\Quanlyphongkham1\\QuanLyPhongKham\\src\\com\\QuanLyPhongKham\\Icon\\them_20px.png")); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\duan1111\\Quanlyphongkham1\\QuanLyPhongKham\\src\\com\\QuanLyPhongKham\\Icon\\update_ftp_20px.png")); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\duan1111\\Quanlyphongkham1\\QuanLyPhongKham\\src\\com\\QuanLyPhongKham\\Icon\\delete_20px.png")); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(255, 255, 255));
        btnclear.setIcon(new javax.swing.ImageIcon("D:\\duan1111\\Quanlyphongkham1\\QuanLyPhongKham\\src\\com\\QuanLyPhongKham\\Icon\\refresh_20px.png")); // NOI18N
        btnclear.setText("Mới");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon("D:\\duan1111\\Quanlyphongkham1\\QuanLyPhongKham\\src\\com\\QuanLyPhongKham\\Icon\\rewind_20px.png")); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setIcon(new javax.swing.ImageIcon("D:\\duan1111\\Quanlyphongkham1\\QuanLyPhongKham\\src\\com\\QuanLyPhongKham\\Icon\\rewind_20px.png")); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon("D:\\duan1111\\Quanlyphongkham1\\QuanLyPhongKham\\src\\com\\QuanLyPhongKham\\Icon\\fast_forward_20px.png")); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon("D:\\duan1111\\Quanlyphongkham1\\QuanLyPhongKham\\src\\com\\QuanLyPhongKham\\Icon\\fast_forward_20px.png")); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Mã loại thuốc:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách bảng thuốc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã  thuốc", "Tên thuốc", "Đơn vị tính", "Hạn sử dụng", "Mã loại thuốc"
            }
        ));
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGridView);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnFirst)
                        .addGap(122, 122, 122)
                        .addComponent(btnPrev)
                        .addGap(179, 179, 179)
                        .addComponent(btnLast)
                        .addGap(182, 182, 182)
                        .addComponent(btnNext))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlRightLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(65, 65, 65)
                                .addComponent(txtmaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlRightLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrev)
                            .addComponent(btnFirst)
                            .addComponent(btnLast)
                            .addComponent(btnNext))
                        .addGap(41, 41, 41))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

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

    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.index = tblGridView.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();

            }
        }
    }//GEN-LAST:event_tblGridViewMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index = tblGridView.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnclear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSFotoCircle lblAnhNV;
    private javax.swing.JLabel lblDanhMuc;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblDichVu;
    private javax.swing.JLabel lblIconBacSi;
    private javax.swing.JLabel lblIconBenhNhan;
    private javax.swing.JLabel lblIconDichVu;
    private javax.swing.JLabel lblIconHoaDon;
    private javax.swing.JLabel lblIconNhanVien;
    private javax.swing.JLabel lblIconPhieuKham;
    private javax.swing.JLabel lblIconThongKe;
    private javax.swing.JLabel lblIconThuoc;
    private javax.swing.JLabel lblQuanLyBacSi;
    private javax.swing.JLabel lblQuanLyBenhNhan;
    private javax.swing.JLabel lblQuanLyHoaDon;
    private javax.swing.JLabel lblQuanLyNhanVien;
    private javax.swing.JLabel lblQuanLyPhieuKham;
    private javax.swing.JLabel lblQuanLyThuoc;
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
    private rojeru_san.complementos.RSTableMetro tblGridView;
    private javax.swing.JTextField txtdonvi;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtmaloai;
    private javax.swing.JTextField txtthuoc;
    // End of variables declaration//GEN-END:variables
    private void init() {
        hoverPanel(pnlQuanLyThuoc, lblIconThuoc);
        setLocationRelativeTo(null);
        this.LoadNgay();

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
        new QuanLyDichVu().setVisible(true);
    }

    private void OpenLogin() {
        this.dispose();
        new dangnhap().setVisible(true);
    }

    private void OpenThongKe() {
        //this.dispose();
//        new ThongKe().setVisible(true);
    }
}
