package main;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author W1771719 Seyed Avin Moosavi Shirazi, W1758597 Rabiul Alam
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    
    
    Dialogue dialogue = new Dialogue();
    // initialised globally to allow only one instance to be used and to set the dialogue panels from the main JFrame/Mainframe
    
    public Main() {
        
        // initiating components
        
        initComponents();
        
        
        // setting the screen size
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
        // Here are all the object that are for the panels
        Login login = new Login();
        Register register = new Register();
        Menu menu = new Menu();
        Help help = new Help();
        Settings settings = new Settings();
        AboutUs aboutUs = new AboutUs();
        Feedback feedback = new Feedback();
        A1 a1 = new A1();
        A2 a2 = new A2();
        B1 b1 = new B1();
        B2 b2 = new B2();
        
        
        
        // sets the speed of the animation
        slide.setAnimate(6);
        
        // sets the Panels within the list
        slide.init(login, register, menu, help, settings, a1, a2 , b1, b2,dialogue, aboutUs, feedback);
        
        
        // Login to Register
        login.addEventRegister(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Show register form
                slide.show(1);
                register.register();
            }
        });       
        //Register to Login
        register.addEventBackLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                slide.show(0);
                login.login();
            }
        });
            // Menu to Login
        menu.addEventSignOut(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the menu page
                slide.show(0);
                login.login();
          
            }
        });       
         // Menu to Help
        menu.addEventHelp(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the help page
                slide.show(3);
                help.help();
            }
        });       
          // Menu to Settings
        menu.addEventSettings(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the settings page
                slide.show(4);
                settings.settings();
            }
        });        
         // Help to Menu
        help.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //shows menu page
                slide.show(2);
                menu.menu();
            }
        });
         // Settings to Menu
        settings.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the menu page
                slide.show(2);
                menu.menu();
            }
        });
           // Menu to A1
        menu.addEventA1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the A1 page
                slide.show(5);
                a1.a1();
            }
        });        
          // Menu to A2
        menu.addEventA2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the A2 page
                slide.show(6);
                a2.a2();
            }
        });
        // Menu to B1   
        menu.addEventB1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the B1 page
                slide.show(7);
                b1.b1();
            }
        });
        // Menu to B2
        menu.addEventB2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the B2 page
                slide.show(8);
                b2.b2();
            }
        });
        // A1 to Menu
        a1.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the menu page
                slide.show(2);
                menu.menu();
            }
        });
        // A2 to Menu
        a2.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the menu page
                slide.show(2);
                menu.menu();
            }
        });
        // B1 to Menu
        b1.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the menu page
                slide.show(2);
                menu.menu();
            }
        });
        // B2 to Menu
        b2.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the menu page
                slide.show(2);
                menu.menu();
            }
        });     
        // Dialogue to Menu
        dialogue.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the menu page
                slide.show(2);
                menu.menu();
            }
        });
        // Settings to AboutUs
        settings.addEventAboutUs(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the aboutus page
                slide.show(10);
                aboutUs.aboutUs();
            }
        });
        // AboutUs to Settings
        aboutUs.addEventSettings(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the settings page
                slide.show(4);
                settings.settings();
            }
        });
        // Settings to Feedback
        settings.addEventFeedback(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the feedback page
                slide.show(11);
                feedback.feedback();
            }
        });
        // Feedback to Settings
        feedback.addEventSettings(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Shows the menu page
                slide.show(4);
                settings.settings();
            }
        });
        
    }
    
    // method to allow an instance of a menu to be created once the user has successfully logged in from the Login.java file
    public void showMenu(){
        slide.show(2);
        Menu menu = new Menu();
        menu.menu();
    }
    
    // method to allow an instance of diologue to be shown from A1,A2,B1 and B2 java files
    public void showDialogue(){
        // slide animation set to 10000 to allow the Main java file to seamlessly go straight to the Dialogue java file instead of going through each of the slides
        slide.setAnimate(10000);
        slide.show(9);
 
    }
    

    // method to set the text of the dialogue panels in the Dialogue java file
     public void setDialogueText(String Conv_A, String Conv_B, String Key_Vocab,String Grammar_Structure){
         dialogue.setPersonAOutput(Conv_A);
         dialogue.setPersonBOutput(Conv_B);
         dialogue.setVocabOutput(Key_Vocab);
         dialogue.setStructureOutput(Grammar_Structure);
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        slide = new swing.PanelSlide();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 231, 249));
        panelGradiente1.setColorSecundario(new java.awt.Color(255, 153, 153));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        slide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        panelBorder1.setLayer(slide, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGradiente1.setLayer(panelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PanelBorder panelBorder1;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
