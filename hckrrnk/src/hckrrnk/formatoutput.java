package hckrrnk;

import java.util.Scanner;

public class formatoutput {

    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                
                String s1=scan.next();
                 
                int x=scan.nextInt();
               
               System.out.printf(s1+" "+ "%03d\n",x);
               
            }
            System.out.println("================================");

    }
}