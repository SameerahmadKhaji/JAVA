class Dog
{
  String name;
  String breed;
  
  void bark()
{
  System.out.println("Bow bow!!");
 }
  
}
  
class DogApp
{
  public static void main(String[]args)
  {
        Dog d1=new Dog();  
        d1.name="Scooby";
        d1.breed= "pug";

        Dog d2=new Dog();
        d2.name="Pluto";
        d2.breed="Pitbull"  ;
     
        System.out.println("The details of the dogs are:");
        System.out.println(" NAME = "+  d1.name);
        System.out.println(" BREED  = "+ d1.breed);
         d1.bark();
        System.out.println(" NAME = "+ d2.name);
        System.out.println(" BREED = "+ d2.breed);
           d2.bark();
   
    }
  }

