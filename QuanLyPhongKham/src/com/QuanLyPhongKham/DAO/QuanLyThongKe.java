/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLyPhongKham.DAO;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Administrator
 */
public class QuanLyThongKe {
    private ThongKeService tksv = null;
    public QuanLyThongKe(){
//        this.tksv = new ThongKeServiceImpl();
        
    }
    public void setDataToChart1(JPanel jpnItem) throws SQLException {
        ResultSet r = jdbcHelper.query("select count(mabenhnhan), year(ngaykham) from phieukham group by year(ngaykham)");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();     
        while(r.next()){
            dataset.addValue(r.getInt(1), "bệnh nhân", r.getString(2));
        }   
        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng bệnh nhân ".toUpperCase(),
                "Thời gian", "Số lượng",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 310));

        jpnItem.removeAll();
        
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
}
}
