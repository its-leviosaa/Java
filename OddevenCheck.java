import java.util.*;
public class OddevenCheck {
    public static void main(String[] args) {
        System.out.println("Enter no. you want to check.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0 || num==0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}
