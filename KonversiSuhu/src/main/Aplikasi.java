package main;


import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author windows
 */
public class Aplikasi extends javax.swing.JFrame {
    //Variabel
    
    public Double input;
    public Double celcius;
    public Double reamur;
    public Double fahrenheit;
    public Double kelvin;
    public String hasilcelcius;
    public String hasilreamur;
    public String hasilfahrenheit;
    public String hasilkelvin;
    
    public Aplikasi() {
        initComponents();
    }

   private void celcius(){
        input= Double.parseDouble(txtAwal.getText());
        
        celcius=input;
        fahrenheit=celcius*1.8+32;
        reamur=celcius*0.8;
        kelvin=celcius+273.15;
        
        hasilcelcius= Double.toString(celcius);
        txt_celcius.setText(hasilcelcius);
        
        hasilfahrenheit= Double.toString(fahrenheit);
        txt_fahrenheit.setText(hasilfahrenheit);
        
        hasilreamur= Double.toString(reamur);
        txt_reamur.setText(hasilreamur);
        
        hasilkelvin= Double.toString(kelvin);
        txt_kelvin.setText(hasilkelvin);
    }
    
    private void fahrenheit(){
        input= Double.parseDouble(txtAwal.getText());
        
        fahrenheit = input;
        celcius = (fahrenheit-32)/1.8;
        reamur = (fahrenheit-32)/2.25;
        kelvin = (fahrenheit+459.67)/1.8;
        
        hasilcelcius = Double.toString(celcius);
        txt_celcius.setText(hasilcelcius);
        
        hasilfahrenheit = Double.toString(fahrenheit);
        txt_fahrenheit.setText(hasilfahrenheit);
        
        hasilreamur = Double.toString(reamur);
        txt_reamur.setText(hasilreamur);
            
        hasilkelvin = Double.toString(kelvin);
        txt_kelvin.setText(hasilkelvin);
    }
    
    private void reamur(){
        input= Double.parseDouble(txtAwal.getText());
        
        reamur = input;
        celcius = reamur/0.8;
        fahrenheit = (reamur*2.25)+32;
        kelvin = reamur/0.8+237.15;
        
        hasilcelcius = Double.toString(celcius);
        txt_celcius.setText(hasilcelcius);
        
        hasilfahrenheit = Double.toString(fahrenheit);
        txt_fahrenheit.setText(hasilfahrenheit);
        
        hasilreamur = Double.toString(reamur);
        txt_reamur.setText(hasilreamur);
        
        hasilkelvin = Double.toString(kelvin);
        txt_kelvin.setText(hasilkelvin);
    }
    
    private void kelvin(){
        input= Double.parseDouble(txtAwal.getText());
        
        kelvin = input;
        celcius = kelvin-273.15;
        fahrenheit = kelvin*1.8-459.67;
        reamur = (kelvin-237.15)*0.8;
        
        hasilcelcius = Double.toString(celcius);
        txt_celcius.setText(hasilcelcius);
        
        hasilfahrenheit = Double.toString(fahrenheit);
        txt_fahrenheit.setText(hasilfahrenheit);
        
        hasilreamur = Double.toString(reamur);
        txt_reamur.setText(hasilreamur);
        
        hasilkelvin = Double.toString(kelvin);
        txt_kelvin.setText(hasilkelvin); 
    }
    
