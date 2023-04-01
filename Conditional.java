import java.util.*;
public class Conditional {
    public static void main(String[] args){
        System.out.println("Enter age.");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("you are an adult.");
        }
        else{
                System.out.println("you are not an adult.");
            }
    }
    
}
