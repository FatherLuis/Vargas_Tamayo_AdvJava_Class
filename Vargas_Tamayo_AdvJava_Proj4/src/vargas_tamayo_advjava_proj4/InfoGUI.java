/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj4;

import java.awt.Choice;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Class name: InfoGUI

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Multi-functional GUI, Can display information of a particular Object or Use to Create an Object of a particular type

Date: 10/13/2017

List of changes with dates: none

Special Notes: none

*/ 
public class InfoGUI extends JDialog
{
    private StoreItem item;
    
    /*
    Method Name: InfoGUI()
    Purpose: constructor
    Parameter: none
    Method Input: GUISetUp, PropertytitleSelect()
    Return Value: none
    Date: 10/13/2017
    */ 
    public InfoGUI()
    {
        GUISetUp(); //creates GUI
        
        PropertyTitleSelect(); //sets up the choice component
        
        Panel1.setVisible(false);
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        Panel4.setVisible(false);
        Panel5.setVisible(false);
        Panel6.setVisible(false);
        Panel7.setVisible(false);
        Panel8.setVisible(false);
        Panel9.setVisible(false);

    }
    
    /* 
    Purpose: Makes panels visible and displays label. Used For New Items
    Parameter: String
    Method Input: none
    Return Value:  none
    Date: 10/1/2017
    */ 
    public void setPanel1(String label)
    {
        setLabel1(label);
        Panel1.setVisible(true);
    } 
    public void setPanel2(String label)
    {
        setLabel2(label);
        Panel2.setVisible(true);
    }      
    public void setPanel3(String label)
    {
        setLabel3(label);
        Panel3.setVisible(true);
    }
    public void setPanel4(String label)
    {
        setLabel4(label);
        Panel4.setVisible(true);
    }
    public void setPanel5(String label)
    {
        setLabel5(label);
        Panel5.setVisible(true);
    }
    public void setPanel6(String label)
    {
        setLabel6(label);
        Panel6.setVisible(true);
    }
    public void setPanel7(String label)
    {
        setLabel7(label);
        Panel7.setVisible(true);
    }
    public void setPanel8(String label)
    {
        setLabel8(label);
        Panel8.setVisible(true);
    }
    public void setPanel9(String label)
    {
        setLabel9(label);
        Panel9.setVisible(true);
    
    }
    
/////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////// 
    
    /*
    Purpose: Displays the selected Panel with the label and text. Used for StoreItemShowGUI
    Parameter: String, String (Panel three has String,String,String,String)
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    public void setPanel2(String label, String txt)
    {
        setLabel2(label);
        Panel2.setVisible(true);
        txt2.setText(txt);
        txt2.setEditable(false);

    } 
    public void setPanel3(String label, String txt, String txt2, String txt3)
    {
        setLabel3(label);
        Panel3.setVisible(true);
        txtMonth.setText(txt); txtMonth.setEditable(false);
        txtDay.setText(txt2);  txtDay.setEditable(false);
        txtYear.setText(txt3); txtYear.setEditable(false);

    }
    public void setPanel4(String label, String txt)
    {
        setLabel4(label);
        Panel4.setVisible(true);
        txt4.setText(txt);
        txt4.setEditable(false);

    }
    public void setPanel5(String label, String txt)
    {
        setLabel5(label);
        Panel5.setVisible(true);
        txt5.setText(txt);
        txt5.setEditable(false);

    }
    public void setPanel6(String label, String txt)
    {
        setLabel6(label);
        Panel6.setVisible(true);
        txt6.setText(txt);
        txt6.setEditable(false);

    }
    public void setPanel7(String label, String txt)
    {
        setLabel7(label);
        Panel7.setVisible(true);
        txt7.setText(txt);
        txt7.setEditable(false);

    } 
    public void setPanel8(String label, String txt)
    {
        setLabel8(label);
        Panel8.setVisible(true);
        txt8.setText(txt);
        txt8.setEditable(false);
    }
    public void setPanel9(String label, String txt)
    {
        setLabel9(label);
        Panel9.setVisible(true);
        txt9.setText(txt);
        txt9.setEditable(false);
    }
    
 //////////////////////////////////////////////////////////////////////////   
    
    /*
    Purpose: Sets Labels by the given string
    Parameter: String
    Method Input: none
    Return Value:  none
    Date: 10/1/2017
    */ 
    
