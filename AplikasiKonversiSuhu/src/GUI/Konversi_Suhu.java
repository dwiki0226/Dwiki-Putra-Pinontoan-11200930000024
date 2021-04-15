/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author AldaEva
 */
public class Konversi_Suhu extends javax.swing.JFrame {
    double celcius;
    double fahrenheit;
    double kelvin;
    double reamur;
    public Konversi_Suhu() {
        initComponents();
        
    }
    private void Celcius (){
        celcius = Double.parseDouble(txtSuhu.getText());
         fahrenheit = celcius *1.8 + 32;
         kelvin = celcius + 273.15;
         reamur = celcius * 0.8;
        lblCelcius.setText(celcius + "celcius");
        lblFahrenheit.setText(fahrenheit + "Fahrenheit");
        lblKelvin.setText(kelvin + "Kelvin");
        lblReamur.setText(reamur + "Reamur");
    }
    private void Fahrenheit (){
        fahrenheit = Double.parseDouble(txtSuhu.getText());
         celcius = (fahrenheit - 32)/1.8;
         reamur = (fahrenheit - 32)/2.25;
         kelvin = (fahrenheit + 459.67)/1.8;
        lblCelcius.setText(celcius + "celcius");
        lblFahrenheit.setText(fahrenheit + "Fahrenheit");
        lblKelvin.setText(kelvin + "Kelvin");
        lblReamur.setText(reamur + "Reamur");
    }
    private void Kelvin (){
        kelvin = Double.parseDouble(txtSuhu.getText());
         fahrenheit = kelvin * 1.8 - 459.67;
         celcius = kelvin - 273.15;
         reamur = (kelvin - 273.15)*0.8;
        lblCelcius.setText(celcius+"celcius");
        lblFahrenheit.setText(fahrenheit + "Fahrenheit");
        lblKelvin.setText(kelvin + "Kelvin");
        lblReamur.setText(reamur + "Reamur");
    }
    private void Reamur (){
        reamur = Double.parseDouble(txtSuhu.getText());
         fahrenheit = (reamur * 2.25)+32;
         kelvin = (reamur / 0.8) + 273.15;
         celcius = reamur / 0.8;
        lblCelcius.setText(celcius+"celcius");
        lblFahrenheit.setText(fahrenheit + "Fahrenheit");
        lblKelvin.setText(kelvin + "Kelvin");
        lblReamur.setText(reamur + "Reamur");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        RbCelcius = new javax.swing.JRadioButton();
        RbFahrenheit = new javax.swing.JRadioButton();
        RbKelvin = new javax.swing.JRadioButton();
        RbReamur = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCelcius = new javax.swing.JLabel();
        lblFahrenheit = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        lblReamur = new javax.swing.JLabel();
        BtnKonversi = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Konversi Suhu");

        txtSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuhuActionPerformed(evt);
            }
        });

        RbCelcius.setBackground(new java.awt.Color(255, 204, 204));
        RbCelcius.setText("Celcius");

        RbFahrenheit.setBackground(new java.awt.Color(255, 204, 204));
        RbFahrenheit.setText("Fahrenheit");
        RbFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbFahrenheitActionPerformed(evt);
            }
        });

        RbKelvin.setBackground(new java.awt.Color(255, 204, 204));
        RbKelvin.setText("Kelvin");
        RbKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbKelvinActionPerformed(evt);
            }
        });

        RbReamur.setBackground(new java.awt.Color(255, 204, 204));
        RbReamur.setText("Reamur");
        RbReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbReamurActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Masukan suhu");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hasil konversi :");

        lblCelcius.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblCelcius.setForeground(new java.awt.Color(255, 0, 0));
        lblCelcius.setText("Celcius");

        lblFahrenheit.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblFahrenheit.setForeground(new java.awt.Color(255, 0, 0));
        lblFahrenheit.setText("Fahrenheit");

        lblKelvin.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblKelvin.setForeground(new java.awt.Color(255, 0, 0));
        lblKelvin.setText(" Kelvin ");

        lblReamur.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblReamur.setForeground(new java.awt.Color(255, 0, 0));
        lblReamur.setText("Reamur ");

        BtnKonversi.setText("Konversi");
        BtnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKonversiActionPerformed(evt);
            }
        });

        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnKonversi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnReset))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSuhu, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(RbCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RbFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RbKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RbReamur, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCelcius))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblFahrenheit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblKelvin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblReamur)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RbCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RbFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RbKelvin)
                        .addComponent(RbReamur, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnKonversi)
                    .addComponent(BtnReset))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCelcius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblKelvin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblReamur)
                .addGap(33, 33, 33))
        );

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

    private void RbFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbFahrenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbFahrenheitActionPerformed

    private void RbKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbKelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbKelvinActionPerformed

    private void txtSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuhuActionPerformed

    private void RbReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbReamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbReamurActionPerformed

    private void BtnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKonversiActionPerformed
        if (RbCelcius.isSelected()){
            Celcius();
        }else if (RbFahrenheit.isSelected()){
            Fahrenheit();
        }else if (RbKelvin.isSelected()){
            Kelvin();
        }else if (RbReamur.isSelected()){
            Reamur();
        }
    }//GEN-LAST:event_BtnKonversiActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        txtSuhu.setText("");
        lblCelcius.setText("Celcius");
        lblFahrenheit.setText("Fahrenheit");
        lblKelvin.setText("Kelvin");
        lblReamur.setText("Reamur");
        RbCelcius.setSelected(false);
        RbFahrenheit.setSelected(false);
        RbKelvin.setSelected(false);
        RbReamur.setSelected(false);
    }//GEN-LAST:event_BtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Konversi_Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konversi_Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konversi_Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konversi_Suhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konversi_Suhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnKonversi;
    private javax.swing.JButton BtnReset;
    private javax.swing.JRadioButton RbCelcius;
    private javax.swing.JRadioButton RbFahrenheit;
    private javax.swing.JRadioButton RbKelvin;
    private javax.swing.JRadioButton RbReamur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblFahrenheit;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
