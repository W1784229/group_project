package main;

import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author W1771719 Seyed Avin Moosavi Shirazi, W1758597 Rabiul Alam
 */
public class Register extends javax.swing.JPanel {

    // This creates a new login form
    private swing.PanelSlide slide;
    private static String userName;
    private static String userPwd;
    private Boolean isEmailExist = false;
    private Boolean isUserNameExist = false;
    private static int count =0;
    

    
    public Register() {
        initComponents();
    }

    public void register() {
        userField.grabFocus();
    }

    public void addEventBackLogin(ActionListener event) {
        cmdBackLogin.addActionListener(event);
    }

    //This method is called from within the constructor to initialize the form.    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userField = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new swing.MyPassword();
        jLabel3 = new javax.swing.JLabel();
        registerBtn = new swing.MyButton();
        cmdBackLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        passwordConfirmField = new swing.MyPassword();
        emailField = new swing.MyTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Kannada MN", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Password");

        registerBtn.setBackground(new java.awt.Color(255, 153, 153));
        registerBtn.setForeground(new java.awt.Color(40, 40, 40));
        registerBtn.setText("Register");
        registerBtn.setFont(new java.awt.Font(".SF NS Text", 0, 13)); // NOI18N
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        cmdBackLogin.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cmdBackLogin.setForeground(new java.awt.Color(255, 153, 153));
        cmdBackLogin.setText("Already a user?  Login");
        cmdBackLogin.setContentAreaFilled(false);
        cmdBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Confirm Password");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdBackLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(passwordConfirmField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(passwordConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(cmdBackLogin)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO 
    }//GEN-LAST:event_userFieldActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
           submitData();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO 
    }//GEN-LAST:event_emailFieldActionPerformed

    private void cmdBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackLoginActionPerformed
        // TODO 
    }//GEN-LAST:event_cmdBackLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBackLogin;
    private swing.MyTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private swing.MyPassword passwordConfirmField;
    private swing.MyPassword passwordField;
    private swing.MyButton registerBtn;
    private swing.MyTextField userField;
    // End of variables declaration//GEN-END:variables

// where sqlfunctionality starts 
    
    // function to check data before storing in DB
    
    public void checkEmail(){
        

        try{
            
            Connection con = connectDB.getConnection();
            String sql = "Select * from User where userEmail=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,emailField.getText().toLowerCase());
            
            ResultSet rs =pst.executeQuery();
            if (rs.next()){
                 isEmailExist = true;
            }else{
                isEmailExist = false;
            }
            con.close();
        } catch(Exception e){
         
        }     
    
        }

    public void checkUserName(){
        
        
        
        try{
            
            Connection con = connectDB.getConnection();
            String sql = "Select * from User where userName=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,userField.getText().toUpperCase());
            
            ResultSet rs =pst.executeQuery();
            if (rs.next()){
                 isUserNameExist = true;
            }else{
                isUserNameExist = false;
            }
            con.close();
        } catch(Exception e){
           
              
        }     
       
        
    }

    public void submitData(){
        try{
            
            Connection con = connectDB.getConnection();
            String userName = "";
            String email = "";
            String password = "";
            String confirmedPassword = "";

            userName = userField.getText().toUpperCase().trim();
            email = emailField.getText().toLowerCase().trim();
            password = passwordField.getText();
            confirmedPassword = passwordConfirmField.getText();
            checkUserName();
            checkEmail();
            if(userName.equals("")|| email.equals("") || password.equals("") || confirmedPassword.equals("")){
                JOptionPane.showMessageDialog(this,"Please Make sure All required fields are filled in");
            }
            
            else if(!password.equals(confirmedPassword)){
                JOptionPane.showMessageDialog(this, "please ensure both password fields match.");
            }
            
            else if(isUserNameExist){
                 JOptionPane.showMessageDialog(this,"Username already exists. Please try again with a different username");
                isUserNameExist = false;
                
                
            }
            
            
            else if(isEmailExist){
                    JOptionPane.showMessageDialog(this,"Email already exists. Please try again with a different account");
                isEmailExist = false;
                
                
            }
            else{
                count ++;
                
                String userID = "ID-0" + count;
                    String query = "insert into User(userID,userName,userEmail)" +"VALUES (?,?,?)";
                    System.out.println("query: " +query);
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1,userID);
                    pst.setString(2,userName);
                    pst.setString(3,email);
                    pst.executeUpdate();
                    
                   passwordGenerator pwd = new passwordGenerator();
                   String slt = pwd.getSalt(100);
                   String generatedPwd = pwd.generateSecurePassword(password,slt);
                   System.out.println("pwd salted: " + generatedPwd);
                   
                    
                    
                    
                    
                    String query2 = "insert into Passwd(userID,encryptedPassword,salt)" +"VALUES (?,?,?)";
                    System.out.println("query2: " + query);
                    PreparedStatement pst2 = con.prepareStatement(query2);
                    pst2.setString(1,userID);
                    pst2.setString(2, generatedPwd);
                    pst2.setString(3, slt);
                    pst2.executeUpdate();
                    
           
                   con.close();
                    
                    JOptionPane.showMessageDialog(this,"You have successfully Registered."); 
                    
                    Main main = new Main();
                    main.setVisible(true);
  
            }
        }catch(SQLException ex){
           System.out.println("Problem with close connection of SQLite");
        }

    }

    }
        

        
        
        
        
        
        
        
    
    