    private void setLabel1(String label){this.Label1.setText(label);}
    private void setLabel2(String label){this.Label2.setText(label);}
    private void setLabel3(String label){this.Label3.setText(label);}
    private void setLabel4(String label){this.Label4.setText(label);}
    private void setLabel5(String label){this.Label5.setText(label);}
    private void setLabel6(String label){this.Label6.setText(label);}
    private void setLabel7(String label){this.Label7.setText(label);}
    private void setLabel8(String label){this.Label8.setText(label);}
    private void setLabel9(String label){this.Label9.setText(label);}
    
//////////////////////////////////////////////////////////////////////////    
    
    /*
    Method Name: isNumeric()
    Purpose: Check if string is numeric, 
    Parameter: String
    Method Input:  none
    Return Value: boolean
    Date:  9/7/2017
    */   
    private boolean isNumeric(String term)
    {
        int intInteger=0; // default value of variable
        boolean blnKey = true; // boolean controller
        
        try // will try to parse the String to an Integer
        {
            intInteger = Integer.parseInt(term);
        } 
        catch(NumberFormatException ex) // if string is not an integer, the return will be false
        {
            blnKey = false;   
        }
       
        return blnKey;
    }
    
    /*
    Method Name:  PropertyTitleSelect()
    Purpose:  SetUp for the choice Box.
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void PropertyTitleSelect()
    {
        chPropertyTitle.add("Select Property Title...");
        chPropertyTitle.add("Book");
        chPropertyTitle.add("Movie");
        chPropertyTitle.add("Painting");
    }
 
    /*
    Method Name: unEditable()
    Purpose: Disable the ability to write on Part I of the TextBoxes
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void unEditale()
    {
        chPropertyTitle.setEnabled(false);
        txt2.setEditable(false);
        txtMonth.setEditable(false);
        txtDay.setEditable(false);
        txtYear.setEditable(false);
        txt4.setEditable(false);
        txt5.setEditable(false);

        
    
    }
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
    
    /*
    Method Name: getObj()
    Purpose: Allows the outside GUI to retrieve the object created in this GUI
    Parameter: none
    Method Input:none
    Return Value: StoreItem
    Date: 10/1/2017
    */ 
    public StoreItem getObj()
    { 
        return item;
    }
    
    /*
    Method Name: setTitle
    Purpose: sets GUI Title
    Parameter: String
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    @Override
   public void setTitle(String title){lblTitle.setText(title);}
        
    /*
    Method Name: setBtnName
    Purpose: sets the text of the btn
    Parameter: String
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    public void setBtnName(String name){ActButton.setText(name);}
    
///////////////////////////////////////////////////////////////////////////   
//////////////////////////////////////////////////////////////////////////
 
    /*
    Method Name: ExtendInfo()
    Purpose: opens more Panels for elected StoreItem to complete the creation of the object
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void ExtendInfo()
    {
        switch(chPropertyTitle.getSelectedItem())
        {
            case"Book":
                unEditale();

                setPanel6("Enter Title of Book:");
                setPanel7("Enter Genre:");
                Panel6.setVisible(true);
                Panel7.setVisible(true);
                
                
                
                
                break;
            case"Movie":
                
                unEditale();
                
                setPanel6("Enter Movie Title:");
                setPanel7("Enter Director name:");
                setPanel8("Enter number of Male Actors");
                setPanel9("Enter number of Female Actresses");
                
                Panel6.setVisible(true);
                Panel7.setVisible(true);
                Panel8.setVisible(true);
                Panel9.setVisible(true);                

                break;
            case"Painting":
                
                unEditale();
                
                setPanel6("Enter Painting Title:");
                setPanel7("Enter height:");
                setPanel8("Enter width:");
                setPanel9("Enter media:");
                
                Panel6.setVisible(true);
                Panel7.setVisible(true);                
                Panel8.setVisible(true);
                Panel9.setVisible(true);
                
                break;
            default:
        
        
        
        }
        
    
    
    }
    
    /*
    Method Name: isDate()
    Purpose: verifies Panel 3 textboxes are numeric
    Parameter: none
    Method Input: none
    Return Value: boolean
    Date: 10/1/2017
    */ 
    private boolean isDate()
    {
        boolean key = false;
        
        if(isNumeric(txtMonth.getText()) && isNumeric(txtDay.getText()) & isNumeric(txtYear.getText()))
        {
                    
            Date date= new Date(txtMonth.getText(),txtDay.getText(),txtYear.getText());
        
            if(date.validateDate())
            {
                key = true;
            }
        }
        
        return key;
    }
       
