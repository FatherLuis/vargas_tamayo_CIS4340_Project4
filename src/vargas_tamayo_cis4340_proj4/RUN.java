/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj4;


//Class name: RUN
//Class Author: Luis E. Vargas Tamayo
//Purpose of the class: Run the binary search and Sherwood algorithm
//Date: 2/27/2018
//List of changes with dates: none
//Special Notes: 
public class RUN 
{
    /* 
    Method Name:Main
    Method Inputted: none
    Parameters: int
    Purpose: Execute program
    Return: none
    Date:  5/1/2018
    */  
    public static void main(String[] args) throws InterruptedException
    {
        //loops around five times
        for(int i = 0; i < 5; i++)
        {
            //creates the object and the param is the size of the array and the range of the random number
            BinarySearch BS = new BinarySearch(10000000);

            System.out.println("\nBinary Search");
            BS.OriginalSearch();

            //TimeUnit.SECONDS.sleep(5);

            System.out.println("\nSherwoord Search");
            BS.SherwoodSearch();
            System.out.println("-----------------------");
        }
    }  
}
