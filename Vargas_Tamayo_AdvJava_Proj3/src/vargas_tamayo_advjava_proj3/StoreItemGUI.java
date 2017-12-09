/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj3;
import java.util.LinkedList;
import javax.swing.JDialog;

/*
Class name: StoreItemGUI

Class Author: Luis E. Vargas Tamayo

Purpose of the class: The main GUI that the user will Interact to manuvuer in the program

Date: 10/1/2017

List of changes with dates: none

Special Notes: none

*/ 
public class StoreItemGUI extends javax.swing.JFrame {

    LinkedList<Book> linkBook; //holds items of book
    LinkedList<Movie> linkMovie; // holds item of movie
    LinkedList<Painting> linkPainting; // holds item of painting
    
    
    /*
    Method Name: StoreItemGUI() 
    Purpose: Create GUI
    Parameter: none
    Method Input: initComponents(), setUp()
    Return Value: none
    Date: 10/1/2017
    */
    public StoreItemGUI() 
    {
        initComponents();
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
        
        InfoGUI newItem = new InfoGUI(this,true);
        newItem.setModal(true);
       
        //setting up the GUI
        newItem.setTitle("New Item");
        newItem.setBtnName("Continue");
        
        newItem.setPanel1("Select the item Type:");
        newItem.setPanel2("Enter the Author name:");
        newItem.setPanel3("Enter Date:");
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
        StoreItemShowGUI showGUI = new StoreItemShowGUI(null,true);
        
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
                
        StoreItemShowGUI sellGUI = new StoreItemShowGUI(null,true);
        
        
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


    
    
    
     
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStoreInventory = new javax.swing.JTextField();
        lblSellItem = new javax.swing.JButton();
        lblShowInventory = new javax.swing.JButton();
        lblExit = new javax.swing.JButton();
        lblNewItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 1300));
        setMinimumSize(new java.awt.Dimension(1250, 1300));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(1250, 1300));
        jPanel1.setMinimumSize(new java.awt.Dimension(1250, 1300));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        lblStoreInventory.setEditable(false);
        lblStoreInventory.setBackground(new java.awt.Color(255, 153, 153));
        lblStoreInventory.setFont(new java.awt.Font("Imprint MT Shadow", 0, 90)); // NOI18N
        lblStoreInventory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblStoreInventory.setText("Store Inventory");
        lblStoreInventory.setBorder(null);

        lblSellItem.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lblSellItem.setText("Sell Item");
        lblSellItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSellItemActionPerformed(evt);
            }
        });

        lblShowInventory.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lblShowInventory.setText("Show Inventory");
        lblShowInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblShowInventoryActionPerformed(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lblExit.setText("Exit");
        lblExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblExitActionPerformed(evt);
            }
        });

        lblNewItem.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lblNewItem.setText("New Item");
        lblNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNewItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblStoreInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShowInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSellItem, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(446, 446, 446))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblStoreInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(lblNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(lblSellItem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(lblShowInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_lblExitActionPerformed

    private void lblNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNewItemActionPerformed

        NewItemGUI();
        
        
    }//GEN-LAST:event_lblNewItemActionPerformed

    private void lblSellItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSellItemActionPerformed

        SellItemGUI();
       
        
    }//GEN-LAST:event_lblSellItemActionPerformed

    private void lblShowInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblShowInventoryActionPerformed
        ShowItemGUI();
    }//GEN-LAST:event_lblShowInventoryActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(StoreItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreItemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreItemGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lblExit;
    private javax.swing.JButton lblNewItem;
    private javax.swing.JButton lblSellItem;
    private javax.swing.JButton lblShowInventory;
    private javax.swing.JTextField lblStoreInventory;
    // End of variables declaration//GEN-END:variables
}
