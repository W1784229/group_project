/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.myownprivateone;

/**
 *
 * @author Ibraheem
 */
public class Context_B2 extends javax.swing.JPanel {

    /**
     * Creates new form Context_B2
     */
    public Context_B2() {
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

        jLabel2 = new javax.swing.JLabel();
        backBtn = new swing.MyButton();
        B2_Cmb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        B2_Sub_Cmb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Level B2");

        backBtn.setForeground(new java.awt.Color(40, 40, 40));
        backBtn.setText("Back");
        backBtn.setBorderPainted(false);

        B2_Cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Going shopping and asking for prices", "Work life", "Making travel arrangements", "Socialising in the country" }));
        B2_Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2_CmbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Context:");

        B2_Sub_Cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2_Sub_CmbActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Sub-Context:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(B2_Sub_Cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B2_Cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B2_Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B2_Sub_Cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B2_Sub_CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2_Sub_CmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B2_Sub_CmbActionPerformed

    private void B2_CmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2_CmbActionPerformed
        if(B2_Cmb.getSelectedItem().equals("Going shopping and asking for prices")){
            B2_Sub_Cmb.removeAllItems();
            B2_Sub_Cmb.setSelectedItem(null);
            B2_Sub_Cmb.addItem("Phone purchase");
        }
        else
        if(B2_Cmb.getSelectedItem().equals("Work life")){
            B2_Sub_Cmb.removeAllItems();
            B2_Sub_Cmb.setSelectedItem(null);
            B2_Sub_Cmb.addItem("Meet for drinks");
        }
        else
        if(B2_Cmb.getSelectedItem().equals("Making travel arrangements")){
            B2_Sub_Cmb.removeAllItems();
            B2_Sub_Cmb.setSelectedItem(null);
            B2_Sub_Cmb.addItem("Disneyland");
        }
        else
        if(B2_Cmb.getSelectedItem().equals("Socialising in the country")){
            B2_Sub_Cmb.removeAllItems();
            B2_Sub_Cmb.setSelectedItem(null);
            B2_Sub_Cmb.addItem("No show date");
        }
    }//GEN-LAST:event_B2_CmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> B2_Cmb;
    private javax.swing.JComboBox<String> B2_Sub_Cmb;
    private swing.MyButton backBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
