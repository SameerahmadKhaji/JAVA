import java.util.Scanner;

class FactorsApp
{
   public static void main(String[]args)
   {
        
       try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter a number to print the factor of it");
         int num=scan.nextInt();
         Factors.printFactors(num);
      }
   }}

class Factors
{
  static void printFactors(int num)
{
    for(int i=1;i<num;i++)
   if(num%i==0)
   {
    System.out.print(i+"");
}}}