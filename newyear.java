package appt;

/**
 *
 * @author Latif
 */
public class Newyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m= 2;
        int d= 0;
        int y=2012;
        
        if ( m==4 || m ==9 || m==11 ) {
         
            d=30;
        }else if(m==2 ){
        
            d=28;
        } else { 
           
            d=31;
        
        }
        
        if(m==2 && (y%4==0 && y%100!=0 )|| (y%100==0 && y%400==0) ){
             d=29;
         System.out.println(" in " +y+ " the " +m+ " mounths have " +d+ " days");
    }
    
    else { 
        
            System.out.println("This years is a normal year");
        }
        
    }
    
}
