package View;

import Service.CTSanPhamService;
import ViewModel.QLCTSanPham;
import javax.swing.table.DefaultTableModel;

public class FromCTSanPham extends javax.swing.JPanel {
    
    private CTSanPhamService ctspService;
    
    public FromCTSanPham() {
        initComponents();
        ctspService = new CTSanPhamService();
        loadTable();
    }
    
    private void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_sanPham.getModel();
        dtm.setRowCount(0);
        for (QLCTSanPham sp : ctspService.getList()) {
            Object[] data = {
                sp.getTenSP(),
                sp.getLoai(),
                sp.getRam(),
                sp.getRom(),
                sp.getManhinh(),
                sp.getSoLuong(),
                sp.getGiaBan()
            };
            dtm.addRow(data);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formSp = new javax.swing.JTabbedPane();
        jpn_sp = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txt_seach = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_ma = new javax.swing.JButton();
        btn_ten = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sanPham = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Loại = new javax.swing.JLabel();
        Loại1 = new javax.swing.JLabel();
        Loại2 = new javax.swing.JLabel();
        Loại3 = new javax.swing.JLabel();
        Loại4 = new javax.swing.JLabel();
        Loại5 = new javax.swing.JLabel();
        Loại6 = new javax.swing.JLabel();
        lbl_anh = new javax.swing.JLabel();
        Loại7 = new javax.swing.JLabel();
        cbo_tensp = new javax.swing.JComboBox<>();
        cbo_rom = new javax.swing.JComboBox<>();
        cbo_manhinh = new javax.swing.JComboBox<>();
        cbo_chip = new javax.swing.JComboBox<>();
        cbo_loai = new javax.swing.JComboBox<>();
        cbo_camera = new javax.swing.JComboBox<>();
        cbo_hdh = new javax.swing.JComboBox<>();
        cbo_ram = new javax.swing.JComboBox<>();
        cbo_phanloai = new javax.swing.JComboBox<>();
        cbo_pin = new javax.swing.JComboBox<>();
        cbo_nsx = new javax.swing.JComboBox<>();
        cbo_mausac = new javax.swing.JComboBox<>();
        cbo_imei = new javax.swing.JComboBox<>();
        Loại8 = new javax.swing.JLabel();
        Loại9 = new javax.swing.JLabel();
        txt_giaNhap = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_giaBan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Loại10 = new javax.swing.JLabel();
        txt_soLuong = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        Loại11 = new javax.swing.JLabel();
        btn_themsp = new javax.swing.JButton();
        btn_themsp1 = new javax.swing.JButton();
        btn_themsp2 = new javax.swing.JButton();
        btn_bonho = new javax.swing.JButton();
        btn_MANHINH = new javax.swing.JButton();
        btn_CHIPSE = new javax.swing.JButton();
        btn_CAMERA = new javax.swing.JButton();
        btn_MAUSAC = new javax.swing.JButton();
        btn_DSIMEI = new javax.swing.JButton();
        btn_HDH = new javax.swing.JButton();
        btn_LOAI = new javax.swing.JButton();
        btn_PHANLOAI = new javax.swing.JButton();
        btn_DUNGLUONG = new javax.swing.JButton();
        btn_NSX = new javax.swing.JButton();
        btn_PIN = new javax.swing.JButton();

        jpn_sp.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Seach");

        jLabel1.setText("Sắp Xếp Theo");

        btn_ma.setText("Mã");

        btn_ten.setText("Tên");

        tbl_sanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên SP", "Loại", "Ram", "Rom", "Màn Hình", "Số Lượng", "Giá Bán"
            }
        ));
        jScrollPane1.setViewportView(tbl_sanPham);

        jLabel2.setText("Bộ Nhớ Trong");

        jLabel3.setText("Màn Hình");

        jLabel4.setText("Pin");

        jLabel5.setText("Màu Sắc");

        jLabel6.setText("Chíp");

        Loại.setText("Loại");

        Loại1.setText("Camera");

        Loại2.setText("NSX");

        Loại3.setText("Dung Lượng RAM");

        Loại4.setText("Phân Loại");

        Loại5.setText("Hệ Điều Hành");

        Loại6.setText("Danh sách IMEI");

        Loại7.setText("Tên Sản Phẩm");

        cbo_tensp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbo_rom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "64GB", "128GB", "256GB", "512GB", "1TB" }));

        cbo_manhinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6.7", "6.67", "6.1", "5.8" }));

        cbo_chip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple A16 Bionic 6-core", "Apple A15 Bionic 6-core", "Apple A14 Bionic 6-core", "Apple A13 Bionic 6-core" }));

        cbo_loai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRO", "PRO MAX", "MINI", "PLUS" }));

        cbo_camera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 CAM 12MP", "3 CAM 12MP", "2 CAM 12MP", "3 CAM 48MP" }));

        cbo_hdh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IOS" }));

        cbo_ram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4GB", "6GB", "8GB" }));

        cbo_phanloai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MỚI", "CŨ", "ĐỔI TRẢ" }));

        cbo_pin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5000", "3240", "4352", "3092" }));

        cbo_nsx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIỆT NAM", "MỸ", "CANADA", "HÀN QUỐC", "NHẬT BẢN", "TRUNG QUỐC" }));

        cbo_mausac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MÀU TRẮNG", "MÀU ÐEN", "MÀU TÍM", "MÀU XANH", "MÀU VÀNG" }));

        cbo_imei.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_imei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_imeiActionPerformed(evt);
            }
        });

        Loại8.setText("Giá Nhập");

        Loại9.setText("Giá Bán");

        jLabel7.setText("VNĐ");

        jLabel8.setText("VNĐ");

        Loại10.setText("Số Lượng");

        txt_mota.setColumns(20);
        txt_mota.setRows(5);
        jScrollPane2.setViewportView(txt_mota);

        Loại11.setText("Mô Tả Sản Phẩm");

        btn_themsp.setText("Thêm");
        btn_themsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themspActionPerformed(evt);
            }
        });

        btn_themsp1.setText("Sửa ");

        btn_themsp2.setText("Xóa");

        btn_bonho.setText("-");

        btn_MANHINH.setText("-");

        btn_CHIPSE.setText("-");

        btn_CAMERA.setText("-");

        btn_MAUSAC.setText("-");

        btn_DSIMEI.setText("-");

        btn_HDH.setText("-");

        btn_LOAI.setText("-");

        btn_PHANLOAI.setText("-");

        btn_DUNGLUONG.setText("-");

        btn_NSX.setText("-");

        btn_PIN.setText("-");

        javax.swing.GroupLayout jpn_spLayout = new javax.swing.GroupLayout(jpn_sp);
        jpn_sp.setLayout(jpn_spLayout);
        jpn_spLayout.setHorizontalGroup(
            jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_spLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpn_spLayout.createSequentialGroup()
                        .addComponent(btn_themsp)
                        .addGap(30, 30, 30)
                        .addComponent(btn_themsp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_themsp2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jpn_spLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_spLayout.createSequentialGroup()
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(txt_seach, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_spLayout.createSequentialGroup()
                                .addComponent(btn_ma)
                                .addGap(49, 49, 49)
                                .addComponent(btn_ten)
                                .addGap(303, 303, 303))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_spLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(343, 343, 343))))
                    .addGroup(jpn_spLayout.createSequentialGroup()
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpn_spLayout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(Loại2)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel4))
                            .addGroup(jpn_spLayout.createSequentialGroup()
                                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpn_spLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel3))
                                    .addGroup(jpn_spLayout.createSequentialGroup()
                                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbo_rom, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Loại)
                                            .addComponent(cbo_loai, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_LOAI)
                                            .addComponent(cbo_phanloai, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Loại4))
                                        .addGap(63, 63, 63)
                                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbo_hdh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Loại5)
                                            .addComponent(cbo_manhinh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_MANHINH)
                                            .addComponent(btn_HDH)
                                            .addComponent(btn_DUNGLUONG)
                                            .addComponent(Loại3)
                                            .addComponent(cbo_ram, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btn_bonho)
                                    .addComponent(btn_PHANLOAI))
                                .addGap(46, 46, 46)
                                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(Loại6)
                                    .addComponent(cbo_imei, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_CHIPSE)
                                    .addComponent(btn_NSX)
                                    .addComponent(btn_DSIMEI)
                                    .addComponent(cbo_nsx, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_chip, 0, 1, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(Loại1)
                                        .addComponent(btn_CAMERA)
                                        .addComponent(btn_MAUSAC)
                                        .addComponent(btn_PIN)
                                        .addComponent(cbo_mausac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbo_camera, 0, 110, Short.MAX_VALUE))
                                    .addComponent(cbo_pin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_spLayout.createSequentialGroup()
                                .addComponent(Loại7)
                                .addGap(92, 92, 92))
                            .addGroup(jpn_spLayout.createSequentialGroup()
                                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jpn_spLayout.createSequentialGroup()
                                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Loại8)
                                            .addComponent(Loại9)
                                            .addComponent(Loại10))
                                        .addGap(44, 44, 44)
                                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_giaNhap)
                                            .addComponent(txt_giaBan)
                                            .addComponent(txt_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23))
                                    .addComponent(Loại11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbo_tensp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(5, 5, 5))))))
        );
        jpn_spLayout.setVerticalGroup(
            jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_spLayout.createSequentialGroup()
                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_spLayout.createSequentialGroup()
                        .addComponent(lbl_anh, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Loại7)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_tensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpn_spLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_seach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ma)
                            .addComponent(btn_ten))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_spLayout.createSequentialGroup()
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(Loại1))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_rom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_manhinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_chip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_camera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_bonho)
                            .addComponent(btn_MANHINH)
                            .addComponent(btn_CHIPSE)
                            .addComponent(btn_CAMERA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loại)
                            .addComponent(Loại5)
                            .addComponent(Loại6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_hdh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_imei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_MAUSAC)
                            .addComponent(btn_DSIMEI)
                            .addComponent(btn_HDH)
                            .addComponent(btn_LOAI))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loại2)
                            .addComponent(jLabel4)
                            .addComponent(Loại4)
                            .addComponent(Loại3))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_phanloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_nsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_PHANLOAI)
                            .addComponent(btn_DUNGLUONG)
                            .addComponent(btn_NSX)
                            .addComponent(btn_PIN))
                        .addGap(66, 66, 66))
                    .addGroup(jpn_spLayout.createSequentialGroup()
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loại8)
                            .addComponent(txt_giaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loại9)
                            .addComponent(txt_giaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loại10)
                            .addComponent(txt_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Loại11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jpn_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_themsp)
                            .addComponent(btn_themsp1)
                            .addComponent(btn_themsp2))
                        .addGap(77, 77, 77))))
        );

        formSp.addTab("Sản Phẩm", jpn_sp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formSp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_imeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_imeiActionPerformed

    }//GEN-LAST:event_cbo_imeiActionPerformed

    private void btn_themspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themspActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loại;
    private javax.swing.JLabel Loại1;
    private javax.swing.JLabel Loại10;
    private javax.swing.JLabel Loại11;
    private javax.swing.JLabel Loại2;
    private javax.swing.JLabel Loại3;
    private javax.swing.JLabel Loại4;
    private javax.swing.JLabel Loại5;
    private javax.swing.JLabel Loại6;
    private javax.swing.JLabel Loại7;
    private javax.swing.JLabel Loại8;
    private javax.swing.JLabel Loại9;
    private javax.swing.JButton btn_CAMERA;
    private javax.swing.JButton btn_CHIPSE;
    private javax.swing.JButton btn_DSIMEI;
    private javax.swing.JButton btn_DUNGLUONG;
    private javax.swing.JButton btn_HDH;
    private javax.swing.JButton btn_LOAI;
    private javax.swing.JButton btn_MANHINH;
    private javax.swing.JButton btn_MAUSAC;
    private javax.swing.JButton btn_NSX;
    private javax.swing.JButton btn_PHANLOAI;
    private javax.swing.JButton btn_PIN;
    private javax.swing.JButton btn_bonho;
    private javax.swing.JButton btn_ma;
    private javax.swing.JButton btn_ten;
    private javax.swing.JButton btn_themsp;
    private javax.swing.JButton btn_themsp1;
    private javax.swing.JButton btn_themsp2;
    private javax.swing.JComboBox<String> cbo_camera;
    private javax.swing.JComboBox<String> cbo_chip;
    private javax.swing.JComboBox<String> cbo_hdh;
    private javax.swing.JComboBox<String> cbo_imei;
    private javax.swing.JComboBox<String> cbo_loai;
    private javax.swing.JComboBox<String> cbo_manhinh;
    private javax.swing.JComboBox<String> cbo_mausac;
    private javax.swing.JComboBox<String> cbo_nsx;
    private javax.swing.JComboBox<String> cbo_phanloai;
    private javax.swing.JComboBox<String> cbo_pin;
    private javax.swing.JComboBox<String> cbo_ram;
    private javax.swing.JComboBox<String> cbo_rom;
    private javax.swing.JComboBox<String> cbo_tensp;
    private javax.swing.JTabbedPane formSp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpn_sp;
    private javax.swing.JLabel lbl_anh;
    private javax.swing.JTable tbl_sanPham;
    private javax.swing.JTextField txt_giaBan;
    private javax.swing.JTextField txt_giaNhap;
    private javax.swing.JTextArea txt_mota;
    private javax.swing.JTextField txt_seach;
    private javax.swing.JTextField txt_soLuong;
    // End of variables declaration//GEN-END:variables
}
