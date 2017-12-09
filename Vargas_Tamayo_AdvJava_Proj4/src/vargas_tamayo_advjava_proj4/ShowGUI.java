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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/*
Class name: ShowGUI

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Displays information of the Selected LinkedList

Date: 10/13/2017

List of changes with dates: none

Special Notes: none

*/ 
public class ShowGUI extends JDialog
{
    LinkedList<Book> book;
    LinkedList<Movie> movie;
    LinkedList<Painting> painting;

    /*
    Method Name: ShowGUI()
    Purpose: Constructor of Class
    Parameter: none
    Method Input: GUISetUp(), PropertyTitleSelect()
    Return Value: none
    Date: 10/1/2017
    */  
    public ShowGUI()
    {
        GUISetUp();
        PropertyTitleSelect();

        CountPanel.setVisible(false);       
  
    }
    
/////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
 
    /*
    Method Name: setBook() 
    Purpose: receives a copy of the book linkList from StoreItemGUI
    Parameter: LinkedList
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */
    public void setBook(LinkedList book){this.book = book;};

    /*
    Method Name: setMovie() 
    Purpose: receives a copy of the movie linkList from StoreItemGUI
    Parameter: LinkedList
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */   
    public void setMovie(LinkedList movie){this.movie = movie;};

    /*
    Method Name: setPainting() 
    Purpose: receives a copy of the Painting linkList from StoreItemGUI
    Parameter: LinkedList
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */  
    public void setPainting(LinkedList painting){this.painting=painting;};
    
    /*
    Method Name: setGUITitle()
    Purpose: sets the title displayed on the GUI
    Parameter:  String
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */
    public void setGUITitle(String Title){lblTitle.setText(Title);}
    
    /*
    Method Name: setBtnName()
    Purpose: sets the name of the button Name
    Parameter: String
    Method Input:none 
    Return Value: none
    Date: 10/1/2017
    */
    public void setBtnName(String btn){this.btnShowItem.setText(btn);}
 
    /*
    Method Name:getLinkBook() 
    Purpose: retrieves the Linkbook from this GUI
    Parameter: none
    Method Input:none
    Return Value: LinkedList<T>
    Date: 10/1/2017
    */   
    public LinkedList<Book> getLinkBook(){return book;}
       
    /*
    Method Name:getLinkBook() 
    Purpose: retrieves the LinkMovie from this GUI
    Parameter: none
    Method Input:none
    Return Value: LinkedList<T>
    Date: 10/1/2017
    */  
    public LinkedList<Movie> getLinkMovie(){return movie;}
    
    /*
    Method Name:getLinkBook() 
    Purpose: retrieves the LinkPainting from this GUI
    Parameter: none
    Method Input:none
    Return Value: LinkedList<T>
    Date: 10/1/2017
    */  
    public LinkedList<Painting> getLinkPainting(){return painting;}
    
