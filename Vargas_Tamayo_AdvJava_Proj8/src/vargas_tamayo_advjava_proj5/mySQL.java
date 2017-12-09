/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/*
Class name: mySQL

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Connect to a server database and load data to project and save changes to database

Date: 12/7/2017

List of changes with dates: none

Special Notes: none

*/
public class mySQL 
{
    static final String DATABASE_URL = "jdbc:sqlserver://CTASV20R2DRW.tamuct.edu;databaseName=INVENTORY;user=Luisvargas;password=Tamayo005;";
    
    /*
    Method Name: delSQL()
    Purpose: Deletes objects from database
    Parameter: none
    Method Input: none
    Return Value:none
    Date: 12/7/2017
    */ 
    public void DelSQL()
    {
        System.out.println("I am running");
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Driver d = (Driver)Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
            //connection = DriverManager.getConnection(DATABASE_URL,"TestClass","Pinzgauer11");
            connection = DriverManager.getConnection(DATABASE_URL);  
            
            //System.out.println("I am ready to DELETE");
            
            statement = (Statement)connection.createStatement();
            
            String deleteAllB = "DELETE FROM INVENTORY.db_owner.TableBook";
            statement.execute(deleteAllB);
            
            String deleteAllM = "DELETE FROM INVENTORY.db_owner.TableMovie";
            statement.execute(deleteAllM);
            
            String deleteAllP = "DELETE FROM INVENTORY.db_owner.TablePainting";
            statement.execute(deleteAllP);
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Exception   " + ex.getMessage());
        }
       catch (ClassNotFoundException ex) {
           System.out.println("Class Not Found  "+ ex.getMessage());
       }

