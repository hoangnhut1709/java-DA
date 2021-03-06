/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Helper.DateHelper;
import Helper.DialogHelper;
import dao.NguoiDungDAO;
import dao.PhieuXuatDAO;
import dao.SanPhamDAO;
import dao.ThongTinKhoDAO;
import java.awt.HeadlessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.NguoiDung;
import model.PhieuXuat;
import model.SanPham;
import model.ThongTinKho;

/**
 *
 * @author ASUS
 */
public class QLPhieuxuat extends javax.swing.JFrame {

    
    boolean test;
    /**
     * Creates new form Phieuxuat
     */
    public QLPhieuxuat() {
        initComponents();
        setLocationRelativeTo(null);
//        setTitle("PHIẾU XUÂT - QLKHO");

// bổ sung cho test
        this.load();
        
        
        this.fillComboBox();
        this.fillComboBox2();
        this.fillComboBox3();
        PhieuXuat model = new PhieuXuat();
        txtNgayXuat.setText(DateHelper.toString(model.getNgayXuat()));
        ////////////////////////////////
        //khong cho sua du lieu cua bang
        tblXuat.setDefaultEditor(Object.class, null);
        //khong cho thay doi vi tri cac cot
        tblXuat.getTableHeader().setReorderingAllowed(false);
        //sap xep cac cot trong bang
        tblXuat.setAutoCreateRowSorter(true);
        
        
        this.test = false;
    }



    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }

    public JButton getBtnFirst() {
        return btnFirst;
    }

    public void setBtnFirst(JButton btnFirst) {
        this.btnFirst = btnFirst;
    }

    public JButton getBtnInsert() {
        return btnInsert;
    }

    public void setBtnInsert(JButton btnInsert) {
        this.btnInsert = btnInsert;
    }

    public JButton getBtnLast() {
        return btnLast;
    }

    public void setBtnLast(JButton btnLast) {
        this.btnLast = btnLast;
    }

    public JButton getBtnNew() {
        return btnNew;
    }

    public void setBtnNew(JButton btnNew) {
        this.btnNew = btnNew;
    }

    public JButton getBtnNext() {
        return btnNext;
    }

 
    
    
    
    
    
    
    public void setBtnNext(JButton btnNext) {
        this.btnNext = btnNext;
    }

    public JButton getBtnPrev() {
        return btnPrev;
    }

    public void setBtnPrev(JButton btnPrev) {
        this.btnPrev = btnPrev;
    }

    public JButton getBtnTimKiem() {
        return btnTimKiem;
    }

    public void setBtnTimKiem(JButton btnTimKiem) {
        this.btnTimKiem = btnTimKiem;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    public JComboBox<String> getCboKho() {
        return cboKho;
    }

    public void setCboKho(JComboBox<String> cboKho) {
        this.cboKho = cboKho;
    }

    public JComboBox<String> getCboMaSP() {
        return cboMaSP;
    }

    public void setCboMaSP(JComboBox<String> cboMaSP) {
        this.cboMaSP = cboMaSP;
    }

    public JComboBox<String> getCboND() {
        return cboND;
    }

    public void setCboND(JComboBox<String> cboND) {
        this.cboND = cboND;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLblPX() {
        return lblPX;
    }

    public void setLblPX(JLabel lblPX) {
        this.lblPX = lblPX;
    }

    public JTabbedPane getTabs() {
        return tabs;
    }

    public void setTabs(JTabbedPane tabs) {
        this.tabs = tabs;
    }

    public JTable getTblXuat() {
        return tblXuat;
    }

    public void setTblXuat(JTable tblXuat) {
        this.tblXuat = tblXuat;
    }

    public JTextField getTxtDiaChiXuat() {
        return txtDiaChiXuat;
    }

    public void setTxtDiaChiXuat(String txtDiaChiXuat) {
        this.txtDiaChiXuat.setText(txtDiaChiXuat);
    }

    public JTextField getTxtGia() {
        return txtGia;
    }

    public void setTxtGia(double txtGia) {
        this.txtGia.setText(String.valueOf(txtGia));
    }

    public JTextField getTxtMaXuat() {
        return txtMaXuat;
    }

    public void setTxtMaXuat(String txtMaXuat) {
        this.txtMaXuat.setText(txtMaXuat);
    }

    public JTextField getTxtNgayXuat() {
        return txtNgayXuat;
    }

    public void setTxtNgayXuat(String txtNgayXuat) {
        this.txtNgayXuat.setText(txtNgayXuat);
    }

    public JTextField getTxtSoLuong() {
        return txtSoLuong;
    }

    public void setTxtSoLuong(int txtSoLuong) {
        this.txtSoLuong.setText(String.valueOf(txtSoLuong));
    }

    public JTextField getTxtTimKiem() {
        return txtTimKiem;
    }

    public void setTxtTimKiem(JTextField txtTimKiem) {
        this.txtTimKiem = txtTimKiem;
    }
    
    
    public void Clickthem(){
        this.btnInsertActionPerformed(null);
    }
    public void Clickmoi(){
        this.tblXuatMouseClicked(null);
        this.btnNewActionPerformed(null);
    }
    public void Clickxoa(){
        this.tblXuatMouseClicked(null);
        this.btnDeleteActionPerformed(null);
    }
    
    public void Click1(){
        QLPhieuxuat chon = new QLPhieuxuat();
    String ma = chon.getTblXuat().getModel().getValueAt(2, 0).toString();
    String gia = chon.getTblXuat().getModel().getValueAt(2, 3).toString();
    String sl = chon.getTblXuat().getModel().getValueAt(2, 4).toString();
    String dc = chon.getTblXuat().getModel().getValueAt(2, 5).toString();
    this.txtMaXuat.setText(ma);
    this.txtGia.setText(gia);
    this.txtSoLuong.setText(sl);
    this.txtDiaChiXuat.setText(dc);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        this.btnFirstActionPerformed(null);
    }
    
    public void Click2() {
        QLPhieuxuat chon = new QLPhieuxuat();
    String ma = chon.getTblXuat().getModel().getValueAt(2, 0).toString();
    String gia = chon.getTblXuat().getModel().getValueAt(2, 3).toString();
    String sl = chon.getTblXuat().getModel().getValueAt(2, 4).toString();
    String dc = chon.getTblXuat().getModel().getValueAt(2, 5).toString();
    this.txtMaXuat.setText(ma);
    this.txtGia.setText(gia);
    this.txtSoLuong.setText(sl);
    this.txtDiaChiXuat.setText(dc);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        this.btnPrevActionPerformed(null);
    }
    public void Click3(){
        this.tblXuatMouseClicked(null);
        this.btnNextActionPerformed(null);
    }
     public void Click4(){
        this.tblXuatMouseClicked(null);
        this.btnLastActionPerformed(null);
    }
     
    
    

   
    
    int index = 0;
    PhieuXuatDAO dao = new PhieuXuatDAO();
    SanPhamDAO spdao = new SanPhamDAO();
    ThongTinKhoDAO khodao = new ThongTinKhoDAO();
    NguoiDungDAO nddao = new NguoiDungDAO();
    
    void load() {
        DefaultTableModel model = (DefaultTableModel) tblXuat.getModel();
        model.setRowCount(0);
        try {
            List<PhieuXuat> list = dao.select();
                for (PhieuXuat nh : list) {
                Object[] row = {
                    nh.getMaXuat(),
                    nh.getMaSP(),
                    nh.getMaKho(),
                    nh.getGia(),
                    nh.getSoLuong(),
                    nh.getDiaChiXuat(),
                   DateHelper.toString(nh.getNgayXuat()),
                    nh.getMaND(),
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
        
        
    }   
    void find(){
        DefaultTableModel model = (DefaultTableModel) tblXuat.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<PhieuXuat> list = dao.selectByKeyword(keyword);
            for (PhieuXuat nh : list) {
                Object[] row = {
                   nh.getMaXuat(),
                    nh.getMaSP(),
                    nh.getMaKho(),
                    nh.getGia(),
                    nh.getSoLuong(),
                    nh.getDiaChiXuat(),
                   DateHelper.toString(nh.getNgayXuat()),
                    nh.getMaND(),
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void edit() {
        try {
            String MaXuat = (String) tblXuat.getValueAt(this.index, 0);
            PhieuXuat model = dao.findById(MaXuat);
            if (model != null) {
                this.setModel(model);
                
                this.setStatus(false);
            }
        } catch (Exception e) {
            //DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    
    
      PhieuXuat getModel() {
        PhieuXuat model = new PhieuXuat();
        model.setMaXuat(txtMaXuat.getText());
//        model.setMaSP((String) cboChuyenDe.getSelectedItem());
        SanPham sp = (SanPham) cboMaSP.getSelectedItem();
        model.setMaSP(sp.getMaSP());
        
//        model.setMaKho((String) cboKho.getSelectedItem());
        ThongTinKho kho = (ThongTinKho) cboKho.getSelectedItem();
        model.setMaKho(kho.getMaKho());
        
        model.setGia(Double.valueOf(txtGia.getText()));
        model.setSoLuong(Integer.valueOf(txtSoLuong.getText()));
        model.setDiaChiXuat(txtDiaChiXuat.getText());
        model.setNgayXuat(DateHelper.toDate(txtNgayXuat.getText()));
        
//        model.setMaND((String) cboND.getSelectedItem());
        NguoiDung nd = (NguoiDung) cboND.getSelectedItem();
        model.setMaND(nd.getMaND());
        model.setNgayXuat(DateHelper.now());
        return model;
    }
    void setModel(PhieuXuat model) {
        txtMaXuat.setText(model.getMaXuat());
//        cboChuyenDe.setSelectedItem(model.getMaSP());
        cboMaSP.setSelectedItem(spdao.findById(model.getMaSP()));
        cboMaSP.setToolTipText(String.valueOf(model.getMaXuat()));
        
        
//        cboKho.setSelectedItem(model.getMaKho());
cboKho.setSelectedItem(khodao.findById(model.getMaKho()));
        cboKho.setToolTipText(String.valueOf(model.getMaXuat()));
        
        txtGia.setText(String.valueOf(model.getGia()));
        txtSoLuong.setText(String.valueOf(model.getSoLuong()));
        txtDiaChiXuat.setText(model.getDiaChiXuat());
        txtNgayXuat.setText(DateHelper.toString(model.getNgayXuat()));
        
//        cboND.setSelectedItem(model.getMaND());  
cboND.setSelectedItem(nddao.findById(model.getMaND()));
        cboND.setToolTipText(String.valueOf(model.getMaXuat()));
    }
    
    
    boolean insert() {
        PhieuXuat model = getModel();
        try {
            dao.insert(model);
            this.load();
            this.clear();
            test = true;
//            DialogHelper.alert(this, "Thêm mới thành công!");
return true;
        } catch (Exception e) {
            test = false;
//            DialogHelper.alert(this, "Thêm mới thất bại!"+e);
//e.printStackTrace();
return false;
        }
    }
    void update() {
        PhieuXuat model = getModel();
        try {
            dao.update(model);
            this.load();
            
            DialogHelper.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            DialogHelper.alert(this, "Cập nhật thất bại!");
        }
    }
    void delete() {
//        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa người học này?")) {
            String manh = txtMaXuat.getText();
            try {
                dao.delete(manh);
                this.load();
                this.clear();
//                DialogHelper.alert(this, "Xóa thành công!");
                  test = true;
            } catch (HeadlessException e) {
//                DialogHelper.alert(this, "Xóa thất bại!");
                  test = false;
            }
//        }
    }
    void clear() {
        PhieuXuat model = new PhieuXuat();
        model.setNgayXuat(DateHelper.now());
        this.setModel(model);
        this.setModel(new PhieuXuat());
        this.setStatus(true);
        this.fillComboBox();
        this.fillComboBox2();
        this.fillComboBox3();

    }
    void setStatus(boolean insertable) {
        txtMaXuat.setEditable(insertable);
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        btnDelete.setEnabled(!insertable);

        boolean first = this.index > 0;
        boolean last = this.index < tblXuat.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnNext.setEnabled(!insertable && last);
        btnLast.setEnabled(!insertable && last);
    }
    void fillComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaSP.getModel();
        model.removeAllElements();
        try {
            List<SanPham> list = spdao.select();
            for (SanPham cd : list) {
                model.addElement(cd);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void fillComboBox2() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKho.getModel();
        model.removeAllElements();
        try {
            List<ThongTinKho> list = khodao.select();
            for (ThongTinKho cd : list) {
                model.addElement(cd);
//                model.addElement(cd.getMaKho());
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void fillComboBox3() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboND.getModel();
        model.removeAllElements();
        try {
            List<NguoiDung> list = nddao.select();
            for (NguoiDung cd : list) {
                 model.addElement(cd);
//                model.addElement(cd.getMaND());
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!"+e);
        }
    }
    
    public boolean isvalid() {
        String ma = txtMaXuat.getText();
        
        PhieuXuat model =dao.findById(ma);
        if(txtMaXuat.getText().length() == 0){
            test =false;
//            DialogHelper.alert(this, "Không để trống mã nhập");
            txtMaXuat.requestFocus();
            return false;
        }else if(txtMaXuat.getText().length() < 3) {
//            DialogHelper.alert(this, "Mã xuất từ 3 ký tự trở lên");
test =false;            
txtMaXuat.requestFocus();
            return false;
        }else if(model != null){
            test = false;
//           DialogHelper.alert(this, "Mã xuất đã tồn tại !");
           txtMaXuat.requestFocus();
           return false;
   }else if (cboMaSP.getSelectedObjects().length == 0) {
test =false;            
//DialogHelper.alert(this, "Chưa chọn mã sản phẩm");          
            return false;
        }else if (cboKho.getSelectedObjects().length == 0) {
//            DialogHelper.alert(this,"Chưa chọn mã kho");
test =false;
            return false;
        }else if (txtGia.getText().length() == 0) {
//            DialogHelper.alert(this, "Gía chưa được nhập");
test =false;
            txtGia.requestFocus();
            return false;
        }else if (!txtGia.getText().matches("[0-9.]+")) {
//            DialogHelper.alert(this, "Giá thuộc kiểu số.");
test =false;
            txtGia.requestFocus();
            return false;
        }else if (txtSoLuong.getText().length() == 0) {
//            DialogHelper.alert(this, "Số lượng chưa được nhập");
test =false;
            txtSoLuong.requestFocus();
            return false;
        }else if (!txtSoLuong.getText().matches("[0-9]+")) {
//            DialogHelper.alert(this, "Số lượng thuộc kiểu số nguyên.");
test =false;
            txtSoLuong.requestFocus();
            return false;
        }if(txtDiaChiXuat.getText().length() == 0){
//            DialogHelper.alert(this, "Chưa nhập địa chỉ xuất");
test =false;
            txtDiaChiXuat.requestFocus();
            return false;
//        }else if (!(txtDiaChiXuat.getText().matches("[a-zA-Z  ]+"))||!(txtDiaChiXuat.getText().matches("[0-9. ]+"))) {
//            DialogHelper.alert(this, "Địa chỉ xuất chỉ chứa alphabet và ký tự trắng");
//            txtDiaChiXuat.requestFocus();
//            return false;
        }else if (cboND.getSelectedObjects().length == 0) {
            DialogHelper.alert(this,"Chưa chọn mã người dùng");
            return false;
        } 
//        else if (!txtNgayXuat.getText().matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}")) {
//            DialogHelper.alert(this, "Sai định dạng ngày");
//            txtNgayXuat.requestFocus();
//            return false;
//        }
        
        return true;
    }
    public boolean check() {
        if (cboMaSP.getSelectedObjects().length == 0) {
            DialogHelper.alert(this, "Chưa chọn mã sản phẩm");          
            return false;
        }else if (cboKho.getSelectedObjects().length == 0) {
            DialogHelper.alert(this,"Chưa chọn mã kho");
            return false;
        }else if (txtGia.getText().length() == 0) {
            DialogHelper.alert(this, "Gía chưa được nhập");
            txtGia.requestFocus();
            return false;
        }else if (!txtGia.getText().matches("[0-9.]+")) {
            DialogHelper.alert(this, "Giá thuộc kiểu số.");
            txtGia.requestFocus();
            return false;
        }else if (txtSoLuong.getText().length() == 0) {
            DialogHelper.alert(this, "Số lượng chưa được nhập");
            txtSoLuong.requestFocus();
            return false;
        }else if (!txtSoLuong.getText().matches("[1-9]+")) {
            DialogHelper.alert(this, "Số lượng thuộc kiểu số.");
            txtSoLuong.requestFocus();
            return false;
        }if(txtDiaChiXuat.getText().length() == 0){
            DialogHelper.alert(this, "Chưa nhập địa chỉ xuất");
            txtDiaChiXuat.requestFocus();
            return false;
        }else if (!(txtDiaChiXuat.getText().matches("[a-zA-Z  ]+"))) {
            DialogHelper.alert(this, "Địa chỉ xuất chỉ chứa alphabet và ký tự trắng");
            txtDiaChiXuat.requestFocus();
            return false;
        }else if (cboND.getSelectedObjects().length == 0) {
            DialogHelper.alert(this,"Chưa chọn mã người dùng");
            return false;
        } 
        return true;
    }

    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPX = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtMaXuat = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtDiaChiXuat = new javax.swing.JTextField();
        txtNgayXuat = new javax.swing.JTextField();
        cboMaSP = new javax.swing.JComboBox<>();
        cboKho = new javax.swing.JComboBox<>();
        cboND = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblXuat = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblPX.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPX.setForeground(new java.awt.Color(204, 0, 0));
        lblPX.setText("PHIẾU XUẤT");

        tabs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Mã xuất :");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Tên sản phẩm :");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Tên kho :");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Giá :");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Số lượng :");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Địa chỉ xuất :");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Ngày xuất :");

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNew.setText("Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnPrev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8-skip-to-start-40.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8-skip-to-start-40 (1).png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/end_1.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/icons8-end-40(1).png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Mã người xuất:");

        txtMaXuat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtGia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtDiaChiXuat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDiaChiXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiXuatActionPerformed(evt);
            }
        });

        txtNgayXuat.setEditable(false);
        txtNgayXuat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cboMaSP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboMaSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn mã sản phẩm" }));
        cboMaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaSPActionPerformed(evt);
            }
        });

        cboKho.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboKho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn mã kho" }));

        cboND.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboND.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn mã người dùng" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cboND, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboMaSP, 0, 1, Short.MAX_VALUE)
                                    .addComponent(cboKho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMaXuat)
                                    .addComponent(txtDiaChiXuat)
                                    .addComponent(txtNgayXuat)
                                    .addComponent(txtSoLuong)
                                    .addComponent(txtGia))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(btnInsert))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChiXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNgayXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(cboND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPrev)
                                    .addComponent(btnFirst)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext))))
                    .addComponent(btnLast))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tabs.addTab("Cập nhật", jPanel1);

        tblXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã xuất", "Mã sản phẩm", "Mã kho", "Giá", "Số lượng", "Địa chỉ xuất", "Ngày xuất", "Mã người xuất"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblXuatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblXuat);

        btnTimKiem.setText("Tìm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiem))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Danh sách", jPanel2);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(lblPX)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPX)
                .addGap(18, 18, 18)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.index++;
        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtDiaChiXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiXuatActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try {
         if(this.isvalid()){
        test = this.insert();
         }
        } catch (Exception e) {
//            System.out.println(e);
//test = false;
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DialogHelper.alert(this,"Phiếu xuất không được sửa");
//        try {
//            if(check()){
//        update();}    
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
      this.delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void tblXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblXuatMouseClicked
        // TODO add your handling code here:
//        if (evt.getClickCount() == 2) {
//            this.index = tblXuat.rowAtPoint(evt.getPoint());
//            if (this.index >= 0) {
//                this.edit();
//                tabs.setSelectedIndex(0);
//            }
//        }

    QLPhieuxuat chon = new QLPhieuxuat();
    String ma = chon.getTblXuat().getModel().getValueAt(0, 0).toString();
    String gia = chon.getTblXuat().getModel().getValueAt(0, 3).toString();
    String sl = chon.getTblXuat().getModel().getValueAt(0, 4).toString();
    String dc = chon.getTblXuat().getModel().getValueAt(0, 5).toString();
    this.txtMaXuat.setText(ma);
    this.txtGia.setText(gia);
    this.txtSoLuong.setText(sl);
    this.txtDiaChiXuat.setText(dc);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tblXuatMouseClicked

    private void cboMaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaSPActionPerformed
        // TODO add your handling code here:
//        this.selectComboBox();
    }//GEN-LAST:event_cboMaSPActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
        this.fillComboBox();
        this.fillComboBox2();
        this.fillComboBox3();
    }//GEN-LAST:event_formWindowOpened

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
        this.index = tblXuat.getRowCount() - 1;
        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        this.find();
        this.clear();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        if (DialogHelper.confirm(this, "Bạn có muốn thoát không?")) {
            this.setVisible(false);

        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(QLPhieuxuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLPhieuxuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLPhieuxuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLPhieuxuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new QLPhieuxuat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboKho;
    private javax.swing.JComboBox<String> cboMaSP;
    private javax.swing.JComboBox<String> cboND;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPX;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblXuat;
    private javax.swing.JTextField txtDiaChiXuat;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaXuat;
    private javax.swing.JTextField txtNgayXuat;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    
    
    //test bảng
//    chonbang chon = now chonbang(null,null);
//    String mahd = chon.getChonbang().getModel().getValueAt(0,0).toString();
//    this.txtMaXuat.setText(mahd);
    
    //test hinh
    //vào sự kiện hình sau đó
    //lây code click hình của selecIgm dán vào sự kiện tại chỗ file sẽ là
    // File hinh  = new file("dán đương dẫn vào);
    //sau đó viêt pthuc : public void chonhinh(){}
}
