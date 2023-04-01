import java.util.*;
public class TableofNum {
    public static void main(String[] args) {
        System.out.println("Enter number whose table you want to print.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1 ; i <= 10;i++)
        {
            System.out.print(a);
            System.out.print(" * ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(a*i);
        }
}
}