        finally
        {
            try
            {
                connection.close(); 
                //System.out.println("Successful Deletion");
            }
            catch(Exception ex)
            {
                System.out.println("Close;");
            }
        }        
    }
 
    /*
    Method Name: writeSQL
    Purpose: write storeitem object to database
    Parameter: StoreItem
    Method Input: strToDate()
    Return Value: Date
    Date: 12/7/2017
    */     
    public void writeSQL(StoreItem obj)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Driver d = (Driver)Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
            //connection = DriverManager.getConnection(DATABASE_URL,"TestClass","Pinzgauer11");
            connection = DriverManager.getConnection(DATABASE_URL);  
            
            System.out.println("I am connected and Ready to Write");
            
            statement = (Statement)connection.createStatement();
                  
            String insert;
            
            switch (obj.getClass().getSimpleName()) //name  of the Obj Class will be received and compared to store the Obj in the right LinkedList
            {     
                case "Book":
                    
                    Book objBook = (Book)obj;
                    
                    String BTitle = "'" + objBook.getTitle() + "'";
                    String BAuthor = "'" + objBook.getAuthor() + "'";
                    String BDateAcquired = "'" + objBook.getDateAcquired().toString() + "'";   
                    int BPurchasePrice = objBook.getPurchasePrice();
                    int BAskingPrice = objBook.getAskingPrice();
                    String BGenre = "'" + objBook.getGenre() + "'";
                    
                    //INVENTORY IS MY DATABASE; TABLEBOOK IS MY TABLE; THE NAMES IN THE PARANTHESIS ARE THE NAME OF MY COLUMNS;
                    insert = "INSERT INTO INVENTORY.db_owner.TableBook(Title,Author,DateAcquired,PurchasePrice,AskingPrice,Genre) "
                            + "VALUES(" + BTitle + "," + BAuthor + "," + BDateAcquired + "," +BPurchasePrice + "," + BAskingPrice + "," + BGenre + ");";
                    
                    statement.executeUpdate(insert);
            
                    System.out.println("Book Sucessful");
                    break;
                    
                case "Movie":
                    
                    Movie objMovie = (Movie)obj;
                    
                    String MTitle = "'" + objMovie.getTitle() + "'";
                    String MAuthor = "'" + objMovie.getAuthor() + "'";
                    String MDateAcquired = "'" + objMovie.getDateAcquired().toString() + "'";   
                    int MPurchasePrice = objMovie.getPurchasePrice();
                    int MAskingPrice = objMovie.getAskingPrice();
                    String MDirector = "'" + objMovie.getDirector() + "'";
                    String MActor = "'" + arrToStr(objMovie.getActors()) + "'";
                    String MActress = "'" + arrToStr(objMovie.getActresses()) + "'";
                    
                    //INVENTORY IS MY DATABASE; TABLEBOOK IS MY TABLE; THE NAMES IN THE PARANTHESIS ARE THE NAME OF MY COLUMNS;
                    insert = "INSERT INTO INVENTORY.db_owner.TableMovie(Title,Author,DateAcquired,PurchasePrice,AskingPrice,Director,Actor,Actress) "
                            + "VALUES(" + MTitle + "," + MAuthor + "," + MDateAcquired + "," +MPurchasePrice + "," + MAskingPrice + "," + MDirector + "," + MActor + "," + MActress + ");";
                    
                    statement.executeUpdate(insert);
            
                    System.out.println("Movie Sucessful");                   

                    break;
                case "Painting":
                    
                    Painting objPainting = (Painting)obj;
                    
                    String PTitle = "'" + objPainting.getTitle() + "'";
                    String PAuthor = "'" + objPainting.getAuthor() + "'";
                    String PDateAcquired = "'" + objPainting.getDateAcquired().toString() + "'";   
                    int PPurchasePrice = objPainting.getPurchasePrice();
                    int PAskingPrice = objPainting.getAskingPrice();
                    int PHeight = objPainting.getHeight();
                    int PWidth = objPainting.getWidth();
                    String PMedia = "'" + objPainting.getMedia() + "'";
                    
                    //INVENTORY IS MY DATABASE; TABLEBOOK IS MY TABLE; THE NAMES IN THE PARANTHESIS ARE THE NAME OF MY COLUMNS;
                    insert = "INSERT INTO INVENTORY.db_owner.TablePainting(Title,Author,DateAcquired,PurchasePrice,AskingPrice,Height,Width,Media) "
                            + "VALUES(" + PTitle + "," + PAuthor + "," + PDateAcquired + "," +PPurchasePrice + "," + PAskingPrice + "," + PHeight + "," +PWidth + "," + PMedia +");";
                    
                    statement.executeUpdate(insert);
            
                    System.out.println("Painting Sucessful");
                    break;                    
                default:  
            }     
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Exception   " + ex.getMessage());
        }
       catch (ClassNotFoundException ex) {
           System.out.println("Class Not Found  "+ ex.getMessage());
       }

        finally
        {
            try
            {

                connection.close();
                
                System.out.println("Successful Run");
            }
            catch(Exception ex)
            {
                System.out.println("Close;");
            }
        }
    }
    
    /*
    Method Name: loadSQL()
    Purpose: loads database objects to the program
    Parameter: none
    Method Input: arrToStr()
    Return Value: ArrayList
    Date: 12/7/2017
    */ 
    public ArrayList loadSQL()
    {   
        ArrayList<StoreItem> arrStore = new ArrayList();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ResultSetMetaData metaData = null;
        int numberOfColumns;
        StoreItem obj;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(DATABASE_URL);  
            
            System.out.println("I am connected and ready to Load Data");
            statement = (Statement)connection.createStatement();
                  
            String LOADQUERY;
            
            
            ///////////////////////////////////////////////////////// ADD BOOK
            
            LOADQUERY = "SELECT Title,Author,DateAcquired,PurchasePrice,AskingPrice,Genre FROM INVENTORY.db_owner.TableBook";
            resultSet = statement.executeQuery(LOADQUERY);
            metaData = resultSet.getMetaData();
            numberOfColumns = metaData.getColumnCount();
            
            
            while(resultSet.next())
            {
                String BTitle = null;
                String BAuthor = null;
                Date BDateAcq = null;
                int BPurchasePrice = 0;
                int BAskPrice = 0;
                
                Book bObj = null;
                
                String BGenre = null;

                for(int i =1; i <= numberOfColumns ; i++)
                {
                    switch(i)
                    {
                        case 1: BTitle = resultSet.getObject(i).toString().trim();break;
                        case 2: BAuthor = resultSet.getObject(i).toString().trim(); break;
                        case 3: BDateAcq = strToDate(resultSet.getObject(i).toString().trim());break;
                        case 4: BPurchasePrice = Integer.parseInt(resultSet.getObject(i).toString().trim());break;
                        case 5: BAskPrice = Integer.parseInt(resultSet.getObject(i).toString().trim()); break;
                        case 6: BGenre = resultSet.getObject(i).toString().trim();break;
                    }
                    
                    
     
                }
                bObj = new Book(BTitle,BAuthor,BDateAcq,BPurchasePrice,BAskPrice,BGenre);
                arrStore.add(bObj);
                
            }
            /////////////////////////////////////////////////////////// ADD MOVIE            
            
            LOADQUERY = "SELECT Title,Author,DateAcquired,PurchasePrice,AskingPrice,Director,Actor,Actress FROM INVENTORY.db_owner.TableMovie";
            resultSet = statement.executeQuery(LOADQUERY);
            metaData = resultSet.getMetaData();
            numberOfColumns = metaData.getColumnCount();
            
            while(resultSet.next())
            {
                String MTitle = null;
                String MAuthor = null;
                Date MDateAcq = null;
                int MPurchasePrice = 0;
                int MAskPrice = 0;
                
                Movie MObj = null;
                
                String MDirector = null;
                String MActor = null;
                String MActress = null;

                for(int i = 1; i <= numberOfColumns ; i++)
                {
                    
                    switch(i)
                    {
                        case 1: MTitle = resultSet.getObject(i).toString().trim();break;
                        case 2: MAuthor = resultSet.getObject(i).toString().trim(); break;
                        case 3: MDateAcq = strToDate(resultSet.getObject(i).toString().trim());break;
                        case 4: MPurchasePrice = Integer.parseInt(resultSet.getObject(i).toString().trim());break;
                        case 5: MAskPrice = Integer.parseInt(resultSet.getObject(i).toString().trim()); break;
                        case 6: MDirector = resultSet.getObject(i).toString().trim();break;
                        case 7: MActor =  resultSet.getObject(i).toString().trim(); break;
                        case 8: MActress = resultSet.getObject(i).toString().trim(); break;
                    }
                    
                }
                MObj = new Movie(MTitle,MAuthor,MDateAcq,MPurchasePrice,MAskPrice,MDirector,strToArr(MActor),strToArr(MActress));
                
                arrStore.add(MObj);
                
                }           
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// ADD Painting           
            
            LOADQUERY = "SELECT Title,Author,DateAcquired,PurchasePrice,AskingPrice,Height,Width,Media FROM INVENTORY.db_owner.TablePainting";
            resultSet = statement.executeQuery(LOADQUERY);
            metaData = resultSet.getMetaData();
            numberOfColumns = metaData.getColumnCount();
            
            
            while(resultSet.next())
            {
                String PTitle = null;
                String PAuthor = null;
                Date PDateAcq = null;
                int PPurchasePrice = 0;
                int PAskPrice = 0;
                
                Painting MObj = null;
                
                int PHeight = 0;
                int PWidth = 0;
                String PMedia = null;

                for(int i =1; i <= numberOfColumns ; i++)
                {
                    switch(i)
                    {
                        case 1: PTitle = resultSet.getObject(i).toString().trim();break;
                        case 2: PAuthor = resultSet.getObject(i).toString().trim(); break;
                        case 3: PDateAcq = strToDate(resultSet.getObject(i).toString().trim());break;
                        case 4: PPurchasePrice = Integer.parseInt(resultSet.getObject(i).toString().trim());break;
                        case 5: PAskPrice = Integer.parseInt(resultSet.getObject(i).toString().trim()); break;
                        case 6: PHeight = Integer.parseInt(resultSet.getObject(i).toString().trim());break;
                        case 7: PWidth =  Integer.parseInt(resultSet.getObject(i).toString().trim());break;
                        case 8: PMedia = resultSet.getObject(i).toString().trim();break;
                    }
                   
                }
                MObj = new Painting(PTitle,PAuthor,PDateAcq,PPurchasePrice,PAskPrice,PHeight,PWidth,PMedia);
                arrStore.add(MObj);
                
            }             
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Exception   " + ex.getMessage());
        }
       catch (ClassNotFoundException ex) {
           System.out.println("Class Not Found  "+ ex.getMessage());
       }

        finally
        {
            try
            {

                connection.close();
                
                System.out.println("Successful LOAD");
            }
            catch(Exception ex)
            {
                System.out.println("Close;");
            }
        }
        
        return arrStore;
    }
 
    /*
    Method Name: strToDate()
    Purpose: turns a string to a Date obj
    Parameter: String
    Method Input: none
    Return Value:Date
    Date: 12/7/2017
    */     
    private Date strToDate(String date)
    {
        
        String temp = "";
        
        String[] laDate = new String[3];
        
        int j = 0;
        
        for(int i = 0; i < date.length(); i++)
        {
            
            if(!Character.toString(date.charAt(i)).equals("/"))
            {
                temp += Character.toString(date.charAt(i));
            }
            
            if(Character.toString(date.charAt(i)).equals("/") || (i +1 == date.length()))
            {
                laDate[j] = temp;
                temp = "";
                j++;
            }
        }
     
        Date elDate = new Date(laDate[0],laDate[1],laDate[2]);
        
        return elDate;

    }
 
    /*
    Method Name: arrToStr()
    Purpose: concatenates an String[] to String
    Parameter: String[]
    Method Input: none
    Return Value: String
    Date: 12/7/2017
    */    
    private String arrToStr(String[] arr)
    {
        String str = "";
        
        for(int i = 0; i < arr.length;i++)
        {
            str += arr[i] + ",";
        }
        
        return str;

    }
  
    /*
    Method Name: strToArr
    Purpose: turns a string to a Sting[]
    Parameter: String
    Method Input: none
    Return Value:String[]
    Date: 12/7/2017
    */ 
    private String[] strToArr(String compound)
    {
              
        String temp = "";
        
        ArrayList<String> arr = new ArrayList();

        for(int i = 0; i < compound.length(); i++)
        {
            
            if(!Character.toString(compound.charAt(i)).equals(","))
            {
                temp += Character.toString(compound.charAt(i));
            }
            
            if(Character.toString(compound.charAt(i)).equals(",") || (i + 1 == compound.length()))
            {
                arr.add(temp);
                temp = "";
            }
        }
        
        String[] actArr =  new String[arr.size()];
        
        for(int i = 0; i < arr.size(); i++)
        {
            actArr[i] = arr.get(i);

        }
        return actArr;
    }
    
    
    
    
}
