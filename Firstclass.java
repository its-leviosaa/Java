import java.util.*;

class Firstclass {
    public static void main(String[] args) {
        //topic 1
        /*
        System.out.print("Hello World.");
       //System.out.print('Hello World.');->single quote wrong
       System.out.println("Hello World printed in same line.");
       System.out.print("Hello World printed in different line.\n");
       System.out.println("Hello World printed in different line due to newline character in previous.");
       System.out.println('a');
       System.out.println("In Java we can print a character using single quote not a string.");
       System.out.println("Printing in 2 diff lines.\nUsing a single function for output.");
       */

       /*
      //Question 1
       //Printing First pattern using Print/println or newline function
       System.out.println('*');
       System.out.print("* *\n");
       System.out.println("* * *");
       System.out.println("* * * *");
       */

       /*
       //Variables In JAVA
       String name = "Tony Stark";
       int a = 24;
       int age = 10;
       double price = 25.25;
       double sum = a+age+price;
       int difference = a-age;
       System.out.println(sum);
       System.out.println(difference);
       System.out.println(a*age);
       //The value of the local variable age is not usedJava -> This warning is showing ignore this
       */

       //Taking input in Java
       System.out.println("Enter name.(full name can't be printed)");
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       System.out.println(name);
       System.out.println("Enter full name.");
       Scanner sc1 = new Scanner(System.in);
       String name_full = sc1.nextLine();
       System.out.println(name_full);
    }
}
