package main;


import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


        
        
/**
 *
 * @author W1771719 Seyed Avin Moosavi Shirazi, W1758597 Rabiul Alam
 */
public class Login extends javax.swing.JPanel {
    
    private Boolean isUserNameExist = false;
    

    // This is the form for the Login
    public Login() {
        initComponents();
       
    }

    public void login() {
        userLoginField.grabFocus();
    }

    public void addEventRegister(ActionListener event) {
        cmdRegister.addActionListener(event);
    }
    
    public void addEventMenu(ActionListener event) {
        loginBtn.addActionListener(event);
    }
    
    
    

    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLoginField = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwdField = new swing.MyPassword();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new swing.MyButton();
        cmdRegister = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        userLoginField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        userLoginField.setMinimumSize(new java.awt.Dimension(11, 28));
        userLoginField.setPreferredSize(new java.awt.Dimension(11, 28));
        userLoginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Kannada MN", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        passwdField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passwdField.setMinimumSize(new java.awt.Dimension(11, 28));
        passwdField.setPreferredSize(new java.awt.Dimension(11, 28));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Password");

        loginBtn.setBackground(new java.awt.Color(255, 153, 153));
        loginBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginBtn.setForeground(new java.awt.Color(40, 40, 40));
        loginBtn.setText("Login");
        loginBtn.setFont(new java.awt.Font(".SF NS Text", 0, 13)); // NOI18N
        loginBtn.setMaximumSize(new java.awt.Dimension(81, 27));
        loginBtn.setMinimumSize(new java.awt.Dimension(81, 27));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        cmdRegister.setFont(new java.awt.Font(".SF NS Text", 1, 12)); // NOI18N
        cmdRegister.setForeground(new java.awt.Color(255, 153, 153));
        cmdRegister.setText("Register Now");
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLoginField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwdField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdRegister)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userLoginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userLoginFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
         
        retrievePwdANDSlt();
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private swing.MyButton loginBtn;
    private swing.MyPassword passwdField;
    private swing.MyTextField userLoginField;
    // End of variables declaration//GEN-END:variables



public void verifyUserName(){

try{

Connection con = connectDB.getConnection();
        String sql = "Select * from User where userName=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,userLoginField.getText().toUpperCase());
        
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            isUserNameExist = true;
}       else{
            isUserNameExist = false;
}
        con.close();
        } catch(Exception e){



}

}


public void retrievePwdANDSlt(){
    
    
    String providedPassword = passwdField.getText();
    String userID = "";
    String encryptedPwd = "";
    String salt = "";
    
    
    String userName = userLoginField.getText().toUpperCase().trim();
            String password = passwdField.getText(); 
           if(userName.equals("")|| password.equals("")){
                JOptionPane.showMessageDialog(this,"Please make sure all required fields are filled in before proceeding to login in");
            }
           
           else if(!userName.equals("")|| !password.equals("")){
    verifyUserName();
    
    if(isUserNameExist){
    try{
    Connection con = connectDB.getConnection();
    String sql = "Select UserID from User where userName=?";
     PreparedStatement pst = con.prepareStatement(sql);

    pst.setString(1,userLoginField.getText().toUpperCase());
    ResultSet rs= pst.executeQuery();
    
    if(rs.next()){
            userID = rs.getString("userID");
            System.out.println(userID);
    }
    rs.close();
    
    
    
    String sql2= "Select encryptedPassword, salt from Passwd where UserID =?";
    PreparedStatement pst2 = con.prepareStatement(sql2);
    pst2.setString(1,userID);
    
    ResultSet rs2 = pst2.executeQuery();
    
    if(rs2.next()){
        encryptedPwd = rs2.getString("encryptedPassword");
        System.out.println(encryptedPwd);
        salt = rs2.getString("salt");
        System.out.println(salt);
    }
    
    con.close();
    
    passwordGenerator passGen = new passwordGenerator();
    System.out.println("provided password is now being verified");
    boolean passwdMatch = passGen.verifyUserPassword(providedPassword, encryptedPwd, salt);
    System.out.println("");
        System.out.println("passwdMatch: " + passwdMatch);
        
        if(passwdMatch==false){
                JOptionPane.showMessageDialog(this,"Password is incorrect");

        }
        
        else if(passwdMatch==true){
            JOptionPane.showMessageDialog(this,"Password is correct you may now proceed");
            
            
            try{
                
                Connection con2 = connectDB.getConnection();
           
           // once password has been authorised, the user login time will be recorded in the database     
           java.util.Date utilDate = new java.util.Date();
           DateFormat df = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
           String loginTime = df.format(utilDate);
           
                System.out.println(loginTime);
                
           String query = "insert into userActivity(userId, loginTime)" + "VALUES (?,?)";
           
           PreparedStatement pst3= con2.prepareStatement(query);
           
           pst3.setString(1, userID);
           pst3.setString(2, loginTime);
           pst3.executeUpdate();
           
           con2.close();
               
            } catch(SQLException ex){
            System.out.println("Problem with close connection of SQLite");   
        }
            
            // after successfull login the menu will then be shown to the user by creating an instance of main
           Main main = new Main();
           main.setVisible(true);
           main.showMenu();
     
        }
 
    
}catch(Exception e){
        System.out.println("Problem with close connection of SQLite");
}

}
    
    else if(!isUserNameExist){
    
    JOptionPane.showMessageDialog(this,"There is no account associated with this username");

}

}
}






}