    /*
    Method Name: countPanel()
    Purpose: Show count of the number of objects in each Class
    Parameter:  int,int,int
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    
    public void countPanel(int bookCount,int movieCount, int paintingCount)
    {
        CountPanel.setVisible(true);
        
        
        lblBookCount.setText("Book(s): " + book.size());
        lblMovieCount.setText("Movie(s): "+ movie.size());
        lblPaintingCount.setText("Painting(s): " + painting.size());
    }
    

////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////    
    
    /*
    Method Name: PropertyTitleSelect()
    Purpose: set up for the choiceBox, adds the needed selection
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void PropertyTitleSelect()
    {
        chPropertyTitle.add("Selec Property Title...");
        chPropertyTitle.add("Book");
        chPropertyTitle.add("Movie");
        chPropertyTitle.add("Painting");
    }
 
    /*
    Method Name: showSelectControl()
    Purpose: shows the titles of the StoreItems in the selected LinkedList
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void showSelectControl()
    {
        chItemSelect.removeAll(); // deletes anything on the checkbox on Panel2
        
        if(chPropertyTitle.getSelectedIndex()!= 0) //if the selected Class is not empty, then run code
        {
            switch(chPropertyTitle.getSelectedItem()) //depending on the type selected, Panel2 will show up with the objects of the selected Class
            {
                
                case"Book":  //iterates through the LinkedList to get all objects stored
                    
                    if(book.size() > 0)
                    {
                        ListIterator<Book> temp = book.listIterator();

                        do
                        {
                            chItemSelect.add(temp.next().getTitle());
                        
                        } while(temp.hasNext());
                    
                            //CountPanel.setVisible(true); 

                        
                    }
                    else //if no object exist, then message will pop you
                    {
                        JOptionPane.showMessageDialog(null, "There Are No Books");
                    
                    } 
                    break;
                    
                case"Movie":    //iterates through the LinkedList to get all objects stored
                    
                    if(movie.size()>0)
                    {
                    
                        ListIterator<Movie> temp1 = movie.listIterator();
                        do
                        {
                            chItemSelect.add(temp1.next().getTitle());
                        
                        } while(temp1.hasNext());
                    
                            //CountPanel.setVisible(true); 
                    }
                    else //if no object exist, then message will pop you
                    {
                        JOptionPane.showMessageDialog(null, "There Are No Movies");
                    }
                    

                    break;
                    
                case"Painting":  //iterates through the LinkedList to get all objects stored
                    
                    if(painting.size() > 0)
                    {
                    
                    
                    
                    ListIterator<Painting> temp3 = painting.listIterator();
                    
  
                    do
                    {
                        chItemSelect.add(temp3.next().getTitle());
                        
                    } while(temp3.hasNext());
                    
                        //CountPanel.setVisible(true); 
                    }
                    else//if no object exist, then message will pop you
                    {
                        JOptionPane.showMessageDialog(null, "There Are No Paintings");   
                    }
                    break;
            }
        }
        else{CountPanel.setVisible(false);}
        
    }
  
    /*
    Method Name: RegSetUp
    Purpose: Opens the Info GUI from the selected choice from the choice box
    Parameter: String, StoreItem
    Method Input: none
    Return Value: none
    Date: 10/1/2017
    */ 
    private void RegSetUp(String choice, StoreItem temp)
    {
        //InfoGUI will display the information of the selected object  from the linkedlist
        InfoGUI showGUI = new InfoGUI();
                        
        showGUI.setPanel2("Author name:",temp.getAuthor());
        
        showGUI.setPanel3("Date:",temp.getDateAcquired().getMonth(),temp.getDateAcquired().getDay(),temp.getDateAcquired().getYear());              
        showGUI.setPanel4("Price Acquired:",String.valueOf(temp.getPurchasePrice()));                             
        showGUI.setPanel5("Asking Price:",String.valueOf(temp.getAskingPrice()));   
        showGUI.setBtnName("Return");
        
        switch(choice)
        {
            case"Book":
                
                Book book = (Book) temp;
                
                showGUI.setTitle("Book: "+temp.getTitle());                            
                showGUI.setPanel6("Title of Book:",temp.getTitle());
                showGUI.setPanel7("Genre:",book.getGenre());
                break;
            case"Movie":
                
                Movie movie = (Movie) temp;
                
                showGUI.setTitle("Movie: "+ movie.getTitle());
                showGUI.setPanel6("Movie Title:",movie.getTitle());
                showGUI.setPanel7("Director name:",movie.getDirector());
                showGUI.setPanel8("Actor Names:",Arrays.toString(movie.getActors()));
                showGUI.setPanel9("Actresses Name:",Arrays.toString(movie.getActresses()));
                break;
            case"Painting":
                
                Painting painting = (Painting) temp;
                
                showGUI.setTitle("Painting: "+painting.getTitle());
                showGUI.setPanel6(" Painting Title:",painting.getTitle());
                showGUI.setPanel7(" height:",String.valueOf(painting.getHeight()));
                showGUI.setPanel8(" width:",String.valueOf(painting.getWidth()));
                showGUI.setPanel9(" media:",painting.getMedia()); 
                break;
                

        }
                      
        showGUI.setVisible(true);      
        //showGUI.setModal(true);
    
        
        

    }
   
