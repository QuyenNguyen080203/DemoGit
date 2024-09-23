/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrCTHD extends javax.swing.JFrame {

    /**
     * Creates new form FrCTHD
     */
    public FrCTHD() {
        initComponents();
    }
    public void setLabels(String mahd, String mave, String hoten,String cccd,String macb,String sbdi,String sbden,String ngaybay,String thoigianbay,String soghe,String hangghe,String giave,String thue,String tongtien,String trangthai) {
        lbmahd.setText(mahd);
        lbmave.setText(mave);
        lbhoten.setText(hoten);
        lbcccd.setText(cccd);
        lbmacb.setText(macb);
        lbsanbd.setText(sbdi);
        lbsanbden.setText(sbden);
        lbngaybay.setText(ngaybay);
        lbtimebay.setText(thoigianbay);
        lbsoghe.setText(soghe);
        lbhangghe.setText(hangghe);
        lbgiave.setText(giave);
        lbthue.setText(thue);
        lbtongtien.setText(tongtien);
        lbtrangthai.setText(trangthai);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelChitiet = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        btDong = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        lbmahd = new javax.swing.JLabel();
        lbsanbd = new javax.swing.JLabel();
        lbsanbden = new javax.swing.JLabel();
        lbngaybay = new javax.swing.JLabel();
        lbtimebay = new javax.swing.JLabel();
        lbsoghe = new javax.swing.JLabel();
        lbhangghe = new javax.swing.JLabel();
        lbtrangthai = new javax.swing.JLabel();
        lbtongtien = new javax.swing.JLabel();
        lbthue = new javax.swing.JLabel();
        lbgiave = new javax.swing.JLabel();
        lbmave = new javax.swing.JLabel();
        lbhoten = new javax.swing.JLabel();
        lbcccd = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        lbmacb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelChitiet.setBackground(new java.awt.Color(221, 213, 213));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/tensb.png"))); // NOI18N
        jLabel59.setText("Sân Bay Đi:");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/soghe.png"))); // NOI18N
        jLabel60.setText("Số Ghế:");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/masb.png"))); // NOI18N
        jLabel61.setText("Sân Bay Đến:");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/date.png"))); // NOI18N
        jLabel62.setText("Ngày Bay:");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/time.png"))); // NOI18N
        jLabel63.setText("Thời Gian Bay:");

        jPanel20.setBackground(new java.awt.Color(251, 195, 138));

        jLabel64.setBackground(new java.awt.Color(255, 255, 0));
        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/chitiethd.png"))); // NOI18N
        jLabel64.setText("CHI TIẾT HÓA ĐƠN");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/hangghe.png"))); // NOI18N
        jLabel65.setText("Hạng Ghế:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/tongtien.png"))); // NOI18N
        jLabel9.setText("Tổng Tiền:");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/thue.png"))); // NOI18N
        jLabel66.setText("Thuế:");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/giave.png"))); // NOI18N
        jLabel67.setText("Giá Vé:");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/ticket.png"))); // NOI18N
        jLabel68.setText("Mã Vé:");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/hoten.png"))); // NOI18N
        jLabel69.setText("Họ Và Tên:");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/makh.png"))); // NOI18N
        jLabel70.setText("CCCD:");

        btDong.setBackground(new java.awt.Color(204, 51, 0));
        btDong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDong.setForeground(new java.awt.Color(255, 255, 255));
        btDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/daux.png"))); // NOI18N
        btDong.setText("Đóng >>");
        btDong.setPreferredSize(new java.awt.Dimension(119, 39));
        btDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDongActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/macb.png"))); // NOI18N
        jLabel71.setText("Mã Hóa Đơn:");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/trangthai.png"))); // NOI18N
        jLabel72.setText("Trạng Thái:");

        lbmahd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbmahd.setText("abc");

        lbsanbd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbsanbd.setText("abc");

        lbsanbden.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbsanbden.setText("abc");

        lbngaybay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbngaybay.setText("abc");

        lbtimebay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbtimebay.setText("abc");

        lbsoghe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbsoghe.setText("abc");

        lbhangghe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbhangghe.setText("abc");

        lbtrangthai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbtrangthai.setText("abc");

        lbtongtien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbtongtien.setText("abc");

        lbthue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbthue.setText("abc");

        lbgiave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbgiave.setText("abc");

        lbmave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbmave.setText("abc");

        lbhoten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbhoten.setText("abc");

        lbcccd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbcccd.setText("abc");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btl/sanbay2.png"))); // NOI18N
        jLabel73.setText("Mã Chuyến Bay:");

        lbmacb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbmacb.setText("abc");

        javax.swing.GroupLayout jPanelChitietLayout = new javax.swing.GroupLayout(jPanelChitiet);
        jPanelChitiet.setLayout(jPanelChitietLayout);
        jPanelChitietLayout.setHorizontalGroup(
            jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelChitietLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelChitietLayout.createSequentialGroup()
                        .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel71)
                            .addComponent(jLabel60)
                            .addComponent(jLabel63)
                            .addComponent(jLabel62)
                            .addComponent(jLabel61)
                            .addComponent(jLabel59))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbmahd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbmave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbsanbd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbsanbden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbngaybay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbtimebay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbsoghe, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel73)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69)
                            .addComponent(jLabel67)
                            .addComponent(jLabel66)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtrangthai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbhoten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbgiave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelChitietLayout.createSequentialGroup()
                        .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbthue, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbmacb, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbhangghe, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcccd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbtongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelChitietLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btDong, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelChitietLayout.setVerticalGroup(
            jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChitietLayout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(lbmahd)
                    .addComponent(jLabel65)
                    .addComponent(lbhangghe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(lbmave)
                    .addComponent(jLabel73)
                    .addComponent(lbmacb))
                .addGap(17, 17, 17)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(lbsanbd)
                    .addComponent(jLabel70)
                    .addComponent(lbcccd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(lbsanbden)
                    .addComponent(jLabel69)
                    .addComponent(lbhoten))
                .addGap(23, 23, 23)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(lbngaybay)
                    .addComponent(jLabel67)
                    .addComponent(lbgiave))
                .addGap(18, 18, 18)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(lbtimebay)
                    .addComponent(jLabel66)
                    .addComponent(lbthue))
                .addGap(18, 18, 18)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(lbsoghe))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lbtongtien)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(lbtrangthai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelChitiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelChitiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDongActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đóng không ?", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            this.setVisible(false);
        } else {
            this.setVisible(true);
        }
    }//GEN-LAST:event_btDongActionPerformed

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
            java.util.logging.Logger.getLogger(FrCTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCTHD().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDong;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanelChitiet;
    private javax.swing.JLabel lbcccd;
    private javax.swing.JLabel lbgiave;
    private javax.swing.JLabel lbhangghe;
    private javax.swing.JLabel lbhoten;
    private javax.swing.JLabel lbmacb;
    private javax.swing.JLabel lbmahd;
    private javax.swing.JLabel lbmave;
    private javax.swing.JLabel lbngaybay;
    private javax.swing.JLabel lbsanbd;
    private javax.swing.JLabel lbsanbden;
    private javax.swing.JLabel lbsoghe;
    private javax.swing.JLabel lbthue;
    private javax.swing.JLabel lbtimebay;
    private javax.swing.JLabel lbtongtien;
    private javax.swing.JLabel lbtrangthai;
    // End of variables declaration//GEN-END:variables
}