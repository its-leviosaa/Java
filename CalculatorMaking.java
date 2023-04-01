import java.util.*;
public class CalculatorMaking{
    public static void main(String[] args) {
        System.out.println("Enter first number.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number.");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.println("Enter given number for following specific operations.");
        System.out.println("1 : + (Addition) a + b\n2 : - (Subtraction) a - b\n3 : * (Multiplication) a * b\n4 : / (Division) a / b\n5 : % (Modulo or remainder) a % b");
        System.out.println("Enter option number.");
        Scanner sc2 = new Scanner(System.in);
        int button = sc2.nextInt();
        switch (button) {
            case 1:
            System.out.println(a + b);
            break;
            case 2:
            System.out.println(a - b);
            break;
            case 3:
            System.out.println(a * b);
            break;
            case 4:
            System.out.println(a / b);
            break;
            case 5:
            System.out.println(a % b);
            break;
            default:
            System.out.println("INVALID INPUT");
        }
    }
}