class suffixfl
{
 
public static void main(String[]args)
{

     
   //float a=3.147;//this line will give error because compiler will consider 3.147 as double                                                                                                                                                                                                                                                                                                                                                                              
   float a=3.147f;//no error since we have used f as suffix
    
   //long a=2147483648;//this line will give error because treated as int and is out of range
  
   long b=214748369l; //no error since we have used l as suffix

   long c=2147;//even though treated as int since its range is in int range,it will execute.But the conversion time is more			
 
  System.out.println(b);
    
  System.out.println(a);

System.out.println(c);


}



}