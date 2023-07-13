class Bitwise
{
 public class BitwiseOperator{
    public static void main(String[] args) {
        int a = 5;  // Binary representation: 0000 0101
        int b = 7;   // Binary representation: 0000 0111
        int c = 14;  //Binary representation:0000 1110
        // Bitwise AND
          
        System.out.println("Bitwise AND: " + (a&b));

        // Bitwise OR
         
        System.out.println("Bitwise OR: " + (a|b));

        // Bitwise XOR
         
        System.out.println("Bitwise XOR: " + (a^b));

        // Bitwise NOT
        
        System.out.println("Bitwise NOT (a): " +(~a));

       
        System.out.println("Bitwise NOT (b): " + (~b));

        // Bitwise left shift
       
        System.out.println("Bitwise left shift: " + (c<<2));

        // Bitwise right shift
        
        System.out.println("Bitwise right shift: " +(c>>2));

      
    }
}