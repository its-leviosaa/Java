import java.util.*;
public class EqualGreaterSmallerno {
    public static void main(String[] args) {
        System.out.println("Enter first number.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number.");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        if(a==b){
            System.out.println("Equal.");
        }
        else if (a>b) {
            System.out.println("a greater.");
        }
        else{
            System.out.println("a smaller.");
        }
    }
}
