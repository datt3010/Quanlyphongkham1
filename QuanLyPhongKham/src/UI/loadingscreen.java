/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author p
 */
public class loadingscreen extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public loadingscreen() {
        initComponents();
        setLocationRelativeTo(null);
        setup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblphantram = new javax.swing.JLabel();
        lblloading = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblphantram.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblphantram.setText("0 %");
        jPanel1.add(lblphantram, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, -1, -1));

        lblloading.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblloading.setText("Loading...");
        jPanel1.add(lblloading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 270, -1));
        jPanel1.add(loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 970, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\PRO1041\\Duan\\QuanLyPhongKham\\QuanLyPhongKham\\src\\Icon\\background.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(loadingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loadingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loadingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loadingscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loadingscreen().setVisible(true);
            }
        });
    }
void setup(){
Thread b;
b=new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(150);
                lblphantram.setText(i+" %");
                if(i==10){
                    lblloading.setText("Connecting database");
                }
                if(i==30){
                    lblloading.setText("Loading model");
                }
                if(i==50){
                    lblloading.setText("loading entity");
                }
                if(i==70){
                    lblloading.setText("Loading graphics");
                }
                if(i==90){
                    lblloading.setText("lauching application");
                }
                loadingbar.setValue(i);
            }
        } catch (Exception e) {
        }
       dangnhap a=new dangnhap(); 
       a.setVisible(true);
       dispose();
    }
});
b.start();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblloading;
    private javax.swing.JLabel lblphantram;
    private javax.swing.JProgressBar loadingbar;
    // End of variables declaration//GEN-END:variables
}