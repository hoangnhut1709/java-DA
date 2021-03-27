package Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Helper.DialogHelper;
import Helper.ShareHelper;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }
    void init() { 
        setSize(1000, 600); 
        setIconImage(ShareHelper.APP_ICON); 
        setLocationRelativeTo(null); 
         
        new Timer(1000, new ActionListener() { 
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a"); 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                lblThoigian.setText(format.format(new Date())); 
            } 
        }).start(); 
        this.openWelcome(); 
//        this.openLogin(); 
    } 
    void openLogin(){ 
        if(ShareHelper.authenticated()){ 
            DialogHelper.alert(this, "Bạn đã đăng nhập tài khoản!"); 
        } 
        else{ 
            
             new DangNhapJDialog(this, true).setVisible(true); 
        } 
        
    } 
    void openWelcome(){ 
        new ChaoJDialog(this, true).setVisible(true); 
    } 
    void logoff(){ 
        ShareHelper.logoff(); 
        this.openLogin(); 
    } 
    void exit(){ 
         if(DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")){ 
            System.exit(0); 
        } 
    } 
    void openLoainhaCC(){ 
        if(ShareHelper.authenticated()){ 
            new LoainhaCC().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openQLNguoiDung(){ 
        if(ShareHelper.authenticated()){ 
            new QLNguoiDung().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openSanPham(){ 
        if(ShareHelper.authenticated()){ 
            new QLSanPham().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openThongTinKho(){ 
        if(ShareHelper.authenticated()){ 
            new QLThongTinKho().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openNhaCC(){ 
        if(ShareHelper.authenticated()){ 
             new NhaCC().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    } 
    void openPhieuNhap(){ 
        if(ShareHelper.authenticated()){ 
             new Phieunhap().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    }
    void openPhieuXuat(){ 
        if(ShareHelper.authenticated()){ 
             new QLPhieuxuat().setVisible(true); 
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    }
     void openThongKe(int tabIndex){ 
        if(ShareHelper.authenticated()){ 
               new ThongKe(tabIndex).setVisible(true);
        } 
        else{ 
            DialogHelper.alert(this, "Vui lòng đăng nhập!"); 
        } 
    }
    void openAbout(){ 
        new Gioithieu(this, true).setVisible(true); 
    } 
    void openWebsite(){ 
        try { 
            Desktop.getDesktop().browse(new File("C:\\wamp64\\www\\banhang\\public_html\\LaptopStore.index").toURI()); 
        }  
        catch (IOException ex) { 
            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!"); 
         
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnDXuat = new javax.swing.JButton();
        btnKetthuc = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        lblanhnen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblThoigian = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnDoiMatKhau = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnQuanLi = new javax.swing.JMenu();
        mnNguoidung = new javax.swing.JMenuItem();
        mnThongTinKho = new javax.swing.JMenuItem();
        mnQLSanPham = new javax.swing.JMenuItem();
        mnQLLoaiSanPham = new javax.swing.JMenuItem();
        mnQLNhaCC = new javax.swing.JMenuItem();
        mnQLLoaiNhaCC = new javax.swing.JMenuItem();
        mnQLPhieuNhap = new javax.swing.JMenuItem();
        mnQLphieuxuat = new javax.swing.JMenuItem();
        mnThongKe = new javax.swing.JMenu();
        mnNguoiHocTungNam = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnDoanhthu = new javax.swing.JMenuItem();
        mnTroGiup = new javax.swing.JMenu();
        mnHuongdan = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Key.png"))); // NOI18N
        jButton1.setText("Đăng nhập");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        jButton2.setText("Người dùng");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lego brick.png"))); // NOI18N
        jButton3.setText("Sản phẩm");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        jButton4.setText("Thông tin kho");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        btnDXuat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnDXuat.setText("Đăng xuất");
        btnDXuat.setFocusable(false);
        btnDXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDXuat);

        btnKetthuc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnKetthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        btnKetthuc.setText("Kết thúc");
        btnKetthuc.setFocusable(false);
        btnKetthuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetthuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetthucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetthuc);
        jToolBar1.add(jSeparator7);

        lblanhnen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblanhnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phương-pháp-quản-lý-kho-1024x512.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblThoigian.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblThoigian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm.png"))); // NOI18N
        lblThoigian.setText("02:30:54 PM");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Info.png"))); // NOI18N
        jLabel2.setText("Hệ Quản Lý Đào Tạo");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblThoigian)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThoigian)
                    .addComponent(jLabel2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jMenuBar1.setToolTipText("");

        mnHeThong.setText("Hệ thống  ");
        mnHeThong.setToolTipText("");
        mnHeThong.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Key.png"))); // NOI18N
        jMenuItem1.setText("Đăng nhập");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnHeThong.add(jMenuItem1);
        mnHeThong.add(jSeparator2);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        jMenuItem2.setText("Đăng xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnHeThong.add(jMenuItem2);

        mnDoiMatKhau.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        mnDoiMatKhau.setText("Đổi mật khẩu");
        mnHeThong.add(mnDoiMatKhau);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        jMenuItem3.setText("Kết thúc");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnHeThong.add(jMenuItem3);

        jMenuBar1.add(mnHeThong);

        mnQuanLi.setText("Quản lý");

        mnNguoidung.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnNguoidung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User group.png"))); // NOI18N
        mnNguoidung.setText("Người dùng");
        mnNguoidung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNguoidungActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnNguoidung);

        mnThongTinKho.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnThongTinKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lists.png"))); // NOI18N
        mnThongTinKho.setText("Thông tin khô");
        mnThongTinKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThongTinKhoActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnThongTinKho);

        mnQLSanPham.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnQLSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lego brick.png"))); // NOI18N
        mnQLSanPham.setText("Sản Phẩm");
        mnQLSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLSanPhamActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLSanPham);

        mnQLLoaiSanPham.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnQLLoaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Genealogy.png"))); // NOI18N
        mnQLLoaiSanPham.setText("Loại sản phẩm ");
        mnQLLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLLoaiSanPhamActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLLoaiSanPham);

        mnQLNhaCC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnQLNhaCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        mnQLNhaCC.setText("Nhà cung cấp");
        mnQLNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLNhaCCActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLNhaCC);

        mnQLLoaiNhaCC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnQLLoaiNhaCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Full basket.png"))); // NOI18N
        mnQLLoaiNhaCC.setText("Loại cung cấp");
        mnQLLoaiNhaCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLLoaiNhaCCActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLLoaiNhaCC);

        mnQLPhieuNhap.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnQLPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Notes.png"))); // NOI18N
        mnQLPhieuNhap.setText("Phiếu nhập");
        mnQLPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLPhieuNhapActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLPhieuNhap);

        mnQLphieuxuat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnQLphieuxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Properties.png"))); // NOI18N
        mnQLphieuxuat.setText("Phiếu xuất");
        mnQLphieuxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnQLphieuxuatActionPerformed(evt);
            }
        });
        mnQuanLi.add(mnQLphieuxuat);

        jMenuBar1.add(mnQuanLi);

        mnThongKe.setText("Thống kê");

        mnNguoiHocTungNam.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnNguoiHocTungNam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clien list.png"))); // NOI18N
        mnNguoiHocTungNam.setText("Nhập Kho");
        mnNguoiHocTungNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNguoiHocTungNamActionPerformed(evt);
            }
        });
        mnThongKe.add(mnNguoiHocTungNam);
        mnThongKe.add(jSeparator3);

        mnDoanhthu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnDoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Dollar.png"))); // NOI18N
        mnDoanhthu.setText("Vốn nhập");
        mnDoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDoanhthuActionPerformed(evt);
            }
        });
        mnThongKe.add(mnDoanhthu);

        jMenuBar1.add(mnThongKe);

        mnTroGiup.setText("Trợ giúp");

        mnHuongdan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnHuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        mnHuongdan.setText("Hướng dẫn sử dụng");
        mnHuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHuongdanActionPerformed(evt);
            }
        });
        mnTroGiup.add(mnHuongdan);
        mnTroGiup.add(jSeparator5);

        mnGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N
        mnGioiThieu.setText("Giới thiệu kho hàng");
        mnGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGioiThieuActionPerformed(evt);
            }
        });
        mnTroGiup.add(mnGioiThieu);

        jMenuBar1.add(mnTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
            .addComponent(lblanhnen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblanhnen, javax.swing.GroupLayout.PREFERRED_SIZE, 444, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnThongTinKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnThongTinKhoActionPerformed
        // TODO add your handling code here:
        openThongTinKho();
        
    }//GEN-LAST:event_mnThongTinKhoActionPerformed

    private void mnQLLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnQLLoaiSanPhamActionPerformed

    private void mnNguoidungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNguoidungActionPerformed
        // TODO add your handling code here:
        openQLNguoiDung();
    }//GEN-LAST:event_mnNguoidungActionPerformed

    private void mnQLSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLSanPhamActionPerformed
        // TODO add your handling code here:
        openSanPham();
        
    }//GEN-LAST:event_mnQLSanPhamActionPerformed

    private void mnNguoiHocTungNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNguoiHocTungNamActionPerformed
        openThongKe(0);
                // TODO add your handling code here:
     
    }//GEN-LAST:event_mnNguoiHocTungNamActionPerformed

    private void mnDoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDoanhthuActionPerformed
        // TODO add your handling code here:
        openThongKe(1);
        
    }//GEN-LAST:event_mnDoanhthuActionPerformed

    private void mnHuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHuongdanActionPerformed
        // TODO add your handling code here:
        openWebsite();
    }//GEN-LAST:event_mnHuongdanActionPerformed

    private void mnGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGioiThieuActionPerformed
        // TODO add your handling code here:
        openAbout();
    }//GEN-LAST:event_mnGioiThieuActionPerformed

    private void btnDXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDXuatActionPerformed
        // TODO add your handling code here:
        MainJFrame.this.dispose();
        JOptionPane.showMessageDialog(this, "You have disconnect account, plz login to use this VinNew");
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnDXuatActionPerformed

    private void btnKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetthucActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnKetthucActionPerformed

    private void mnQLNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLNhaCCActionPerformed
        // TODO add your handling code here:
        openNhaCC();
    }//GEN-LAST:event_mnQLNhaCCActionPerformed

    private void mnQLLoaiNhaCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLLoaiNhaCCActionPerformed
        // TODO add your handling code here:
        openLoainhaCC();
    }//GEN-LAST:event_mnQLLoaiNhaCCActionPerformed

    private void mnQLphieuxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLphieuxuatActionPerformed
        // TODO add your handling code here:
        openPhieuXuat();
    }//GEN-LAST:event_mnQLphieuxuatActionPerformed

    private void mnQLPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnQLPhieuNhapActionPerformed
        // TODO add your handling code here:
        openPhieuNhap();
    }//GEN-LAST:event_mnQLPhieuNhapActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        openLogin();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MainJFrame.this.dispose();
        JOptionPane.showMessageDialog(this, "You have disconnect account, plz login to use this VinNew");
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        openQLNguoiDung();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         openSanPham();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        openThongTinKho();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Gioithieu dn = new Gioithieu(this,true);
        dn.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        openLogin();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDXuat;
    private javax.swing.JButton btnKetthuc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblThoigian;
    private javax.swing.JLabel lblanhnen;
    private javax.swing.JMenuItem mnDoanhthu;
    private javax.swing.JMenuItem mnDoiMatKhau;
    private javax.swing.JMenuItem mnGioiThieu;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenuItem mnHuongdan;
    private javax.swing.JMenuItem mnNguoiHocTungNam;
    private javax.swing.JMenuItem mnNguoidung;
    private javax.swing.JMenuItem mnQLLoaiNhaCC;
    private javax.swing.JMenuItem mnQLLoaiSanPham;
    private javax.swing.JMenuItem mnQLNhaCC;
    private javax.swing.JMenuItem mnQLPhieuNhap;
    private javax.swing.JMenuItem mnQLSanPham;
    private javax.swing.JMenuItem mnQLphieuxuat;
    private javax.swing.JMenu mnQuanLi;
    private javax.swing.JMenu mnThongKe;
    private javax.swing.JMenuItem mnThongTinKho;
    private javax.swing.JMenu mnTroGiup;
    // End of variables declaration//GEN-END:variables
}
