import java.util.*;
public class Greeting {
    public static void main(String[] args){
        System.out.println("Enter number.");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        /* 

        //using if-else

        if (button==1) {
            System.out.println("HELLO");
        }
        else if(button==2) {
            System.out.println("NAMASTE");
        }
        else if(button==3) {
            System.out.println("BONJOUR");
        }
        else{
            System.out.println("INVALID INPUT");
        }

        */

        //using switch case statements
        switch (button) {
            case 1:
            System.out.println("HELLO");
            break;
            case 2:
            System.out.println("NAMASTE");
            break;
            case 3:
            System.out.println("BONJOUR");
            break;
            default:
            System.out.println("INVALID INPUT");
        }
    }
}
