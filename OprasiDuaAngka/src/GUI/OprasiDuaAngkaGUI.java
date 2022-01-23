/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ASUS
 */
public class OprasiDuaAngkaGUI extends javax.swing.JFrame {

    /**
     * Creates new form OprasiDuaAngkaGUI
     */
    public OprasiDuaAngkaGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        angka1TextField = new javax.swing.JTextField();
        tambahButton = new javax.swing.JButton();
        kurangButton = new javax.swing.JButton();
        kaliButton = new javax.swing.JButton();
        bagiButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        angka2TextField = new javax.swing.JTextField();
        hasilTextField = new javax.swing.JTextField();
        simbolLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oprasi Dua Angka");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Oprasi Dua Angka"));

        angka1TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angka1TextFieldKeyTyped(evt);
            }
        });

        tambahButton.setText("TAMBAH");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        kurangButton.setText("KURANG");
        kurangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangButtonActionPerformed(evt);
            }
        });

        kaliButton.setText("KALI");
        kaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliButtonActionPerformed(evt);
            }
        });

        bagiButton.setText("BAGI");
        bagiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiButtonActionPerformed(evt);
            }
        });

        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        simbolLabel.setText("+");

        jLabel2.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(angka1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(simbolLabel)
                        .addGap(18, 18, 18)
                        .addComponent(angka2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(hasilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tambahButton)
                        .addGap(18, 18, 18)
                        .addComponent(kurangButton)
                        .addGap(18, 18, 18)
                        .addComponent(kaliButton)
                        .addGap(18, 18, 18)
                        .addComponent(bagiButton)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angka1TextField)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(simbolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(hasilTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(angka2TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahButton)
                    .addComponent(kurangButton)
                    .addComponent(kaliButton)
                    .addComponent(bagiButton)
                    .addComponent(exitButton))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        //koding tambah
        double bil1, bil2, hasil;
        
        bil1 = Double.parseDouble(this.angka1TextField.getText());
        bil2 = Double.parseDouble(this.angka2TextField.getText());
        
        hasil = bil1 + bil2 ;
        
        this.hasilTextField.setText(" " + hasil);
        simbolLabel.setText("+");
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void kurangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangButtonActionPerformed
        // koding Kurang
        double bil1, bil2, hasil;
        
        bil1 = Double.parseDouble(this.angka1TextField.getText());
        bil2 = Double.parseDouble(this.angka2TextField.getText());
        
        hasil = bil1 - bil2 ;
        
        this.hasilTextField.setText(" " + hasil);
        simbolLabel.setText("-");
    }//GEN-LAST:event_kurangButtonActionPerformed

    private void kaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliButtonActionPerformed
        // Koding Kali
        double bil1, bil2, hasil;
        
        bil1 = Double.parseDouble(this.angka1TextField.getText());
        bil2 = Double.parseDouble(this.angka2TextField.getText());
        
        hasil = bil1 * bil2 ;
        
        this.hasilTextField.setText(" " + hasil);
        simbolLabel.setText("*");
    }//GEN-LAST:event_kaliButtonActionPerformed

    private void bagiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiButtonActionPerformed
        // bagi
        double bil1, bil2, hasil;
        
        bil1 = Double.parseDouble(this.angka1TextField.getText());
        bil2 = Double.parseDouble(this.angka2TextField.getText());
        
        hasil = bil1 / bil2 ;
        
        this.hasilTextField.setText(" " + hasil);
        simbolLabel.setText("/");
    }//GEN-LAST:event_bagiButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void angka1TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angka1TextFieldKeyTyped
             
    }//GEN-LAST:event_angka1TextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(OprasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OprasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OprasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OprasiDuaAngkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OprasiDuaAngkaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angka1TextField;
    private javax.swing.JTextField angka2TextField;
    private javax.swing.JButton bagiButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField hasilTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kaliButton;
    private javax.swing.JButton kurangButton;
    private javax.swing.JLabel simbolLabel;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables
}
