/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import com.QuanLyPhongKham.Model.PhieuKham;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ThongKeServiceImpl implements ThongKeService{
    private ThongKeDAO thongKeDAO = null;

    public ThongKeServiceImpl() {
        this.thongKeDAO = new ThongKeImpl();
    }
    @Override
    public List<PhieuKham> getListByPhieuKham() {
        
        return thongKeDAO.getListByPhieuKham();
        
    }
    
}
