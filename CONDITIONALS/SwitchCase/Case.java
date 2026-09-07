package CONDITIONALS.SwitchCase;
import java.util.*;
public class Case {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your button.");
        int button =sc.nextInt();
        switch(button){
            case 1 : System.out.println("HELLO");
            break;
            case 2 : System.out.println("HII");
            break;
            case 3 : System.out.println("BONJOUR");
            break;
            default : System.out.println("INVALID");
        }
        sc.close();
    }
    
}

// agar weeks ka likhna ho to int me Days lekr print statement change krke days ka ho skata h ;koi light ka krna ho ki 1 press pr red,blue,green etc to likewise krdo according to questions.
