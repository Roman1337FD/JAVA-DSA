/* do{
do something
}
while(condition);    isme kaam ek baaar pahle ho jaata h condtion true ho ya false kyuki condition baad me check hoti h pahle kam hota h
 */

package LOOPS.Dowhile;
import java.util.*;
public class basic {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int i=1;

        do{
            System.out.println(2*i);
            i++;
        }while(i<=num);
sc.close();

        
    }
    
}
