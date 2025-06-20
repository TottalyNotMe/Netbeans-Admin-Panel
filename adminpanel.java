package POS;
import POS.koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class adminpanel extends javax.swing.JFrame {

public adminpanel() {
    initComponents();
    loadTable();
    resetForm();
    setLocationRelativeTo(null);
}


Connection conn = koneksi.getConnection();
DefaultTableModel model;
private void loadTable() {
    String[] columnNames = {"Kode Barang", "Nama Barang", "Harga", "Satuan", "Stok"};
    model = new DefaultTableModel(null, columnNames);
    jTable1.setModel(model);

    try {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM barang");
        while (rs.next()) {
            String kode = rs.getString("kode_barang");
            String nama = rs.getString("nama_barang");
            String harga = String.valueOf(rs.getDouble("harga"));
            String satuan = rs.getString("satuan");
            String stok = String.valueOf(rs.getInt("stok"));

            String[] data = {kode, nama, harga, satuan, stok};
            model.addRow(data);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal load data: " + e.getMessage());
    }
}
private void resetForm() {
    jTextField_kode_barang.setText("");
    jTextField_nama_barang.setText("");
    jTextField_harga.setText("");
    jComboBox_satuan.setSelectedIndex(0);
    jTextField_stok.setText("");
    btnadd.setEnabled(true);
    jTextField_kode_barang.setEnabled(true);
    btnedit.setEnabled(false);
    btndelete.setEnabled(false);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_nama_barang = new javax.swing.JTextField();
        jTextField_harga = new javax.swing.JTextField();
        jTextField_stok = new javax.swing.JTextField();
        jComboBox_satuan = new javax.swing.JComboBox<>();
        jtext = new javax.swing.JLabel();
        jtx2 = new javax.swing.JLabel();
        jtx3 = new javax.swing.JLabel();
        jtx4 = new javax.swing.JLabel();
        jtx5 = new javax.swing.JLabel();
        jTextField_kode_barang = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        searchfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchbox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pengolahan Data Barang");

        jComboBox_satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Satuan", "Unit", "Lusin", "Box" }));
        jComboBox_satuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_satuanActionPerformed(evt);
            }
        });

        jtext.setText("Kode Barang");

        jtx2.setText("Nama Barang");

        jtx3.setText("Harga");

        jtx4.setText("Satuan");

        jtx5.setText("Stok");

        jTextField_kode_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_kode_barangActionPerformed(evt);
            }
        });

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btncancel.setText("CANCEL");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Cari:");

        searchbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Barang", "Nama Barang", "Harga", "Satuan", "Stok", " " }));
        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtext)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField_kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtx2)
                                .addGap(5, 5, 5)
                                .addComponent(jTextField_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtx5)
                                        .addGap(32, 32, 32)
                                        .addComponent(jTextField_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtx3)
                                        .addGap(23, 23, 23)
                                        .addComponent(jTextField_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(179, 179, 179)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnadd)
                                    .addComponent(btnedit))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btncancel)
                                    .addComponent(btndelete)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jtx4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnexit)))))
                .addGap(45, 45, 45))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jtext))
                    .addComponent(jTextField_kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jtx2))
                    .addComponent(jTextField_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jtx3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnadd)
                        .addComponent(btndelete)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit)
                    .addComponent(jtx4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jtx5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnedit)
                        .addComponent(btncancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jComboBox_satuanActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jTextField_kode_barangActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {                                       
btnadd.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "INSERT INTO barang VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_kode_barang.getText());
            pst.setString(2, jTextField_nama_barang.getText());
            pst.setDouble(3, Double.parseDouble(jTextField_harga.getText()));
            pst.setString(4, jComboBox_satuan.getSelectedItem().toString());
            pst.setInt(5, Integer.parseInt(jTextField_stok.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
            loadTable();
            resetForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal tambah data: " + e.getMessage());
        }
    }
});

    }                                      

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {                                        
btnedit.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String sql = "UPDATE barang SET nama_barang=?, harga=?, satuan=?, stok=? WHERE kode_barang=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_nama_barang.getText());
            pst.setDouble(2, Double.parseDouble(jTextField_harga.getText()));
            pst.setString(3, jComboBox_satuan.getSelectedItem().toString());
            pst.setInt(4, Integer.parseInt(jTextField_stok.getText()));
            pst.setString(5, jTextField_kode_barang.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");
            loadTable();
            resetForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal update data: " + e.getMessage());
        }
    }
});

    }                                       

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
btndelete.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM barang WHERE kode_barang=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, jTextField_kode_barang.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                loadTable();
                resetForm();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal hapus data: " + e.getMessage());
            }
        }
    }
});

    }                                         

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
btncancel.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        resetForm();
    }
});

    }                                         

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {                                        
btnexit.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
});

    }                                       

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTable1.getSelectedRow();
        jTextField_kode_barang.setText(jTable1.getValueAt(row, 0).toString());
        jTextField_nama_barang.setText(jTable1.getValueAt(row, 1).toString());
        jTextField_harga.setText(jTable1.getValueAt(row, 2).toString());
        jComboBox_satuan.setSelectedItem(jTable1.getValueAt(row, 3).toString());
        jTextField_stok.setText(jTable1.getValueAt(row, 4).toString());

        btnadd.setEnabled(false);
        jTextField_kode_barang.setEnabled(false);
        btnedit.setEnabled(true);
        btndelete.setEnabled(true);
    }
});

    }                                    

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {                                            
searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyReleased(java.awt.event.KeyEvent evt) {
        String key = searchfield.getText();
        String category = searchbox.getSelectedItem().toString();

        String column = "nama_barang";
        if (category.equals("Kode Barang")) {
            column = "kode_barang";
        } else if (category.equals("Harga")) {
            column = "harga";
        } else if (category.equals("Satuan")) {
            column = "satuan";
        } else if (category.equals("Stok")) {
            column = "stok";
        }

        String sql = "SELECT * FROM barang WHERE " + column + " LIKE ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + key + "%");
            ResultSet rs = pst.executeQuery();

            model.setRowCount(0); // clear table
            while (rs.next()) {
                String kode = rs.getString("kode_barang");
                String nama = rs.getString("nama_barang");
                String harga = String.valueOf(rs.getDouble("harga"));
                String satuan = rs.getString("satuan");
                String stok = String.valueOf(rs.getInt("stok"));

                String[] data = {kode, nama, harga, satuan, stok};
                model.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal cari data: " + e.getMessage());
        }
    }
});

    }                                           

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
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private javax.swing.JComboBox<String> jComboBox_satuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_harga;
    private javax.swing.JTextField jTextField_kode_barang;
    private javax.swing.JTextField jTextField_nama_barang;
    private javax.swing.JTextField jTextField_stok;
    private javax.swing.JLabel jtext;
    private javax.swing.JLabel jtx2;
    private javax.swing.JLabel jtx3;
    private javax.swing.JLabel jtx4;
    private javax.swing.JLabel jtx5;
    private javax.swing.JComboBox<String> searchbox;
    private javax.swing.JTextField searchfield;
    // End of variables declaration                   
}
