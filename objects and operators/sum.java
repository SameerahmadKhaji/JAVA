

import java.util.Scanner;

public class sum

{


public static void main(String[]args)

{
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("enter two numbers");
    
    int a=scan.nextInt();
    
    int b=scan.nextInt();
    
    
    int c=a+b;
    
    System.out.println("the sum is:" +c);
}


}

}