    private void form_Tengah(){
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension framesize = this.getSize();
        if(framesize.height < screensize.height){
            framesize.height = screensize.height;
        }
        if(framesize.width > screensize.width){
            framesize.width = screensize.width;
        }
        this.setLocation((screensize.width - framesize.width)/2,
        (screensize.height - framesize.height)/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nilai1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nilai = new javax.swing.JLabel();
        txtAwal = new javax.swing.JTextField();
        rd_celcius = new javax.swing.JRadioButton();
        rd_reamur = new javax.swing.JRadioButton();
        rd_fahrenheit = new javax.swing.JRadioButton();
        rd_kelvin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_celcius = new javax.swing.JLabel();
        txt_celcius = new javax.swing.JButton();
        lbl_reamur = new javax.swing.JLabel();
        txt_reamur = new javax.swing.JButton();
        lbl_fahrenheit = new javax.swing.JLabel();
        txt_fahrenheit = new javax.swing.JButton();
        lbl_kelvin = new javax.swing.JLabel();
        txt_kelvin = new javax.swing.JButton();
        btn_konvert = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();

        nilai1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        nilai1.setText("Besarnya Suhu");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Konversi Suhu Didunia");

        jLabel3.setText("Suhu Yang Dikonversikan :");

        nilai.setText("Besarnya Suhu");

        rd_celcius.setText("Celcius");
        rd_celcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_celciusActionPerformed(evt);
            }
        });

        rd_reamur.setText("Reamur");

        rd_fahrenheit.setText("Fahrenheit");
        rd_fahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_fahrenheitActionPerformed(evt);
            }
        });

        rd_kelvin.setText("Kelvin");

        jLabel4.setText("Suhu Hasil Konversi :");

        lbl_celcius.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_celcius.setText("Celcius");

        lbl_reamur.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_reamur.setText("Reamur");

        lbl_fahrenheit.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_fahrenheit.setText("Fahrenheit");

        lbl_kelvin.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbl_kelvin.setText("Kelvin");

        btn_konvert.setBackground(new java.awt.Color(51, 255, 0));
        btn_konvert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_konvert.setForeground(new java.awt.Color(255, 0, 0));
        btn_konvert.setText("Konvert");
        btn_konvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konvertActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(255, 0, 0));
        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 0));
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_close.setBackground(new java.awt.Color(0, 0, 0));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nilai)
                            .addGap(35, 35, 35)
                            .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(rd_celcius)
                            .addGap(18, 18, 18)
                            .addComponent(rd_reamur)
                            .addGap(18, 18, 18)
                            .addComponent(rd_fahrenheit)
                            .addGap(18, 18, 18)
                            .addComponent(rd_kelvin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_celcius)
                            .addComponent(lbl_reamur)
                            .addComponent(lbl_fahrenheit)
                            .addComponent(lbl_kelvin))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_reamur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_celcius, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txt_fahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_kelvin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btn_konvert)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset)
                        .addGap(18, 18, 18)
                        .addComponent(btn_close)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilai)
                    .addComponent(txtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_celcius)
                    .addComponent(rd_reamur)
                    .addComponent(rd_fahrenheit)
                    .addComponent(rd_kelvin))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_celcius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_celcius, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_reamur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_reamur, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_fahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_fahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_kelvin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(txt_kelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_konvert)
                    .addComponent(btn_reset)
                    .addComponent(btn_close))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd_celciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_celciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_celciusActionPerformed

    private void rd_fahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_fahrenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_fahrenheitActionPerformed

    private void btn_konvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_konvertActionPerformed
        // TODO add your handling code here:
        if(rd_celcius.isSelected()){
            celcius();
        }
        else if(rd_fahrenheit.isSelected()){
            fahrenheit();
        }
        else if(rd_reamur.isSelected()){
            reamur();
        }
        else if(rd_kelvin.isSelected()){
            kelvin();
        }
    }//GEN-LAST:event_btn_konvertActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txtAwal.setText("");
        txt_celcius.setText("");
        txt_reamur.setText("");
        txt_fahrenheit.setText("");
        txt_kelvin.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

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
            java.util.logging.Logger.getLogger(Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_konvert;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_celcius;
    private javax.swing.JLabel lbl_fahrenheit;
    private javax.swing.JLabel lbl_kelvin;
    private javax.swing.JLabel lbl_reamur;
    private javax.swing.JLabel nilai;
    private javax.swing.JLabel nilai1;
    private javax.swing.JRadioButton rd_celcius;
    private javax.swing.JRadioButton rd_fahrenheit;
    private javax.swing.JRadioButton rd_kelvin;
    private javax.swing.JRadioButton rd_reamur;
    private javax.swing.JTextField txtAwal;
    private javax.swing.JButton txt_celcius;
    private javax.swing.JButton txt_fahrenheit;
    private javax.swing.JButton txt_kelvin;
    private javax.swing.JButton txt_reamur;
    // End of variables declaration//GEN-END:variables
}
