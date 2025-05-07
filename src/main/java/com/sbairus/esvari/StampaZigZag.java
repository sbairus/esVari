
package com.sbairus.esvari;

/**
 *
 * @author Fabio.Anelli
 */
public class StampaZigZag {
    
    public static void main (String[] args){
      int ar_num[] = {1, 3, 5, 7, 9, 10, 8, 6, 4, 2};
      int indx_end = ar_num.length - 1;
      
      for (int i=0; i < 5; i++) {
          System.out.println(ar_num[i]);
          System.out.println(ar_num[indx_end]);
          indx_end = indx_end - 1;
      }
      
    }
    
}
