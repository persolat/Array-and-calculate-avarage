package appt;

import java.util.*;

/**
 *
 * @author Latif
 */
public class palindrom2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String original,reverse="";
        Scanner sc = new Scanner (System.in);
        System.out.println("entrer un palindrome");
         original= sc.next();
       
        int lenght = original.length(); 
        
        for( int i = lenght -1; i>=0; i-- )
            
             reverse = reverse + original.charAt(i);
            
            if (original.equals(reverse))
                
                System.out.println("est un palindrome");
        
            else 
                
                System.out.println("n'est pas un palindrome");
    }
    
}
