/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*

Class name: MainGUI

Class Author: Luis E. Vargas Tamayo

Purpose of the class: 

Date: 9/5/2017

List of changes with dates: none

Special Notes: none

*/ 
public class MainGUI extends javax.swing.JFrame
{
    /*
    Method Name: MainGUI()
    Method Inputted: initComponents()
    Parameters: none
    Purpose: creates the GUI
    Return: none
    Date: 7/5/2017
    */
    public MainGUI() {initComponents();}
     
    /*
    Method Name: getClear()
    Method Inputted: none
    Parameters: none
    Purpose: Clears the textBoxes information
    Return: none
    Date: 9/5/2017
    */   
    public void getClear()
    {
        //clears text from textbox
        
        txtBox1.setText("");
        txtBox2.setText("");
        txtBox3.setText("");
        txtBox4.setText("");
        txtBox5.setText("");
        txtBox6.setText("");
        txtBox7.setText("");
        txtBox8.setText("");
        txtBox9.setText("");
        txtBox10.setText("");
    }
 
    /*
    Method Name: isNumeric()
    Purpose: Check if the String is numeric, if not, then returns boolean false
    Parameter: String word
    Method Input: none
    Return Value:   boolean 
    Date: 9/5/2017
    */
    private boolean isNumeric(String word)
    {
        String strTerm = word; // stores value in parameter to this variable
        Boolean blnSwitch= true; //default is true
        
        try
        {

            double dblNumber = Double.parseDouble(strTerm); // tries to parse string to a double  
            
            
            if(dblNumber>=0 || dblNumber<=0){}else{ blnSwitch= false;} // second test, makes sure it is a number that passed the parse(efforts to rid of spaces)
                    
        }
        catch(Exception ex) // if the parse or the second test caused an exception,  boolean will return false
        { 
            blnSwitch = false;
        }
        
        return blnSwitch; //returns blnSwitch
    }
 
    /*
    Method Name: writer()
    Method Inputted: none
    Parameters: none
    Purpose: collects information from textboxes in GUI, stores in String Array
    Return: String[]
    Date: 9/5/2017
    */
    private String[] writer()
    {
        String[] vessel= new String[10]; //creates an array with a size of 10 elements
        
        //collects data and stores in an array
        
        vessel[0]=txtBox1.getText();
        vessel[1]=txtBox2.getText();
        vessel[2]=txtBox3.getText();
        vessel[3]=txtBox4.getText();
        vessel[4]=txtBox5.getText();
        vessel[5]=txtBox6.getText();
        vessel[6]=txtBox7.getText();
        vessel[7]=txtBox8.getText();
        vessel[8]=txtBox9.getText();
        vessel[9]=txtBox10.getText();
        
        return vessel; //Returns String[]
    }
    
    /*
    Method Name: editor()
    Method Inputted: none
    Parameters: String[] collection
    Purpose: Checks if string stored in array is numeric. New array is made storing the Numeric String as a Double. Non-numeric String denoted as -1
    Return: double[]
    Date: 9/5/2017
    */
    private double[] editor(String[] collection)
    {
        String[] strip = collection; //stores parameter in this variable
        double[] vessel = new double[10]; //creates a array with a size of 10 elements
        
        for(int i=0;i<strip.length;i++) //In each iteration, each element will be checked and if passed, will be stored in vessel[]
        {
            if(isNumeric(strip[i])) //if numeric string, then store in vessel[]
            {
                vessel[i] = Double.parseDouble(strip[i]);
            }
            else // non Numeric String will be denoted as -1 ( this might be a proble,) (maybe set as null)
            {
                vessel[i]= -1;
            }
        }
        
        return vessel;
    }
 
    /*
    Method Name: publisher()
    Method Inputted:  none
    Parameters: double[] set
    Purpose: check if all entry in aray are valid, if they are, a new GUI will open to display results, otherwise, error message will show
    Return: none
    Date: 9/5/2017
    */
    private void publisher(double[] set)
    {
        
        double[] secretary = set; // parameter is stored in secretary
        int index =0; // index is set to zero
        int key = 0; // key is set to zero
        
        while(index<secretary.length && secretary[index]!= -1 ) // loop will loop until the index exceeds the size of the array or if the element of an erray is -1
        {
            if(secretary[index]!= -1) // if the element is not -1, then the key increments by one
            {
                key++;
            }
                index++; // index increments by one
        }
        
        if(key==10)// if all ten elements were valid, a GUI will open and show the results
        {
            Statistics mail = new Statistics(secretary);
            
            DecimalFormat df = new DecimalFormat("######.####");
            
            DisplayGUI display2 = new DisplayGUI();
            display2.setVisible(true);
            ////////////////////////////////////
            
            double rr = mail.getMean();
            double rr2dec = Double.valueOf(df.format(rr));
            display2.setMean(rr2dec);
            
            ////////////////////////////////////
            double dd = mail.getPopStandardDev(); //get population standard deviation and stored in this variable
            double dd2dec= Double.valueOf(df.format(dd)); // number stored is formatted
            display2.setPopStanDev(dd2dec); // number is seen on the screen
        }
        else // If one of the elements wasn't valid, a popUp message will show saying something wrong
        {
            JOptionPane.showMessageDialog(null, "ERROR: \n You entered an inproper input. \n Please check your inputs \n and make sure they're all numeric");
        }

    }

