/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_advjava_proj2;

import java.awt.Color;
import javax.swing.JOptionPane;


/*
Class name: Car

Class Author: Luis E. Vargas Tamayo

Purpose of the class: Contruct the needed variables and methods to run a virtual vehicle

Date: 9/15/2017

List of changes with dates: none

Special Notes: none

*/ 
public class Car 
{
    private String make;
    private String model;
    private Color color; 
    private int speed;
    
    
    
    /*
    Method Name: Car()
    Purpose: The constructor of the Class
    Parameter: String make, String model, Color color
    Method Input: none
    Return Value: none
    Date: 9/15/2017
    */
    public Car(String make,String model, Color color)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }
 
    /*
    Method Name: getMake()
    Purpose: retreive private variable make
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 9/15/2017
    */   
    public String getMake(){return make;}
 
    /*
    Method Name: setMake()
    Purpose: set a value for private variable make
    Parameter: String make
    Method Input: none
    Return Value: String
    Date: 9/15/2017
    */    
    public void setMake(String make){this.make = make;}
    
    /*
    Method Name: getModel()
    Purpose: retreive private variable model
    Parameter: none
    Method Input: String
    Return Value: String
    Date: 9/15/2017
    */
    public String getModel(){return model;}
    
    /*
    Method Name: setModel()
    Purpose: set value for private varibale make
    Parameter: String model
    Method Input: none
    Return Value: String
    Date: 9/15/2017
    */
    public void setModel(String model){this.model = model;}
    
    /*
    Method Name: getColor()
    Purpose:  retreive private variable color
    Parameter: none
    Method Input: none
    Return Value: Color
    Date: 9/15/2017
    */
    public Color getColor(){return color;}
    
    /*
    Method Name: setColor()
    Purpose:  set value for private variable color
    Parameter: Color color
    Method Input: none
    Return Value: nne
    Date:  9/15/2017
    */
    public void setColor(Color color){this.color = color;}
        
    /*
    Method Name: getSpeed()
    Purpose: retreive private variable speed;
    Parameter: none
    Method Input: none
    Return Value: int 
    Date: 9/15/2017
    */
    public int getSpeed(){return speed;}
      
    /*
    Method Name: setSpeed()
    Purpose: set value for private variable speed
    Parameter: int speed
    Method Input: none
    Return Value: none
    Date: 9/15/2017
    */
    public void setSpeed(int speed){   this.speed = speed;}
       
    /*
    Method Name: acceleration()
    Purpose: increase speed by 5
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 9/15/2017
    */
    public void acceleration(){speed+=5;}
        
    /*
    Method Name: brake()
    Purpose: decrease speed by 5
    Parameter: none
    Method Input: none
    Return Value: none
    Date: 9/15/2017
    */
    public void brake()
    {
        if(speed>0)
        {
            speed-=5;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The vehicle is at rest");
        }
        
    }
        
    /*
    Method Name: getAttributes()
    Purpose: returns a string of all attributes of ther Car
    Parameter: none
    Method Input: none
    Return Value: String
    Date: 9/15/2017
    */
    public String getAttritube()
    {
        String attribute = make + " " + model;
    
        return attribute;
    }
}
