package appt;

/**
 *
 * @author Latif
 */
import java.util.*;
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first name");
        String firstname = sc.next();
        System.out.println("Enter last name");
        String lastname = sc.next();
        System.out.println("marks1");
        String marks1 = sc.next();
        System.out.println("marks2");
        String marks2 = sc.next();
        int sum = Integer.parseInt(marks1) + Integer.parseInt(marks2); 
        int resultat = 0;
        int E = 0;
        int C = 60;
        int B = 70;
        int A = 90;
        if (sum/2<60)   
        {    
         resultat = (E);
        }
        else
            
            {
                    if (sum/2<70) 
                     
                      {
                       resultat = (C);
                    
                       }  
                else  
                       { 
                        if (sum/2<90) 
                     
                      {
                       resultat = (B);
                    
                       }  
                    else
                          resultat = (A);  
                            
                    }
            }
        
        System.out.println ( "first name : " +firstname);
       
        System.out.println ("last name : " +lastname); 
        
        System.out.println ("resultat : " +resultat);
    }
    
}
