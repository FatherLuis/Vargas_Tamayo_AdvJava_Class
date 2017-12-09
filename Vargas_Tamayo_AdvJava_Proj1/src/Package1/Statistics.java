/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

/*

Class name: 

Class Author: Luis E. Vargas Tamayo

Purpose of the class: 

Date: 

List of changes with dates: none

Special Notes: none

*/ 
public class Statistics 
{
    private double[] arrContainer;
    private double dblMean;
    private double dblPopStandardDev;

    /*
    Method Name: Statistics()
    Purpose: Contructor of the Class
    Parameter: double[] array
    Method Input: calcMean();
    Return Value: calcpopStandardDev()
    Date: 9/5/2017
    */
    public Statistics(double[] array)
    {
        arrContainer = array;
        dblMean = calcMean();
        dblPopStandardDev =calcPopStandardDev();
    }
 
    /*
    Method Name: calcMean()
    Purpose: calculate the mean
    Parameter: none
    Method Input: none
    Return Value:   double mean of array numbers
    Date: 7/5/2017
    */
    private double calcMean()
    {
     
        double[] arrVessel = this.arrContainer; // stores array in variable arrVessel
        int intSize = arrVessel.length; // gets the size of the array
        double dblSum = 0; // sets the sum to zero
        
        
        for(int i=0;i< intSize;i++) // each iteration, the value stored in each element is added up to get a sum
        {
            dblSum += arrVessel[i];  
        }
        
        double dblCalcMean = dblSum/intSize; // formulat for a mean (the summation ) divided by the quantity being added
        
        return dblCalcMean;  //returns the mean of the numeric array
    }
    
    /*
    Method Name:  getMean()
    Method Inputted: none
    Parameters: none
    Purpose:  get private class variable dblMean
    Return: private class variable dblMean
    Date: 7/5/2017
    */
    public double getMean()
    {
        return dblMean;
    }
        
    /*
    Method Name: getPopStandardDev()
    Method Inputted: none
    Parameters: none
    Purpose: get private class variable Standard Deviation
    Return: dblPopStandardDev
    Date:  7/5/2017
    */
    public double getPopStandardDev()
    {
        return dblPopStandardDev;
    }

    /*
    Method Name: calcPopStandardDev()
    Purpose: Calculate standard Deviation
    Parameter: none
    Method Input: getMean();
    Return Value:   Population Standard Deviation
    Date: 7/5/2017
    */
    private double calcPopStandardDev()
    {
        double dblMeaner = this.getMean(); //gets mean
        double[] arrVessel = this.arrContainer; //gets numeric array
        int intSize = arrVessel.length; //gets size of array
        double dblSum=0; //sets sum equal to zero
        double dblPopStanDev; // creates variable that will store the population standard deviation
        
        for(int i=0; i<intSize;i++) //each iteration, the value stored in the element subtracted by the mean of the array quantity scared will be added to the dblSum
        {
            dblSum += (arrVessel[i] - dblMeaner)*(arrVessel[i] - dblMeaner); 
        }
    
        dblPopStanDev = Math.sqrt(dblSum/(intSize-1)); //the sum brought from the for-loop divided by the size of the array squared-rooted
        
        return dblPopStanDev; // returns standard deviation
    }

    
}
