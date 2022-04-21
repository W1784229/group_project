/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.myownprivateone;

/**
 *
 * @author Ibraheem
 */
public class Context_B1 extends javax.swing.JPanel {

    /**
     * Creates new form Context_A3
     */
    public Context_B1() {
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
        jLabel1 = new javax.swing.JLabel();
        UniversityBtn = new swing.MyButton();
        TravelBtn = new swing.MyButton();
        ShoppingBtn = new swing.MyButton();
        SocialisingBtn = new swing.MyButton();
        WeatherBtn = new swing.MyButton();
        OrderingBtn = new swing.MyButton();
        InvitationsBtn = new swing.MyButton();
        HousingBtn = new swing.MyButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Context");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Level B1");

        UniversityBtn.setBackground(new java.awt.Color(125, 229, 251));
        UniversityBtn.setForeground(new java.awt.Color(40, 40, 40));
        UniversityBtn.setText("University life");

        TravelBtn.setBackground(new java.awt.Color(125, 229, 251));
        TravelBtn.setForeground(new java.awt.Color(40, 40, 40));
        TravelBtn.setText("Making travel arrangements");
        TravelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TravelBtnActionPerformed(evt);
            }
        });

        ShoppingBtn.setBackground(new java.awt.Color(125, 229, 251));
        ShoppingBtn.setForeground(new java.awt.Color(40, 40, 40));
        ShoppingBtn.setText("Going shopping and asking for prices");
        ShoppingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoppingBtnActionPerformed(evt);
            }
        });

        SocialisingBtn.setBackground(new java.awt.Color(125, 229, 251));
        SocialisingBtn.setForeground(new java.awt.Color(40, 40, 40));
        SocialisingBtn.setText("Socialising in the country");
        SocialisingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SocialisingBtnActionPerformed(evt);
            }
        });

        WeatherBtn.setBackground(new java.awt.Color(125, 229, 251));
        WeatherBtn.setForeground(new java.awt.Color(40, 40, 40));
        WeatherBtn.setText("Weather");
        WeatherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeatherBtnActionPerformed(evt);
            }
        });

        OrderingBtn.setBackground(new java.awt.Color(125, 229, 251));
        OrderingBtn.setForeground(new java.awt.Color(40, 40, 40));
        OrderingBtn.setText("Ordering food and drink");
        OrderingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderingBtnActionPerformed(evt);
            }
        });

        InvitationsBtn.setBackground(new java.awt.Color(125, 229, 251));
        InvitationsBtn.setForeground(new java.awt.Color(40, 40, 40));
        InvitationsBtn.setText("Making invitations");
        InvitationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvitationsBtnActionPerformed(evt);
            }
        });

        HousingBtn.setBackground(new java.awt.Color(125, 229, 251));
        HousingBtn.setForeground(new java.awt.Color(40, 40, 40));
        HousingBtn.setText("Housing conditions");
        HousingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HousingBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(30, 122, 236));
        backBtn.setText("Back");
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InvitationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeatherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SocialisingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShoppingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TravelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UniversityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HousingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(UniversityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TravelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShoppingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SocialisingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WeatherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OrderingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InvitationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HousingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TravelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TravelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TravelBtnActionPerformed

    private void ShoppingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoppingBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShoppingBtnActionPerformed

    private void SocialisingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SocialisingBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SocialisingBtnActionPerformed

    private void WeatherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeatherBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeatherBtnActionPerformed

    private void OrderingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderingBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderingBtnActionPerformed

    private void InvitationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvitationsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvitationsBtnActionPerformed

    private void HousingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HousingBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HousingBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton HousingBtn;
    private swing.MyButton InvitationsBtn;
    private swing.MyButton OrderingBtn;
    private swing.MyButton ShoppingBtn;
    private swing.MyButton SocialisingBtn;
    private swing.MyButton TravelBtn;
    private swing.MyButton UniversityBtn;
    private swing.MyButton WeatherBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}