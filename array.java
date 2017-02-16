package appt;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Latif
 */
public class testExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int[] array = new int[] {11, 22, 33, 44, 55};
double average = 0;
for (int element : array){
    average += element;
}
if (array.length > 0){
    average = average / array.length;
}
Arrays.sort(array);
        System.out.println("Min integer :" +array[0] );
        System.out.println("Max integer : " +array[array.length-1]);
        System.out.println("La moyenne est  :"+average);
   }

}
