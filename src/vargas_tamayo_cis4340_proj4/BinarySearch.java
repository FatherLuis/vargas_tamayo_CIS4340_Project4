/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj4;
import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author fathe
 */
public class BinarySearch 
{
    
    private int[] numArray;
    private Random rand = new Random();
    private int value;
    
    public BinarySearch(int size)
    {
        numArray = ArraySetUp(size);
        value = rand.nextInt(size) + 1;
    }
    
    private int[] ArraySetUp(int size)
    {
        int[] arr = new int[size];
        
        for(int i = 0; i < size ; i++)
        {
            arr[i] = rand.nextInt(size) + 1;   
        }
        
        Arrays.sort(arr);
        
        
        //System.out.println(Arrays.toString(arr));
        
        return arr;
    }
    
    
    public int OriginalSearch()
    {
        int numIterations = 0;
        
        int leftBound = 0;
        int rightBound = numArray.length;
        int midIndex = 0;
        
        while (leftBound < rightBound)
        {
            numIterations += 1;
            
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
 
    public int SherwoodSearch()
    {
        int numIterations = 0;
        int leftBound = 0;
        int rightBound = numArray.length;
        int midIndex = 0;
        
        while (leftBound < rightBound)
        {
            numIterations += 1;
            //midIndex = (int)Math.ceil((leftBound +rightBound)/2.0);
            
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
