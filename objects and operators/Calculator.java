package practice;

import java.util.Scanner;

public class Calculator {

public static void main(String[]args){
	
	Scanner scan=new Scanner(System.in);
	 System.out.println("Enter Two Numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	scan.close();
   
     
	 int res1=sum(a,b);
	
	System.out.println("Sum = "+res1);
	
	int res2=sub(b,a);
	System.out.println("Sub ="+res2);
	
	int res3=div(b,a);
	
	System.out.println("div ="+res3);
	
	int res4=mul(a,b);
	System.out.println("mul ="+res4);
	
	int res5=mod(b,a);
	System.out.println("remainder ="+res5);
	
	int res6=sum(a,b)/2;
	System.out.println("the avg is ="+res6);
	
	

    	
	
}
 public static int sum(int x,int y)
 {     
	 return x+y;
			 
	 
 }

public static int sub(int i,int j)
{
   
   return  i-j;
}


public static int mod(int p,int q)
{
     
   return p%q ;
}
public static int mul(int l,int m)
{
      return l*m ;
}
public static int div(int s,int t)
{       
	   
      return s/t ;

}

}