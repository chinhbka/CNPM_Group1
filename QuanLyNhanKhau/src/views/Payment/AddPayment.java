/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Payment;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class AddPayment extends javax.swing.JFrame {

    private String content;
    private JFrame parentJFrame;

    
    public AddPayment(String content, JFrame parentJFrame) {
        initComponents();
        this.content = content;
        this.JlbContent.setText(content);
        this.parentJFrame = parentJFrame;
       
        this.setTitle("Thông tin chi tiết");
    }
    
    public void close() {
        dispose();
        this.parentJFrame.setEnabled(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlbContent = new javax.swing.JLabel();
        JtfValue = new javax.swing.JTextField();
        JtfNote = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JlbContent.setText("jLabel1");

        JtfValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfValueActionPerformed(evt);
            }
        });

        JtfNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtfNoteActionPerformed(evt);
            }
        });

        jButton1.setText("Lưu");

        jButton2.setText("Hủy");

        jLabel1.setText("x1000 đồng");

        jLabel2.setText("Ghi chú");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JtfValue, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144)
                        .addComponent(JtfNote, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jButton1)
                        .addGap(74, 74, 74)
                        .addComponent(jButton2)))
                .addContainerGap(182, Short.MAX_VALUE))
            .addComponent(JlbContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JlbContent, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JtfValue, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JtfNote)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtfValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfValueActionPerformed

    private void JtfNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtfNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtfNoteActionPerformed

    /**
     * @param args the command line arguments
     */
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlbContent;
    private javax.swing.JTextField JtfNote;
    private javax.swing.JTextField JtfValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
