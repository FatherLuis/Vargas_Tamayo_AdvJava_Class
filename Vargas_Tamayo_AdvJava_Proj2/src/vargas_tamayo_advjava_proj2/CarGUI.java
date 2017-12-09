/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj2;

import javax.swing.JOptionPane;
import java.awt.Color;
import static java.awt.Color.blue;

/*
Class name: CarGUI

Class Author: Luis E. Vargas Tamayo

Purpose of the class: The interactive I/O that creates the virtual vehicle for the user

Date:  9/15/2017

List of changes with dates: none

Special Notes: none
*/ 
public class CarGUI extends javax.swing.JFrame {

    
    /*
    Method Name: CarGUI()
    Purpose: This is the COntructor that creates the GUI
    Parameter: none
    Method Input: initComponents(),vehicleMakeSelec(), vehicleColorSelec()
    Return Value: none
    Date: 9/15/2017
    */   
    public CarGUI() 
    {
        initComponents();
        vehicleMakeSelec();
        vehicleColorSelec();
    }

    /*
    Method Name: vehicleMakeselec()
    Purpose: creates the list for the chMakeselec variable
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 9/15/2017
    */      
    private void vehicleMakeSelec()
    {
        chModelSelec.add("Select a Model...");
        
        chMakeSelec.add("Select a Make...");
        chMakeSelec.add("BMW");
        chMakeSelec.add("Cadillac");
        chMakeSelec.add("Chevolet");
        chMakeSelec.add("Dodge");
        chMakeSelec.add("Ford");
        chMakeSelec.add("Honda");
        chMakeSelec.add("Infiniti");
        chMakeSelec.add("Lincoln");
        chMakeSelec.add("Nissan");
        chMakeSelec.add("Toyota");
    }
    
    /*
    Method Name: vehicleModelSelec()
    Purpose: creates the list for the chMakeSelec depending on the selected item on chModelSelec
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 9/15/2017
    */       
    private void vehicleModelSelec()
    {
        chModelSelec.add("Select a Model...");

        switch (chMakeSelec.getSelectedItem())
        {
            case "BMW":
            
                chModelSelec.add("Series I");
                chModelSelec.add("Series II");
                chModelSelec.add("Series III");
                chModelSelec.add("Series IV");
                chModelSelec.add("Series V");
        
                break;
            case "Cadillac":                
                chModelSelec.add("Allante'");
                chModelSelec.add("Catera");
                chModelSelec.add("Deville");
                chModelSelec.add("Seville");
                chModelSelec.add("XT5");
                break;
            case "Chevolet":
                chModelSelec.add("Astro");
                chModelSelec.add("Bolt EV");
                chModelSelec.add("Chevy");
                chModelSelec.add("Classic");
                chModelSelec.add("Nova");
                break;
            case "Dodge":
                chModelSelec.add("Colt");
                chModelSelec.add("Durango");
                chModelSelec.add("Magnun");
                chModelSelec.add("Omni");
                chModelSelec.add("Ram Wagon");
                break;
            case "Ford":
                chModelSelec.add("Aerostar");
                chModelSelec.add("Contour");
                chModelSelec.add("Edge");
                chModelSelec.add("F-150");
                chModelSelec.add("Fiesta");
                break;
            case "Honda":
                chModelSelec.add("Accord");
                chModelSelec.add("Civic");
                chModelSelec.add("Odyssy");
                chModelSelec.add("Prelude");
                chModelSelec.add("Wagovan");
                break;                
            case "Infiniti":
                chModelSelec.add("EX35");
                chModelSelec.add("EX37");
                chModelSelec.add("FX50");
                chModelSelec.add("M35");
                chModelSelec.add("Q70");
                break;                
            case "Lincoln":
                chModelSelec.add("Aviator");
                chModelSelec.add("Mark LT");
                chModelSelec.add("MKC");
                chModelSelec.add("Navigator");
                chModelSelec.add("Zephyr");
                break;             
            case "Nissan":
                chModelSelec.add("Frontier");
                chModelSelec.add("Heavy Duty");
                chModelSelec.add("Maxima");
                chModelSelec.add("Pulsar");
                chModelSelec.add("Titan");
                break;                
            case "Toyota":              
                chModelSelec.add("Avalon");
                chModelSelec.add("Corona");
                chModelSelec.add("Mirai");
                chModelSelec.add("Sienna");
                chModelSelec.add("Tundra");
                break;              
            default:
                
        }
                
            
            
            
            
        
    }

    /*
    Method Name: vehicleColorSelec()
    Purpose: creates the list for the chColorSelec 
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 9/15/2017
    */      
    private void vehicleColorSelec()
    {       
        chColorSelec.add("Select a Color...");   
        chColorSelec.add("Blue");
        chColorSelec.add("Black");
        chColorSelec.add("Green");
        chColorSelec.add("Grey");  
        chColorSelec.add("Orange");      
        chColorSelec.add("Red");    
        chColorSelec.add("Pink");
        chColorSelec.add("Yellow");
        chColorSelec.add("White");
    }
 
    /*
    Method Name: getMake()
    Purpose: retreive the value of selected item from chMakeSelec
    Parameter: none
    Method Input:  none
    Return Value: String
    Date: 9/15/2017
    */      
    private String getMake(){return chMakeSelec.getSelectedItem();}
    
    /*
    Method Name: getModel()
    Purpose: retreive the value of selected item from chModelSelec
    Parameter: none
    Method Input: none 
    Return Value:  String
    Date: 9/15/2017
    */  
    private String getModel(){return chModelSelec.getSelectedItem();}
   
