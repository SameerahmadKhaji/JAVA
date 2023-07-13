

class Car
{

    String brand;
    String color;
    int price;

  void accelerate()
   {
    System.out.println(" The car is accelerating") ;
   }

}



class CarApp

{  
   public static void main(String[]args)
  {



              Car c = new  Car();    

               c.brand = "Audi" ; 
               c.color = "red" ;
               c.price = 1233000;
  
        System.out.println("The Brand is: " + c.brand   );
        System.out.println("The color is: " + c.color   );
        System.out.println("The price is: " + c.price  );
              c.accelerate();

 }



}