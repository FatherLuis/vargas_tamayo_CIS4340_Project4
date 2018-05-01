/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargas_tamayo_cis4340_proj4;


/**
 *
 * @author fathe
 */
public class RUN 
{
    
    public static void main(String[] args) throws InterruptedException
    {
        
        for(int i = 0; i < 5; i++)
        {
            BinarySearch BS = new BinarySearch(10000000);

            System.out.println("\nOriginal Search");
            BS.OriginalSearch();

            //TimeUnit.SECONDS.sleep(5);

            System.out.println("\nSherwoord Search");
            BS.SherwoodSearch();
            System.out.println("-----------------------");
        }
        
        
    
    
    
    
    
    }
    
    
    
    
}