    /*
    Method Name: infoCheck()
    Purpose: Verifies information in the general section is correct
    Parameter: none
    Method Input: isDate(), isNumeric(),
    Return Value: boolean
    Date: 10/1/2017
    */ 
    private boolean infoCheck()
    {
        boolean key = false;
        
        if(chPropertyTitle.getSelectedIndex() != 0)
        {
            String dia =txtMonth.getText() +"/"+txtDay.getText()+"/"+txtYear.getText();
            
            if(isDate())
            {
                if(isNumeric(txt4.getText()))
                {
                    if(isNumeric(txt5.getText()))
                    {
                        key=true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Only numeric inputs are allowed for Asking Price"); 
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Only numeric inputs are allowed for Price Acquired");
                }
            
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Date Format");

            }
        }
        else
        {
            key= false;
            JOptionPane.showMessageDialog(null,"Please select the item type");  
        }

        return key;
    }
    
    /*
    Method Name: infoCheckPartII()
    Purpose: Verifies information in the extended Info section is correct
    Parameter: none
    Method Input: isNumeric()
    Return Value: boolean
    Date: 10/1/2017
    */ 
    private boolean infoCheckPartII()
    {
        boolean key = false;
        switch(chPropertyTitle.getSelectedItem())
        {
            case"Book":
                
                if(!(txt6.getText().isEmpty()))
                {
                    if(!(txt7.getText().isEmpty()))
                    {
                        key=true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please enter a genre for the book");
                    }
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter A title for the book");
                }
                
                
                break;
            case"Movie":
                              
                if(!(txt6.getText().isEmpty()))
                {
                    if(!(txt7.getText().isEmpty()))
                    {
                        if(isNumeric(txt8.getText()))
                        {                                  
                            if(isNumeric(txt9.getText()))
                            {
                                key=true;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Please enter an integer for number of actresses");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Please enter an integer for number of actors");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please enter the name of the director of the movie");
                    }
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter a title for the movie");
                }
                
                break;
            case"Painting":
                              
                if(!(txt6.getText().isEmpty()))
                {
                    if(isNumeric(txt7.getText()))
                    {
                        if(isNumeric(txt8.getText()))
                        {
                            if(!(txt9.getText().isEmpty()))
                            {
                                key=true;
                            }
                            else
                            {   
                                JOptionPane.showMessageDialog(null,"Please enter the media of the painting");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Please enter an integer for the width");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Please enter an integer for the height");
                    }
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please enter A title for the Painting");
                }
                

                break;
        
        
        
        
        
        }
    
    
    
    
        return key;
    }
        
    /*
    Method Name: control()
    Purpose: Controls how the button will work depending on the textname of the Button
    Parameter: none
    Method Input: infoCheck(), infoCheckPartII,
    Return Value: none
    Date: 10/1/2017
    */ 
    private void control()
    {
        if(ActButton.getText().equals("Continue"))
        {
            if(infoCheck()==true)
            {
                ActButton.setText("Create");
                ExtendInfo();
            }
        }
        else if(ActButton.getText().equals("Create"))
        {
            if(infoCheckPartII() == true)
            {
                
                    String author = txt2.getText();  
                    
                    Date dateAcquired = new Date(txtMonth.getText(),txtDay.getText(),txtYear.getText());
                    int purchasePrice = Integer.parseInt(txt4.getText());
                    int askingPrice = Integer.parseInt(txt5.getText());
            
                switch(chPropertyTitle.getSelectedItem())
                {
                    case "Book":
                    
                       String title=txt6.getText();
                       String genre = txt7.getText();
                    
                    
                    
                       item = new Book(title,author,dateAcquired,purchasePrice,askingPrice,genre);
                    
                        break;
                    case "Movie":
                    
                        String title2 = txt6.getText();
                    
                        String director = txt7.getText();
                                    
                        String[] actors= new String[Integer.parseInt(txt8.getText())];
                    
                        String[] actresses = new String[Integer.parseInt(txt9.getText())];
                        
                        int j=1;
                    
                        for(int i=0;i<Integer.parseInt(txt8.getText());i++)
                        {
                            actors[i]= JOptionPane.showInputDialog(null,j+". Enter male actor's name");
                            j++;
                        }
                    
                        j=1;
                        for(int i=0;i<Integer.parseInt(txt9.getText());i++)
                        {
                            actresses[i]= JOptionPane.showInputDialog(null,j+". Enter female actress name");
                            j++;
                        }
                    
                        item = new Movie(title2,author,dateAcquired,purchasePrice,askingPrice,director,actors,actresses);
                    
                        break;
                    case "Painting":
                    
                        String title1 = txt6.getText();
                        int height=Integer.parseInt(txt7.getText());
                        int width = Integer.parseInt(txt8.getText());
                        String media = txt9.getText();
                    
                        item = new Painting(title1,author,dateAcquired,purchasePrice,askingPrice,height,width,media);
                    
                        break;
            
                }
                
            
        
            }
            
            this.setVisible(false);
        }
        else if(ActButton.getText().equals("Return"))
        {
            this.dispose();
        }
    }


    /*
    Method Name: GUISetUP()
    Purpose: Creates the components that are in the GUI
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/13/2017
    */  
    private void GUISetUp()
    {

        this.setModal(true);
        //this.setTitle("New Store Item");
        this.setSize(800,1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
     
        ListenForButton ActionForButton = new ListenForButton();

        
        mainPanel = new JPanel(new GridLayout(11,1));
        this.add(mainPanel);
        
        lblTitle = new JLabel("Title",JLabel.CENTER);
        mainPanel.add(lblTitle);
        
        
        Label1 = new JLabel("Label1",JLabel.LEADING);
        chPropertyTitle = new Choice();
        Panel1 = new JPanel(new GridLayout(1,2));
        Panel1.add(Label1);
        Panel1.add(chPropertyTitle);
        mainPanel.add(Panel1);
        
        Label2 = new JLabel("Label2",JLabel.LEADING);
        txt2 = new JTextField();
        Panel2 = new JPanel(new GridLayout(1,2));
        Panel2.add(Label2);
        Panel2.add(txt2);
        mainPanel.add(Panel2);
        
        Label3 = new JLabel("Label3",JLabel.LEADING);
        txtMonth =new JTextField();
        txtDay = new JTextField();
        txtYear = new JTextField();
        Panel3 = new JPanel(new GridLayout(1,4));
        Panel3.add(Label3);
        Panel3.add(txtMonth);
        Panel3.add(txtDay);
        Panel3.add(txtYear);
        mainPanel.add(Panel3);
        
        Label4 = new JLabel("Label4",JLabel.LEADING);
        txt4 = new JTextField();
        Panel4 = new JPanel(new GridLayout(1,2));
        Panel4.add(Label4);
        Panel4.add(txt4);
        mainPanel.add(Panel4);
        
        Label5 = new JLabel("Label5",JLabel.LEADING);
        txt5 = new JTextField();
        Panel5 = new JPanel(new GridLayout(1,2));
        Panel5.add(Label5);
        Panel5.add(txt5);
        mainPanel.add(Panel5);
        
        Label6 = new JLabel("Label6",JLabel.LEADING);
        txt6 = new JTextField();
        Panel6 = new JPanel(new GridLayout(1,2));
        Panel6.add(Label6);
        Panel6.add(txt6);
        mainPanel.add(Panel6);
        
        Label7 = new JLabel("Label7",JLabel.LEADING);
        txt7 = new JTextField();
        Panel7 = new JPanel(new GridLayout(1,2));
        Panel7.add(Label7);
        Panel7.add(txt7);
        mainPanel.add(Panel7);
        
        Label8 = new JLabel("Label8",JLabel.LEADING);
        txt8 = new JTextField();
        Panel8 = new JPanel(new GridLayout(1,2));
        Panel8.add(Label8);
        Panel8.add(txt8);
        mainPanel.add(Panel8);
        
        Label9 = new JLabel("Label9",JLabel.LEADING);
        txt9 = new JTextField();
        Panel9 = new JPanel(new GridLayout(1,2));
        Panel9.add(Label9);
        Panel9.add(txt9);
        mainPanel.add(Panel9);
        
        ActButton = new JButton();      
        ActButton.setFont(new java.awt.Font("Tahoma", 0, 30));
        ActButton.setSize(100,25);
        ActButton.addActionListener(ActionForButton);
        mainPanel.add(ActButton);
    
    
    }

   
    /*
    Class name: ListenForButton

    Class Author: Luis E. Vargas Tamayo

    Purpose of the class:  Creates the ActionListener for the buttons in this GUI

    Date: 10/13/2017

    List of changes with dates: none

    Special Notes: none

    */    
    private class ListenForButton implements ActionListener
    {      
        /*
        Method Name: actionPerformed
        Purpose: handles event when button is pressed
        Parameter: ActionEvent
        Method Input: control()
        Return Value: none
        Date: 10/13/2017
        */ 
        public void actionPerformed(ActionEvent evt)
        {

            if(evt.getSource() == ActButton)
            {
                control();               
            }               
        }  
    }


  
    
    
    
    
    
    
    
    
    
    
//Components for GUI
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
    private javax.swing.JButton ActButton;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    
    private java.awt.Choice chPropertyTitle;
    
    private javax.swing.JLabel lblTitle;
    
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtYear;

    private javax.swing.JPanel mainPanel;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
}
