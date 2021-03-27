/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Helper.DialogHelper;
import Helper.ShareHelper;
import dao.ThongTinKhoDAO;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ThongTinKho;

/**
 *
 * @author hoang
 */
public class QLThongTinKho extends javax.swing.JFrame {
      boolean test;
      int index = 0;
      ThongTinKhoDAO dao = new ThongTinKhoDAO();

    /**
     * Creates new form QLThongTinKho
     */
    public QLThongTinKho() {
        initComponents();
        setLocationRelativeTo(null);
        this.test = false;
        this.load();
        this.setStatus(true);
    }
    

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
        model.setRowCount(0);
        try {
            List<ThongTinKho> list = dao.select();
            for (ThongTinKho kh : list) {
                Object[] row = {
                    kh.getMaKho(),
                    kh.getTenKho(),
                    kh.getDiaChiKho()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            this.test = false;
            e.printStackTrace();
//            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
              
        }
    }

    public boolean isvalid() {
        String ma = txtMaKho.getText();
        ThongTinKho model = dao.findById(ma);
        if (txtMaKho.getText().length() == 0) {
//            DialogHelper.alert(this, "Không để trống mã kho");
            txtMaKho.requestFocus();
            return false;
        } else if (txtMaKho.getText().length() != 3) {
//            DialogHelper.alert(this, "Mã kho phải đúng 3 kí tự!");
            txtMaKho.requestFocus();
            return false;
        } else if (model != null) {
//            DialogHelper.alert(this, "Mã kho không được trùng");
            txtMaKho.requestFocus();
            return false;

        } else if (txtTenKho.getText().length() == 0) {
//            DialogHelper.alert(this, "Khổng để trống tên kho");
            txtTenKho.requestFocus();
            return false;
        } else if (!txtTenKho.getText().matches("[A-Za-z  ]+")) {
//            DialogHelper.alert(this, "Sai định dạng tên kho");
            txtTenKho.requestFocus();
            return false;
        } else if (txtDiaChi.getText().length() == 0) {
//            DialogHelper.alert(this, "Khổng để trống địa chỉ kho");
            txtDiaChi.requestFocus();
            return false;
        }
        return true;
    }

    public boolean isvalid1() {
        String ma = txtMaKho.getText();
        ThongTinKho model = dao.findById(ma);
        if (txtMaKho.getText().length() == 0) {
//            DialogHelper.alert(this, "Không để trống mã!");
            txtMaKho.requestFocus();
            return false;

        } else if (txtTenKho.getText().length() == 0) {
//            DialogHelper.alert(this, "Không để trống tên kho");
            txtTenKho.requestFocus();
            return false;
        } else if (!txtTenKho.getText().matches("[A-Za-z  ]+")) {
//            DialogHelper.alert(this, "Sai định dạng họ tên");
            txtTenKho.requestFocus();
            return false;
        } else if (txtDiaChi.getText().length() == 0) {
//            DialogHelper.alert(this, "Không để trống địa chỉ");
            txtDiaChi.requestFocus();
            return false;
        }
        return true;
    }

    boolean insert() {
        ThongTinKho model = getModel();
        try {
            dao.insert(model);
            this.load();
            this.clear();
            this.test = true;
//            DialogHelper.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            e.printStackTrace();
//            DialogHelper.alert(this, "Thêm mới thất bại!");
               this.test = false;
        }
    return true;
    }

    void update() {
        ThongTinKho model = getModel();
        try {
            dao.update(model);
            this.load();
//            DialogHelper.alert(this, "Cập nhật thành công!");
            this.test = true;
        } catch (Exception e) {
            e.printStackTrace();
            this.test = false;
//            DialogHelper.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
//        if (DialogHelper.confirm(this, "Bạn có muốn xóa hay không?")) {
            String macd = txtMaKho.getText();
            try {
                dao.delete(macd);
                this.load();
                this.clear();
                this.test = true;
//                DialogHelper.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                this.test = false;
//                DialogHelper.alert(this, "Xóa thất bại!");
            }
//        }
    }

    void clear() {
        txtMaKho.setText("");
        txtTenKho.setText("");
        txtDiaChi.setText("");
        tblBang.clearSelection();
        this.setModel(new ThongTinKho());
        this.setStatus(true);
        btnInsert.setEnabled(true);
    }

    void edit() {
        try {
            String macd = (String) tblBang.getValueAt(this.index, 0);
            ThongTinKho model = dao.findById(macd);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            this.test = false;
//            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void setModel(ThongTinKho model) {
        txtMaKho.setText(model.getMaKho());
        txtTenKho.setText(model.getTenKho());
        txtDiaChi.setText(model.getDiaChiKho());

    }

    ThongTinKho getModel() {
        ThongTinKho model = new ThongTinKho();
        model.setMaKho(txtMaKho.getText());
        model.setTenKho(txtTenKho.getText());
        model.setDiaChiKho(txtDiaChi.getText());
        return model;
    }

    void setStatus(boolean insertable) {
        txtMaKho.setEditable(insertable);
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        btnDelete.setEnabled(!insertable);

        boolean first = this.index > 0;
        boolean last = this.index < tblBang.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnNext.setEnabled(!insertable && last);
        btnLast.setEnabled(!insertable && last);
    }
    public JButton getBtnClear() {

        return btnClear;
    }

    public void setBtnClear(JButton btnClear) {
        this.btnClear = btnClear;
    }

    public JButton getBtnSua() {
        return btnUpdate;
    }

    public void setBtnSua(JButton btnSua) {
        this.btnUpdate = btnSua;
    }

    public JButton getBtnThem() {
        return btnInsert;
    }

    public void setBtnThem(JButton btnThem) {
        this.btnInsert = btnThem;
    }

    public JButton getBtnXoa() {
        return btnDelete;
    }

    public void setBtnXoa(JButton btnXoa) {
        this.btnDelete = btnXoa;
    }

    public JTable getTblBang() {
        return tblBang;
    }

    public void setTblBang(JTable tblBang) {
        this.tblBang = tblBang;
    }

   
    
    

    public void setTxtMaKho(String mk) {
        this.txtMaKho.setText(mk);
    }

    public void setTxtTenKho(String tk) {
        this.txtTenKho.setText(tk);
    }

    public void setTxtDiaChi(String dc) {
        this.txtDiaChi.setText(dc);
    }

    public String getTxtMaKho() {
        return txtMaKho.getText();
    }

    public String getTxtTenKho() {
        return txtTenKho.getText();
    }

    public String getTxtDiaChi() {
        return txtDiaChi.getText();
    }

    public JTable getTblQLKho() {
        return tblBang;
    }

    public void setTblQLXe(JTable tblQLKho) {
        this.tblBang = tblQLKho;
    }
    
    

    public void clickMoi(){
        this.tblBangMouseClicked(null);
        this.btnClearActionPerformed(null);
    }
    
    public void clickThem(){
        this.btnInsertActionPerformed(null);
    }
     public void clickSua() {

        this.btnUpdateActionPerformed(null);

    }
    public void clickXoa(){
        this.tblBangMouseClicked(null);
        this.btnDeleteActionPerformed(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenKho = new javax.swing.JTextField();
        txtMaKho = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Thông Tin Kho");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Mã kho:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Tên kho:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        txtTenKho.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMaKho.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMaKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKhoActionPerformed(evt);
            }
        });

        txtDiaChi.setColumns(20);
        txtDiaChi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        btnInsert.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addComponent(txtTenKho)
                            .addComponent(txtMaKho)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab.addTab("Thông tin", jPanel1);

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã kho", "Tên kho", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        tab.addTab("Chi tiết", jPanel2);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (isvalid()) {
            insert();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (isvalid1()) {
            update();
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.index = 0;
        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.index--;
        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.index = tblBang.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tblBang.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
                tab.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tblBangMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (DialogHelper.confirm(this, "Bạn có muốn thoát không?")) {
            this.setVisible(false);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMaKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKhoActionPerformed

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
            java.util.logging.Logger.getLogger(QLThongTinKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLThongTinKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLThongTinKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLThongTinKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLThongTinKho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtMaKho;
    private javax.swing.JTextField txtTenKho;
    // End of variables declaration//GEN-END:variables
}
