/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj4;
import java.util.Arrays;
import java.util.Random;


//Class name: 
//Class Author: Luis E. Vargas Tamayo
//Purpose of the class: 
//Date: 2/27/2018
//List of changes with dates: none
//Special Notes: 
public class BinarySearch 
{
    //Array
    private int[] numArray;
    //random object to create an object
    private Random rand = new Random();
    //random number that is being looked 
    private int value;
    
    /* 
    Method Name: BinarySearch()
    Method Inputted: none
    Parameters: int
    Purpose: Constructor
    Return: none
    Date:  5/1/2018
    */ 
    public BinarySearch(int size)
    {
        //creates the array
        numArray = ArraySetUp(size);
        //creates the number being looked for in the array
        value = rand.nextInt(size) + 1;
    }
    
    /* 
    Method Name: ArraySetUp()
    Method Inputted: none
    Parameters: int
    Purpose: Creates the array
    Return: Int
    Date:  5/1/2018
    */     
    private int[] ArraySetUp(int size)
    {
        //creates an array
        int[] arr = new int[size];
        
        //iterates through the array and inserts random numbers
        for(int i = 0; i < size ; i++)
        {
            arr[i] = rand.nextInt(size) + 1;   
        }
        
        //sorts the array
        Arrays.sort(arr);
        
        
        //System.out.println(Arrays.toString(arr));
        
        return arr;
    }
    
    /* 
    Method Name: OriginalSearch()
    Method Inputted: none
    Parameters: int
    Purpose: The Binary Search searches through the random array for the random number generated
    Return: none
    Date:  5/1/2018
    */     
    public int OriginalSearch()
    {
        int numIterations = 0;
        
        int leftBound = 0;
        int rightBound = numArray.length;
        int midIndex = 0;
        
        while (leftBound < rightBound)
        {
            //counts the times this loops
            numIterations += 1;
            
           //Gets the middle index of the range 
           midIndex = (int)Math.ceil((leftBound +rightBound)/2.0) - 1;
           //System.out.println("Iterating Index: " + midIndex);
            
            // Check if x is present at mid
            if (numArray[midIndex] == value)
            {
                System.out.println("FOUND");
                System.out.println("Number of Iterations: " + numIterations);
                //System.out.println("MidIndex ORG :" + midIndex);
                return midIndex;
            }
            // If x greater, ignore left half
            else if (numArray[midIndex] < value)
            {
                leftBound = midIndex + 1;
            }
 
            // If x is smaller, ignore right half
            else if (numArray[midIndex] > value)
            {
                rightBound = midIndex - 1;
            }
        }
 
        try
        {
            if(numArray[leftBound] == value)
            {
                System.out.println("FOUND2");
                System.out.println("Number of Iterations: " + numIterations);
                //System.out.println("found ORG :" + leftBound);
                return midIndex;
            }
        }
        catch(Exception ex){}
        // if we reach here, then element was 
        // not present
        System.out.println("NOT FOUND");
        System.out.println("Number of Iterations: " + numIterations);
        //System.out.println(" ORG :" + leftBound);
        return -1;
    }

    /* 
    Method Name: SherwoodSearch()
    Method Inputted: none
    Parameters: int
    Purpose: The Sherwood algorithm searches through the random array for the random number generated
    Return: int
    Date:  5/1/2018
    */   
    public int SherwoodSearch()
    {
        int numIterations = 0;
        int leftBound = 0;
        int rightBound = numArray.length;
        int midIndex = 0;
        
        while (leftBound < rightBound)
        {
            //counts the times this loops
            numIterations += 1;
            //midIndex = (int)Math.ceil((leftBound +rightBound)/2.0);
            
            //gets the random selected upper limit 
            midIndex = leftBound + rand.nextInt(rightBound - leftBound);
            //System.out.println("Iterating Index: " + midIndex);
            
            // Check if x is present at mid
            if (numArray[midIndex] == value)
            {
                System.out.println("FOUND");
                System.out.println("Number of Iterations: " + numIterations);
                //System.out.println("found SHR :" + midIndex);
                return midIndex;
            }
            // If x greater, ignore left half
            else if (numArray[midIndex] < value)
            {
                leftBound = midIndex + 1;
            }
 
            // If x is smaller, ignore right half
            else if (numArray[midIndex] > value)
            {
                rightBound = midIndex - 1;
            }
        }
        try
        {
            if(numArray[leftBound] == value)
            {
                System.out.println("FOUND2");
                System.out.println("Number of Iterations: " + numIterations);
                //System.out.println("found SHR :" + leftBound);
                return midIndex;
            }
        }
        catch(Exception ex){}
        
        // if we reach here, then element was 
        // not present
        System.out.println("NOT FOUND");
        System.out.println("Number of Iterations: " + numIterations);
        //System.out.println("found SHR :" + leftBound);
        return -1;
    }
    
    
    
    
    
    
    
    
    
}
