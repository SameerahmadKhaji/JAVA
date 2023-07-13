//to print any number between 1 to 4

import java.util.Scanner;
class Any1number
{
  public static void main(String[]args)

{
  
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter number between 1 to  4");
  int num=scan.nextInt();
  
  switch(num)

{
  case 1:
    System.out.println("u hve entered 1");
    break;

   case 2:
   System.out.println("u hve entered 2");
     break;

  case  3:
      System.out.println("u hve entered 3 ");
    break;
   
  case  4:
      System.out.println("u hve entered 4");
    break;
  default:
     System.out.println("learn to read");
      

}}}

