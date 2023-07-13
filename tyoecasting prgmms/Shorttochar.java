class Shorttochar
{

public static void main(String[]args)
{

short s = 65;
char c = (char) s;

System.out.println(c);


/*Since short is a signed 16-bit integer type, 
and char is an unsigned 16-bit Unicode character type,

 the conversion requires
 explicit casting using the (char) cast operator..*/



}
}