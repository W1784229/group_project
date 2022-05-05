/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.ActionListener;

/**
 *
 * @author W1771719 Seyed Avin Moosavi Shirazi, W1784229 Ibraheem Ahmed
 */
public class Help extends javax.swing.JPanel {

    /**
     * Creates new form Help
     */
    public Help() {
        initComponents();
    }
    
    public void help() {
        
    }
    
    public void addEventMenu(ActionListener event) {
        back.addActionListener(event);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HelpLabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        HelpLabel.setFont(new java.awt.Font("Kannada MN", 1, 48)); // NOI18N
        HelpLabel.setForeground(new java.awt.Color(69, 68, 68));
        HelpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HelpLabel.setText("Help");
        HelpLabel.setMaximumSize(new java.awt.Dimension(193, 59));
        HelpLabel.setMinimumSize(new java.awt.Dimension(193, 59));

        back.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 153, 153));
        back.setText("Back");
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setText("Welcome to our language app, this app is designed to help users such as yourself learn different languages by taking on different conversations between two people and reacting to them. This could be done by yourself or with a friend. The application is very simple, first choose a language level you would like to attempt, then choose the type of context you would like to learn as well as subcontext, once you have chosen what you would like to learn, click the go button to proceed to the final step. On this step, you would first learn the keywords then reenact the conversation between person A and B by translating the english conversation to the language you are learning.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(HelpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(55, 55, 55)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(HelpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HelpLabel;
    private javax.swing.JButton back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}