    /*
    Method Name: showItem()
    Purpose: Gathers the information to create the GUI to display the information from selection 
    Parameter: none
    Method Input: regSetUp()
    Return Value: none
    Date: 10/1/2017
    */ 
    private void showItem()
    {
        boolean key= false;
        int i = 0;
        
        if(chPropertyTitle.getSelectedIndex()!= 0)
        {
            switch(chPropertyTitle.getSelectedItem())
            {
                case"Book":
                    
                    i=0;
                    ListIterator<Book> nextBook = book.listIterator();                   
                    Book temp = book.getFirst();
                        do
                        { 
                            if(i>0)
                            {
                                temp = nextBook.next();
                            }
                            if(chItemSelect.getSelectedItem().equals(temp.getTitle())) //iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                RegSetUp("Book",temp);
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp.getTitle())) && key!=true);

                    break;
                case"Movie":   
                    
                    i=0;
                    ListIterator<Movie> nextMovie = movie.listIterator();                   
                    Movie temp1 = movie.getFirst();
                        do
                        {
                                                        
                            if(i>0)
                            {
                                temp1 = nextMovie.next();
                            }
                            
                            
                            
                            if(chItemSelect.getSelectedItem().equals(temp1.getTitle())) //iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                RegSetUp("Movie",temp1);
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp1.getTitle())) && key!=true);
 

                    break;
                case"Painting": 

                    ListIterator<Painting> nextPainting = painting.listIterator();                   
                    Painting temp3 = painting.getFirst();
                    
                        i = 0;
                        do
                        {
                            if(i>0)
                            {
                                temp3 = nextPainting.next();
                            }
                            
                            if(chItemSelect.getSelectedItem().equals(temp3.getTitle()))//iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                RegSetUp("Painting",temp3);
                            }
                            else
                            {
                                 i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp3.getTitle())) && key!=true);
 
        }
    
    
    
    }
    }
     
    /*
    Method Name: deleteItem()
    Purpose: Deletes selected Item from the LinkedList
    Parameter: none
    Method Input:none
    Return Value: none
    Date: 10/1/2017
    */   
    private void deleteItem()
    {
        boolean key=false;
        int i = 0;
        
        switch (chPropertyTitle.getSelectedItem())
        {
            case "Book":     
                i=0;
                        
                    ListIterator<Book> nextBook = book.listIterator();                   
                    Book temp = book.getFirst();
                        do
                        { 
                            if(i>0)
                            {
                                temp = nextBook.next();
                            }
                            
                            if(chItemSelect.getSelectedItem().equals(temp.getTitle())) //iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                book.remove(temp); //LinkedList looks for the object and deletes it from the Linkedlist
  
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp.getTitle())) && key!=true);

                break;
            case "Movie":
                 i=0;
                        
                    ListIterator<Movie> nextMovie = movie.listIterator();                   
                    Movie temp1 = movie.getFirst();
                        do
                        { 
                            if(i>0)
                            {
                                temp1 = nextMovie.next();
                            }
                            
                            if(chItemSelect.getSelectedItem().equals(temp1.getTitle()))//iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                movie.remove(temp1);//LinkedList looks for the object and deletes it from the Linkedlist
  
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp1.getTitle())) && key!=true);
                
                
                
                break;
            case "Painting":
                i=0;
                        
                    ListIterator<Painting> nextPainting = painting.listIterator();                   
                    Painting temp2 = painting.getFirst();
                        do
                        { 
                            if(i>0)
                            {
                                temp2 = nextPainting.next();
                            }
                            
                            if(chItemSelect.getSelectedItem().equals(temp2.getTitle()))//iterates through te LinkedList until the selected object from the choice box is matched
                            {
                                key=true;
                                painting.remove(temp2); //LinkedList looks for the object and deletes it from the Linkedlist
  
                            }
                            else
                            {
                                i++;
                            }
                            
                        }while(!(chItemSelect.getSelectedItem().equals(temp2.getTitle())) && key!=true);                
                
                break;
            default:
                //should never come here
        }
        
        this.setVisible(false);
    
    
    
    

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
        setModal(true);
        this.setTitle("Show Inventory ");
        this.setSize(800,1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        
        ListenForButton ActionForButton = new ListenForButton(); 
        ListenForItemStateChange ItemChange = new ListenForItemStateChange();
        
        mainPanel = new JPanel(new GridLayout(4,1));
        this.add(mainPanel);
        
        lblTitle = new JLabel("Show Inventory", JLabel.CENTER);
        Panel1 = new JPanel(new GridLayout(1,1));
        Panel1.add(lblTitle);
        mainPanel.add(Panel1);
        
        lblBookCount = new JLabel("Book Count:");
        lblMovieCount = new JLabel("Movie Count:");
        lblPaintingCount = new JLabel("Painting Count:");
        CountPanel = new JPanel(new GridLayout(1,3));
        CountPanel.add(lblBookCount);
        CountPanel.add(lblMovieCount);
        CountPanel.add(lblPaintingCount);
        mainPanel.add(CountPanel);
        
        chPropertyTitle = new Choice();
        chPropertyTitle.addItemListener(ItemChange);
        Label1 = new JLabel("Show Inventory");
        Panel3 = new JPanel(new GridLayout(1,2));
        Panel3.add(Label1);
        Panel3.add(chPropertyTitle);
        mainPanel.add(Panel3);
        
        chItemSelect = new Choice();
        btnShowItem = new JButton("Show Item");
        btnShowItem.addActionListener(ActionForButton);
        Panel4 = new JPanel(new GridLayout(2,1));
        Panel4.add(chItemSelect);
        Panel4.add(btnShowItem);
        mainPanel.add(Panel4);

    }
   
    /*
    Class name: ListenForButton

    Class Author: Luis E. Vargas Tamayo

    Purpose of the class: Creates the ActionListener for the Button in this GUI

    Date: 10/13/2017

    List of changes with dates: none

    Special Notes: none

     */
    private class ListenForButton implements ActionListener
    {    
        /*
        Method Name: actionPerformed
        Purpose: handles the event when button is pressed/clicked
        Parameter: ActionEvent
        Method Input:none
        Return Value: none
        Date: 10/1/2017
        */  
        public void actionPerformed(ActionEvent evt)
        {
            if(evt.getSource() == btnShowItem)
            {

                if(btnShowItem.getText().equals("Show Item"))
                {
                    showItem();     
                }
                else if(btnShowItem.getText().equals("Sell"))
                {
                    deleteItem();
                } 
            }                
        }  
          
    }

    /*
    Class name: ListenForItemStateChange

    Class Author: Luis E. Vargas Tamayo

    Purpose of the class: Creates the ItemListener for the Choice component in this GUI

    Date: 10/13/2017

    List of changes with dates: none

    Special Notes: none

    */    
    private class ListenForItemStateChange implements ItemListener
    {
        /*
        Method Name: itemStateChanged
        Purpose: handles the event of the choice component
        Parameter: ItemEvent
        Method Input: showSelectControl()
        Return Value: none
        Date: 10/13/2017
        */  
        public void itemStateChanged(ItemEvent evt)
        {
            showSelectControl();   
        }  
    }
    
    
    
    
    
 //GUI Components   
/////////////////////////////////////////////////////////////////////    
    private javax.swing.JPanel CountPanel;
    private javax.swing.JLabel Label1;
    
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    
    private javax.swing.JButton btnShowItem;
    private java.awt.Choice chItemSelect;
    private java.awt.Choice chPropertyTitle;
    private javax.swing.JLabel lblBookCount;
    private javax.swing.JLabel lblMovieCount;
    private javax.swing.JLabel lblPaintingCount;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
 /////////////////////////////////////////////////////////////////////////   
}
