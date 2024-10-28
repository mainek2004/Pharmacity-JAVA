
package qlycuahangthuoc.GUI;

import qlycuahangthuoc.BUS.QlyNCC_Bus;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.table.DefaultTableModel;
import qlycuahangthuoc.DAO.QlyNCC_Dao;
import qlycuahangthuoc.DTO.NhaCungCap;
import qlycuahangthuoc.GUI.QlyPhieuNhap;

/**
 *
 * @author Mai
 */
public class QlyNhaCC extends javax.swing.JFrame {
    QlyNCC_Bus nccBus = new QlyNCC_Bus();
    NhaCungCap ncc = new NhaCungCap();

    public QlyNhaCC() {
        initComponents();
        loadlist();
        populateComboBox();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnADD = new javax.swing.JButton();
        btnEDIT = new javax.swing.JButton();
        btnDEL = new javax.swing.JButton();
        btnBACK = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtIDncc = new javax.swing.JTextField();
        txtTenNCC = new javax.swing.JTextField();
        txtDC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSdtNCC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "SDT"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Quản lý nhà cung cấp");

        jLabel2.setText("Mã nhà cung cấp");

        jLabel3.setText("Tên nhà cung cấp");

        jLabel4.setText("Địa chỉ");

        btnADD.setText("Thêm");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnEDIT.setText("Sửa");
        btnEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITActionPerformed(evt);
            }
        });

        btnDEL.setText("Xóa");
        btnDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELActionPerformed(evt);
            }
        });

        btnBACK.setText("Trở về phiếu nhập");
        btnBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBACKActionPerformed(evt);
            }
        });

        jButton5.setText("Tìm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "chon MaNCC" }));

        jLabel5.setText("Số ĐT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(33, 33, 33)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEDIT)
                            .addComponent(btnADD))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIDncc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSdtNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDEL)
                                    .addComponent(btnBACK))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtIDncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSdtNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDEL)
                            .addComponent(btnADD))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBACK)
                            .addComponent(btnEDIT))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------Thêm--------------------
    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        try {
            if (txtIDncc.getText().isEmpty() ||
                    txtTenNCC.getText().isEmpty() ||
                    txtDC.getText().isEmpty() ||
                    txtSdtNCC.getText().isEmpty())
                JOptionPane.showMessageDialog(this, "Vui long nhap du thong tin");
            else{
                NhaCungCap nccDTO = new NhaCungCap();
                nccDTO.setMaNCC(txtIDncc.getText());
                nccDTO.setTenNCC(txtTenNCC.getText());
                nccDTO.setAddress(txtDC.getText());
                nccDTO.setPhoneNumber(txtSdtNCC.getText());
                
                JOptionPane.showMessageDialog(this, nccBus.addNCC(nccDTO));
                populateComboBox();
                loadlist();
                
                txtIDncc.setText("");
                txtTenNCC.setText("");
                txtDC.setText("");
                txtSdtNCC.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnADDActionPerformed

     //----------------------Xoa-----------------------
    private void btnDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELActionPerformed
      int select = jTable1.getSelectedRow();
      if (select != -1)
      {
          String id = jTable1.getValueAt(select, 0).toString();
          String ten = jTable1.getValueAt(select, 1).toString();
          String dc = jTable1.getValueAt(select, 2).toString();
          String sdt = jTable1.getValueAt(select, 3).toString();
          int kq = JOptionPane.showConfirmDialog(this, "Ban muon xoa ?","", JOptionPane.YES_NO_OPTION);
          if (kq == JOptionPane.YES_OPTION)
          {
              String result = nccBus.deleteNCC(id);
              ((DefaultTableModel) jTable1.getModel()).removeRow(select);
              populateComboBox();
              loadlist();
              
               txtIDncc.setText("");
                txtTenNCC.setText("");
                txtDC.setText("");
                txtSdtNCC.setText("");
          }
      }
    }//GEN-LAST:event_btnDELActionPerformed

    //-----------------------Sua--------------------
    private void btnEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITActionPerformed
        int selected = jTable1.getSelectedRow();
        if (selected != -1)
        {
            String id = jTable1.getValueAt(selected, 1).toString(); // Lấy MSSV từ cột thứ 1
            String newName = txtTenNCC.getText();
            String newDC = txtDC.getText();
            String newSDT = txtSdtNCC.getText();
        
            NhaCungCap ncc1 = new NhaCungCap(id, newName, newDC, newSDT);
            JOptionPane.showMessageDialog(this, nccBus.updateNCC(ncc1));
            loadlist();
            
            txtIDncc.setText("");
            txtTenNCC.setText("");
            txtDC.setText("");
            txtSdtNCC.setText("");
    }//GEN-LAST:event_btnEDITActionPerformed
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int selectedRow = jTable1.getSelectedRow(); // Lấy hàng được chọn
        if (selectedRow != -1) {
        // Lấy dữ liệu từ các cột trong hàng được chọn
        String id = jTable1.getValueAt(selectedRow, 0).toString(); // Lấy MSSV từ cột thứ 1
        String ten = jTable1.getValueAt(selectedRow, 1).toString(); // Lấy tên từ cột thứ 2
        String dc = jTable1.getValueAt(selectedRow, 2).toString(); // Lấy điểm từ cột thứ 3
        String sdt = jTable1.getValueAt(selectedRow, 3).toString(); // Lấy điểm từ cột thứ 3

        // Hiển thị thông tin vào các JTextField
        txtIDncc.setText(id);
        txtTenNCC.setText(ten);
        txtDC.setText(dc);
        txtSdtNCC.setText(sdt);
    }//GEN-LAST:event_jTable1MouseClicked
}
    //-------------------------Tìm kiếm--------------
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        String selectedMaNCC = (String) jComboBox1.getSelectedItem();
        if (selectedMaNCC != null) {
            searchNCC(selectedMaNCC);
        
    }//GEN-LAST:event_jButton5ActionPerformed
}
    private void searchNCC(String maNCC) {
        NhaCungCap ncc = nccBus.findbyID(maNCC);
        if (ncc != null) {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("MaNCC");
            model.addColumn("TenNCC");
            model.addColumn("DiaChi");
            model.addColumn("SDT");
            model.addRow(new Object[]{ncc.getMaNCC(), ncc.getTenNCC(), ncc.getAddress(), ncc.getPhoneNumber()});
            jTable1.setModel(model);

            txtIDncc.setText(ncc.getMaNCC());
            txtTenNCC.setText(ncc.getTenNCC());
            txtDC.setText(ncc.getAddress());
            txtSdtNCC.setText(ncc.getPhoneNumber());
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhà cung cấp!");
        }
}
    private void btnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBACKActionPerformed
        QlyPhieuNhap pn = new QlyPhieuNhap();
        pn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBACKActionPerformed

    

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
            java.util.logging.Logger.getLogger(QlyNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QlyNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QlyNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QlyNhaCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QlyNhaCC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnBACK;
    private javax.swing.JButton btnDEL;
    private javax.swing.JButton btnEDIT;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtIDncc;
    private javax.swing.JTextField txtSdtNCC;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables

    private void loadlist() {
        Vector<NhaCungCap> nccList = new Vector<NhaCungCap>();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("MaNCC");
        model.addColumn("TenNCC");
        model.addColumn("DiaChi");
        model.addColumn("SDT");
        
        nccList = nccBus.getListNCC();
        
        for (int i = 0; i < nccList.size(); i++)
        {
            NhaCungCap ncc = new NhaCungCap();
            ncc = nccList.get(i);
            String idNCC = ncc.getMaNCC();
            String tenNCC = ncc.getTenNCC();
            String sdt = ncc.getPhoneNumber();
            String dc = ncc.getAddress();
            Object[] row = {idNCC, tenNCC, dc, sdt};
            model.addRow(row);
        }
         jTable1.setModel(model);
}


    //----------------điền dữ liệu vào combobox-----------------
    private void populateComboBox() {
        Vector <NhaCungCap> ncclist = nccBus.getListNCC();
        for (NhaCungCap ncc : ncclist)
        {
            jComboBox1.addItem(ncc.getMaNCC());
        }
    }
}