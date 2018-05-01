/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj4;

import java.util.Random;

/**
 *
 * @author fathe
 */
public class RUN 
{
    
    public static void main(String[] args)
    {
        
        BinarySearch BS = new BinarySearch(1000000);
        
        System.out.println("Original Search");
        BS.OriginalSearch();
        
        System.out.println("\nSherwoord Search");
        BS.SherwoodSearch();
        
        
    
    
    
    
    
    }
    
    
    
    
}
