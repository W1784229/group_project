/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.myownprivateone;

/**
 *
 * @author Ibraheem
 */
public class SubContext_A2_Food extends javax.swing.JPanel {

    /**
     * Creates new form SubContext_A2_Food
     */
    public SubContext_A2_Food() {
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

        VeganBtn = new swing.MyButton();
        ResverationBtn = new swing.MyButton();
        DrinksBtn = new swing.MyButton();
        CodeBtn = new swing.MyButton();
        CocktailsBtn = new swing.MyButton();
        CocktailsBtn2 = new swing.MyButton();
        backBtn = new swing.MyButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        VeganBtn.setBackground(new java.awt.Color(125, 229, 251));
        VeganBtn.setForeground(new java.awt.Color(40, 40, 40));
        VeganBtn.setText("Vegan pizza");
        VeganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeganBtnActionPerformed(evt);
            }
        });

        ResverationBtn.setBackground(new java.awt.Color(125, 229, 251));
        ResverationBtn.setForeground(new java.awt.Color(40, 40, 40));
        ResverationBtn.setText("Reservation");
        ResverationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResverationBtnActionPerformed(evt);
            }
        });

        DrinksBtn.setBackground(new java.awt.Color(125, 229, 251));
        DrinksBtn.setForeground(new java.awt.Color(40, 40, 40));
        DrinksBtn.setText("Delayed drinks order");
        DrinksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinksBtnActionPerformed(evt);
            }
        });

        CodeBtn.setBackground(new java.awt.Color(125, 229, 251));
        CodeBtn.setForeground(new java.awt.Color(40, 40, 40));
        CodeBtn.setText("QR Code");

        CocktailsBtn.setBackground(new java.awt.Color(125, 229, 251));
        CocktailsBtn.setForeground(new java.awt.Color(40, 40, 40));
        CocktailsBtn.setText("Cocktails (1)");

        CocktailsBtn2.setBackground(new java.awt.Color(125, 229, 251));
        CocktailsBtn2.setForeground(new java.awt.Color(40, 40, 40));
        CocktailsBtn2.setText("Cocktails (2)");

        backBtn.setForeground(new java.awt.Color(40, 40, 40));
        backBtn.setText("Back");
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Ordering food and drink");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sub-Context");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResverationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VeganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrinksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CocktailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CocktailsBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(VeganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResverationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DrinksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CodeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CocktailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CocktailsBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VeganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeganBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VeganBtnActionPerformed

    private void ResverationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResverationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResverationBtnActionPerformed

    private void DrinksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinksBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrinksBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton CocktailsBtn;
    private swing.MyButton CocktailsBtn2;
    private swing.MyButton CodeBtn;
    private swing.MyButton DrinksBtn;
    private swing.MyButton ResverationBtn;
    private swing.MyButton VeganBtn;
    private swing.MyButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}