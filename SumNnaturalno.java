import java.util.*;
public class SumNnaturalno {
    public static void main(String[] args) {
        System.out.println("Enter number till whichyou want to print sum.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i = 1 ; i <= a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
