/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.myownprivateone;

/**
 *
 * @author Ibraheem
 */
public class SubContext_A1_Personal extends javax.swing.JPanel {

    /**
     * Creates new form SubContext_A1_Personal
     */
    public SubContext_A1_Personal() {
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

        backBtn = new swing.MyButton();
        DescriptionBtn = new swing.MyButton();
        NeighbourBtn = new swing.MyButton();
        InstagramBtn = new swing.MyButton();
        SocialBtn = new swing.MyButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setForeground(new java.awt.Color(40, 40, 40));
        backBtn.setText("Back");
        backBtn.setBorderPainted(false);

        DescriptionBtn.setBackground(new java.awt.Color(125, 229, 251));
        DescriptionBtn.setForeground(new java.awt.Color(40, 40, 40));
        DescriptionBtn.setText("Description of town");

        NeighbourBtn.setBackground(new java.awt.Color(125, 229, 251));
        NeighbourBtn.setForeground(new java.awt.Color(40, 40, 40));
        NeighbourBtn.setText("Neighbour's parcel");
        NeighbourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeighbourBtnActionPerformed(evt);
            }
        });

        InstagramBtn.setBackground(new java.awt.Color(125, 229, 251));
        InstagramBtn.setForeground(new java.awt.Color(40, 40, 40));
        InstagramBtn.setText("Instagram");
        InstagramBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstagramBtnActionPerformed(evt);
            }
        });

        SocialBtn.setBackground(new java.awt.Color(125, 229, 251));
        SocialBtn.setForeground(new java.awt.Color(40, 40, 40));
        SocialBtn.setText("Social Media");
        SocialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SocialBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Exchanging personal infromation");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InstagramBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SocialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NeighbourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(SocialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InstagramBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NeighbourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DescriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NeighbourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeighbourBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NeighbourBtnActionPerformed

    private void InstagramBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstagramBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstagramBtnActionPerformed

    private void SocialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SocialBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SocialBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton DescriptionBtn;
    private swing.MyButton InstagramBtn;
    private swing.MyButton NeighbourBtn;
    private swing.MyButton SocialBtn;
    private swing.MyButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