    /*
    Method Name: company()
    Method Inputted: none
    Parameters: none
    Purpose: Holds the whole program together
    Return: none
    Date: 9/5/2017
    */    
    private void company(){ publisher(editor(writer()));}
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBox2 = new javax.swing.JTextField();
        txtBox3 = new javax.swing.JTextField();
        txtBox4 = new javax.swing.JTextField();
        txtBox5 = new javax.swing.JTextField();
        txtBox8 = new javax.swing.JTextField();
        txtBox10 = new javax.swing.JTextField();
        txtBox7 = new javax.swing.JTextField();
        txtBox9 = new javax.swing.JTextField();
        txtBox6 = new javax.swing.JTextField();
        txtBox1 = new javax.swing.JTextField();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        Lbl8 = new javax.swing.JLabel();
        Lbl9 = new javax.swing.JLabel();
        Lbl10 = new javax.swing.JLabel();
        Lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTitle = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInstructions = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 1300));
        setMinimumSize(new java.awt.Dimension(1250, 1300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1250, 1300));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 1300));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 1300));

        txtBox2.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox2.setText("Enter Value");
        txtBox2.setNextFocusableComponent(lbl3);
        txtBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox2FocusGained(evt);
            }
        });
        txtBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox2MouseClicked(evt);
            }
        });

        txtBox3.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox3.setText("Enter Value");
        txtBox3.setNextFocusableComponent(txtBox4);
        txtBox3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox3FocusGained(evt);
            }
        });
        txtBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox3MouseClicked(evt);
            }
        });

        txtBox4.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox4.setText("Enter Value");
        txtBox4.setNextFocusableComponent(txtBox5);
        txtBox4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox4FocusGained(evt);
            }
        });
        txtBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox4MouseClicked(evt);
            }
        });

        txtBox5.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox5.setText("Enter Value");
        txtBox5.setNextFocusableComponent(txtBox6);
        txtBox5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox5FocusGained(evt);
            }
        });
        txtBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox5MouseClicked(evt);
            }
        });

        txtBox8.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox8.setText("Enter Value");
        txtBox8.setNextFocusableComponent(txtBox9);
        txtBox8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox8FocusGained(evt);
            }
        });
        txtBox8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox8MouseClicked(evt);
            }
        });

        txtBox10.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox10.setText("Enter Value");
        txtBox10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox10FocusGained(evt);
            }
        });
        txtBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox10MouseClicked(evt);
            }
        });

        txtBox7.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox7.setText("Enter Value");
        txtBox7.setNextFocusableComponent(txtBox8);
        txtBox7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox7FocusGained(evt);
            }
        });
        txtBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox7MouseClicked(evt);
            }
        });

        txtBox9.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox9.setText("Enter Value");
        txtBox9.setNextFocusableComponent(txtBox10);
        txtBox9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox9FocusGained(evt);
            }
        });
        txtBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox9MouseClicked(evt);
            }
        });

        txtBox6.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox6.setText("Enter Value");
        txtBox6.setNextFocusableComponent(txtBox7);
        txtBox6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox6FocusGained(evt);
            }
        });
        txtBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox6MouseClicked(evt);
            }
        });

        txtBox1.setFont(new java.awt.Font("Tahoma", 2, 21)); // NOI18N
        txtBox1.setText("Enter Value");
        txtBox1.setNextFocusableComponent(txtBox2);
        txtBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBox1FocusGained(evt);
            }
        });
        txtBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBox1MouseClicked(evt);
            }
        });

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl6.setText("#6");

        lbl7.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl7.setText("#7");

        Lbl8.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Lbl8.setText("#8");

        Lbl9.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Lbl9.setText("#9");

        Lbl10.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Lbl10.setText("#10");

        Lbl1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Lbl1.setText("#1");

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl2.setText("#2");

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl3.setText("#3");

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl4.setText("#4");

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl5.setText("#5");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblTitle.setEditable(false);
        lblTitle.setBackground(new java.awt.Color(204, 204, 204));
        lblTitle.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblTitle.setText("Statistics");

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtInstructions.setEditable(false);
        txtInstructions.setBackground(new java.awt.Color(0, 204, 204));
        txtInstructions.setColumns(20);
        txtInstructions.setFont(new java.awt.Font("Courier New", 3, 25)); // NOI18N
        txtInstructions.setRows(5);
        txtInstructions.setText("\n             Please enter a numeric value on each\nbox to compute the mean and Population standard deviation");
        txtInstructions.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(txtInstructions);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl9)
                            .addComponent(Lbl10)
                            .addComponent(Lbl8)
                            .addComponent(lbl7)
                            .addComponent(lbl6))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBox10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBox9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBox8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                        .addComponent(txtBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Lbl1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox1MouseClicked
        txtBox1.setText("");
    }//GEN-LAST:event_txtBox1MouseClicked

    private void txtBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox2MouseClicked
        txtBox2.setText("");
    }//GEN-LAST:event_txtBox2MouseClicked

    private void txtBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox3MouseClicked
        txtBox3.setText("");
    }//GEN-LAST:event_txtBox3MouseClicked

    private void txtBox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox5MouseClicked
        txtBox5.setText("");
    }//GEN-LAST:event_txtBox5MouseClicked

    private void txtBox6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox6MouseClicked
        txtBox6.setText("");
    }//GEN-LAST:event_txtBox6MouseClicked

    private void txtBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox7MouseClicked
        txtBox7.setText("");
    }//GEN-LAST:event_txtBox7MouseClicked

    private void txtBox8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox8MouseClicked
        txtBox8.setText("");
    }//GEN-LAST:event_txtBox8MouseClicked

    private void txtBox9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox9MouseClicked
        txtBox9.setText("");
    }//GEN-LAST:event_txtBox9MouseClicked

    private void txtBox10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox10MouseClicked
        txtBox10.setText("");
    }//GEN-LAST:event_txtBox10MouseClicked

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
         company();
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBox4MouseClicked
         txtBox4.setText("");  
    }//GEN-LAST:event_txtBox4MouseClicked

    private void txtBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox1FocusGained
        txtBox1.setText("");
    }//GEN-LAST:event_txtBox1FocusGained

    private void txtBox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox2FocusGained
        txtBox2.setText("");
    }//GEN-LAST:event_txtBox2FocusGained

    private void txtBox3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox3FocusGained
        txtBox3.setText("");
    }//GEN-LAST:event_txtBox3FocusGained

    private void txtBox4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox4FocusGained
        txtBox4.setText("");
    }//GEN-LAST:event_txtBox4FocusGained

    private void txtBox5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox5FocusGained
        txtBox5.setText("");
    }//GEN-LAST:event_txtBox5FocusGained

    private void txtBox6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox6FocusGained
        txtBox6.setText("");
    }//GEN-LAST:event_txtBox6FocusGained

    private void txtBox7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox7FocusGained
        txtBox7.setText("");
    }//GEN-LAST:event_txtBox7FocusGained

    private void txtBox8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox8FocusGained
        txtBox8.setText("");
    }//GEN-LAST:event_txtBox8FocusGained

    private void txtBox9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox9FocusGained
        txtBox9.setText("");
    }//GEN-LAST:event_txtBox9FocusGained

    private void txtBox10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBox10FocusGained
        txtBox10.setText("");
    }//GEN-LAST:event_txtBox10FocusGained

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        getClear();
    }//GEN-LAST:event_btnClearActionPerformed

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {public void run() {new MainGUI().setVisible(true);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl1;
    private javax.swing.JLabel Lbl10;
    private javax.swing.JLabel Lbl8;
    private javax.swing.JLabel Lbl9;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JTextField lblTitle;
    private javax.swing.JTextField txtBox1;
    private javax.swing.JTextField txtBox10;
    private javax.swing.JTextField txtBox2;
    private javax.swing.JTextField txtBox3;
    private javax.swing.JTextField txtBox4;
    private javax.swing.JTextField txtBox5;
    private javax.swing.JTextField txtBox6;
    private javax.swing.JTextField txtBox7;
    private javax.swing.JTextField txtBox8;
    private javax.swing.JTextField txtBox9;
    private javax.swing.JTextArea txtInstructions;
    // End of variables declaration//GEN-END:variables
}
