class Teacher{
  
String name;
String sub;
int sal;

  void teach()
  {
    System.out.println("A teacher teaches");    
 }
  Teacher(String name,String sub,int sal)
   {
      this.name=name;
      this.sub=sub;
      this.sal=sal;
     }
   
  }


class TeacherAppConstruct

{
  public static void main(String[]args)
  {
     Teacher t1=new Teacher("Deep", "Java" , 25000);
     Teacher t2=new Teacher("Kushal" , "Aptitude" , 30000);
      
       System.out.println("name " +    t1.name);
       System.out.println("subject "+  t1.sub);
       System.out.println("salary " +  t1.sal);
          t1.teach();
       
       System.out.println("name " +  t2.name);
       System.out.println("subject " +   t2.sub);
       System.out.println("salary " +   t2.sal);
           t2.teach();
 }}