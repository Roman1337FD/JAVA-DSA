import java.util.Scanner;
public class add{
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number A");
        int A = sc.nextInt();
        System.out.println("Enter a number B");
        int B = sc.nextInt();
        int C = A + B ;
        System.out.print(C);
        sc.close();

    }
}

// TWO DATA TYPE 
// (1):PRIMITIVE DATA TYPE / (2): NON-PRIMITIVE DATA TYPE.
// IN PRIMITIVE DATA TYPE:- INT,FLOAT,BOOLEAN,CHAR,DOUBLE,SHORT...
// IN NON-PRIMITIVE DATA TYPE:- ARRAY,CLASS,OBJECT,STRING,INTERFACE