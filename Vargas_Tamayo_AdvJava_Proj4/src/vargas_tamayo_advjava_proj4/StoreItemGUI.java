/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj4;

import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;





/*
Class name: StoreItemGUI

Class Author: Luis E. Vargas Tamayo

Purpose of the class: The main GUI that the user will Interact to manuvuer in the program

Date: 10/13/2017

List of changes with dates: none

Special Notes: none

*/ 
public class StoreItemGUI extends JFrame
{   
    LinkedList<Book> linkBook; //holds items of book
    LinkedList<Movie> linkMovie; // holds item of movie
    LinkedList<Painting> linkPainting; // holds item of painting

    
    /*
    Method Name: StoreItemGUI()
    Purpose: Creates the components that are in the GUI
    Parameter: none
    Method Input: GUISetUP(),setUp()
    Return Value: none
    Date: 10/13/2017
    */
    public StoreItemGUI()
    {
        GUISetUp();
        setUp();        
        
        
    }
  
    /*
    Method Name: setUp()
    Purpose: Makes three objects that are stored in their perspective Linkedlist
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */    
    private void setUp()
    {
        linkBook= new LinkedList<Book>(); //holds items of book
        linkMovie= new LinkedList<Movie>(); // holds item of movie
        linkPainting= new LinkedList<Painting>(); // holds item of painting
        
        
        Date date = new Date("7","15","1998");
        
        StoreItem book = new Book("A New Life","Luis Vargas",date,25,10,"Horror");
        linkBook.add((Book) book);
        
        Movie movie = new Movie();
        movie.setTitle("A New Beginning");
        movie.setAuthor("Luis Vargas");
        movie.setDateAcquired(date);
        movie.setPurchasePrice(45);
        movie.setAskingPrice(60);
        movie.setDirector("Luis Vargas");
        String[] arr ={"Jack Murphy","Nero Macro","Mario Curry"};
        String[] grr = {"Alicia Perez, Malice Rose","Nena Moore"};
        movie.setActors(arr);
        movie.setActresses(grr);
        linkMovie.add(movie);
        
        Painting paint = new Painting();
        paint.setTitle("La Casa");
        paint.setAuthor("Luis Vargas");
        paint.setDateAcquired(date);
        paint.setPurchasePrice(500);
        paint.setAskingPrice(800);
        paint.setHeight(4);
        paint.setWidth(7);
        paint.setMedia("charcol");
        linkPainting.add(paint);

        
    
    
    
    }

    /*
    Method Name: NewItemGUI()
    Purpose: Creates the InfoGUI that will allow users to create their selected object
    Parameter: none
    Method Input: storeObject()
    Return Value: none
    Date: 10/1/2017
    */      
    public void NewItemGUI()
    {
        
        InfoGUI newItem = new InfoGUI(); // creates GUI
        newItem.setModal(true); // sets modal... doesnt allow any other GUI to be touched
       
        //setting up the GUI
        newItem.setTitle("New Item");
        newItem.setBtnName("Continue");
        
        newItem.setPanel1("Select the item Type:");
        newItem.setPanel2("Enter the Author name:");
        newItem.setPanel3("Enter Date (MM/DD/YYYY):");
        newItem.setPanel4("Enter Price Acquired:");
        newItem.setPanel5("Enter Asking Price:");
        newItem.setVisible(true);
        
        //When the InfoGUI closes, if an object was created, then it will be stored, otherwise ignored
        if(newItem.getObj()!=null)
        {
            
            StoreObject(newItem.getObj());
            
            newItem.dispose();
        }

    } 
  
    /*
    Method Name: ShowItemGUI()
    Purpose: creates the StoreItemShowGUI that will allow users to view all the objects stored in the LinkedList
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */     
    public void ShowItemGUI()
    {
        ShowGUI showGUI = new ShowGUI();
        
        showGUI.setBook(linkBook);
        showGUI.setMovie(linkMovie);
        showGUI.setPainting(linkPainting);
        
        showGUI.countPanel(linkBook.size(), linkMovie.size(), linkPainting.size());
        
        
        
        showGUI.setVisible(true);
        

    }
    
