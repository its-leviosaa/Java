import java.util.*;
public class Sum {
    public static void main(String[] args){
        System.out.println("Enter value for a.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter value for b.");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int sum = a+b;
        System.out.println("Sum is ");
        System.out.println(sum);
    }
}