    /*
    Method Name: getColor()
    Purpose: retreive the value of selected item from chColorSelec
    Parameter: none
    Method Input:  none
    Return Value: Color
    Date: 9/15/2017
    */   
    private Color getColor()
    {
        //return chColorSelec.getSelectedItem();
        
        Color color = null;
        
        switch(chColorSelec.getSelectedItem())
        {
            case"Blue": 
                color = Color.blue;
                break;
                
            case"Black":
                color = Color.black;
                break;  
                
            case"Green":
                color = Color.green;
                break; 
                
            case"Grey":
                color = Color.GRAY;
                break;
                
            case"Orange":
                color = Color.ORANGE;
                break;   
                
            case"Red":
                color = Color.RED;
                break;  
                
            case"Pink":
                color = Color.pink;
                break;
                
            case"Yellow":
                color = Color.yellow;
                break;  
                
            case"White":
                color= Color.white;  
        }
        return color; 
    }
   
    /*
    Method Name: driveCar()
    Purpose: creates the Class Car Object and opens new GUI that allows the User to drive their Car
    Parameter: none
    Method Input: none  
    Return Value:  none
    Date: 9/15/2017
    */  
    private void driveCar()
    {
        Car newCar = new Car(getMake(),getModel(),getColor()); //Creates an object from Class car
        DriveCarGUI startCar = new DriveCarGUI(newCar);   //creates object GUI that allows user to operate car created
                
        startCar.setVisible(true); // allows the GUI to be seen on screen
    }
    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chMakeSelec = new java.awt.Choice();
        chModelSelec = new java.awt.Choice();
        chColorSelec = new java.awt.Choice();
        btnDriveCar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 750));
        setMinimumSize(new java.awt.Dimension(1250, 750));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1250, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 750));

        chMakeSelec.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        chMakeSelec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chMakeSelecMousePressed(evt);
            }
        });

        chModelSelec.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N
        chModelSelec.setMaximumSize(new java.awt.Dimension(1000, 1000));
        chModelSelec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chModelSelecMousePressed(evt);
            }
        });

        chColorSelec.setFont(new java.awt.Font("Dialog", 0, 25)); // NOI18N

        btnDriveCar.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btnDriveCar.setText("Start Driving!");
        btnDriveCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriveCarActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Virtual Car");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDriveCar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chMakeSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(chModelSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(chColorSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chMakeSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chModelSelec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chColorSelec, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                .addGap(105, 105, 105)
                .addComponent(btnDriveCar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Method Name:chModelSelecMousePressed
    Purpose: configures the needed list for chModelSelec depending on the selected item from chMakeSelec
    Parameter: java.awt.event.MouseEvent evt
    Method Input: none
    Return Value:  none
    Date: 9/15/2017
    */      
    private void chModelSelecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chModelSelecMousePressed
 
        if(!chMakeSelec.getSelectedItem().equals(chMakeSelec.getItem(0))) // if the default message from chMakeSelec is not selected then run code
        {   
            if(chModelSelec.getItemCount()>=0) // if chModelSelec contains anything, delete it from list
            {
                chModelSelec.removeAll();
            }
            
            vehicleModelSelec(); // new list will be present
            
        }
        else
        {
            chModelSelec.removeAll();
            chModelSelec.add("Select a Model...");
        
        }
        
    }//GEN-LAST:event_chModelSelecMousePressed
    
    /*
    Method Name: chMakeSelecMousePressed()
    Purpose: when the chMakeSelec is clicked, it will remove everything from chModelSelec and display "Select a Model"
    Parameter: java.awt.event.ActionEvent evt
    Method Input:  none 
    Return Value: none 
    Date: 9/15/2017
    */   
    private void chMakeSelecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chMakeSelecMousePressed

        chModelSelec.removeAll(); // deletes everythig
        chModelSelec.add("Select a Model..."); // default essage 
        
    }//GEN-LAST:event_chMakeSelecMousePressed
    
    /*
    Method Name: btnDriveCarActionPerformed()
    Purpose: Creates Car Object and opens DriveCarGUI so the User can Drive their car
    Parameter: java.awt.event.ActionEvent evt
    Method Input: driveCar()
    Return Value: none
    Date: 9/15/2017
    */   
    private void btnDriveCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriveCarActionPerformed
        
        String selectMake = chMakeSelec.getSelectedItem(); //set value from selected Item of chMakeSelec
        String selectModel = chModelSelec.getSelectedItem();//set value from selected Item of chModelSelec
        String selectColor = chColorSelec.getSelectedItem(); //set value from selected Item of chColorSelec
        
        if(!selectMake.equals(chMakeSelec.getItem(0))) //if selected item from chMakeSelec is not default, run code
        {
            if(!selectModel.equals(chModelSelec.getItem(0))) // if selected item from chModelSelec is not default, run code
            {
                if(!selectColor.equals(chColorSelec.getItem(0))) // if selected item from chColorSelec is not default, run code
                {
                    driveCar(); // creates Car object and DriveCarGUI is open

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please select the 'Color' for your " + selectMake + " " + selectModel);
                }  
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please select the 'Model' for your " + selectMake);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select the Car 'Make' ");
        }
    }//GEN-LAST:event_btnDriveCarActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(CarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDriveCar;
    private java.awt.Choice chColorSelec;
    private java.awt.Choice chMakeSelec;
    private java.awt.Choice chModelSelec;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