    /*
    Method Name:SellItemGUI()
    Purpose: Creates a StoreItemShowGUI that will allow users to "Sell" the items in the Inventory
    Parameter: Sell
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */     
    public void SellItemGUI()
    {
                
        ShowGUI sellGUI = new ShowGUI();
        
        
        sellGUI.setBtnName("Sell");
        sellGUI.setGUITitle("Sell Item");
        
        sellGUI.setBook(linkBook);
        sellGUI.setMovie(linkMovie);
        sellGUI.setPainting(linkPainting);
        
        sellGUI.setVisible(true);   
        
        linkBook= sellGUI.getLinkBook();
        linkMovie = sellGUI.getLinkMovie();
        linkPainting = sellGUI.getLinkPainting();
        
         
        sellGUI.dispose();
    }
 
    /*
    Method Name: StoreObject()
    Purpose: Collects the new Object created by the InfoGUI and stores it on its perspective Linkedlist 
    Parameter: StoreItem
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */    
    private void StoreObject(StoreItem obj)
    {
        switch (obj.getClass().getSimpleName()) //name  of the Obj Class will be received and compared to store the Obj in the right LinkedList
        {
            
            case "Book":
                linkBook.add((Book) obj);   
              
                break;
            case "Movie":
                linkMovie.add((Movie) obj);
                break;
            case "Painting":
                linkPainting.add((Painting) obj);
                break;
            default:
                //should never come here
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
        this.setTitle("Store Item ");
        this.setSize(800,1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel = new JPanel(new GridLayout(4,1));
        this.add(mainPanel);
        
        ListenForButton ActionForButton = new ListenForButton();
        
        
        btnNewItem = new JButton("New Item");
        btnNewItem.setFont(new Font("Tahoma", 0, 30));
        btnNewItem.setSize(100, 25);
        btnNewItem.addActionListener(ActionForButton);
        mainPanel.add(btnNewItem);
        
        
        btnSellItem = new JButton("Sell Item");    
        btnSellItem.setFont(new java.awt.Font("Tahoma", 0, 30));
        btnSellItem.setSize(100, 25);
        btnSellItem.addActionListener(ActionForButton);
        mainPanel.add(btnSellItem);
        
        
        btnShowInventory = new JButton("Show Inventory"); 
        btnShowInventory.setFont(new java.awt.Font("Tahoma", 0, 30));
        btnShowInventory.setSize(100, 25);
        btnShowInventory.addActionListener(ActionForButton);
        mainPanel.add(btnShowInventory);
        
        
        btnExit = new JButton("Exit"); 
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 30));
        btnExit.setSize(100,25);
        btnExit.addActionListener(ActionForButton);
        mainPanel.add(btnExit);

    }
 
 
    /*
    Class name: ListenForButton

    Class Author: Luis E. Vargas Tamayo

    Purpose of the class: Creates the event handler for buttons

    Date: 10/13/2017

    List of changes with dates: none

    Special Notes: none

    */        
    private class ListenForButton implements ActionListener
    {
        /*
        Method Name: actionedPerformed
        Purpose: handles the event of the button component
        Parameter: ItemEvent
        Method Input: newItemGUI(),SellItemGUI(),ShowItemGUI()
        Return Value: none
        Date: 10/13/2017
        */          
        public void actionPerformed(ActionEvent evt)
        {
            if(evt.getSource() == btnNewItem)
            {
                NewItemGUI();
            }          
            else if(evt.getSource() == btnSellItem)
            {
                SellItemGUI();
            }            
            else if(evt.getSource() == btnShowInventory)
            {
                ShowItemGUI();
            }
            else if(evt.getSource() == btnExit)
            { 
               System.exit(0);
            }
            
        }  
    }

    
    public static void main(String[] arg)
    {
        StoreItemGUI mainGUI = new StoreItemGUI(); 
        mainGUI.setVisible(true);
    }
  
    
    //GUI Components
/////////////////////////////////////////////////////////////////////////////////////////////////    
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewItem;
    private javax.swing.JButton btnSellItem;
    private javax.swing.JButton btnShowInventory;
    private javax.swing.JTextField btnStoreInventory;
    private javax.swing.JPanel mainPanel;
   
//////////////////////////////////////////////////////////////////////////////////////////////////    
    
}





    

