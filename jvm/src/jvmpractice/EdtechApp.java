package jvmpractice;

public class EdtechApp {

public static void main(String[]args)
{
	
	Edtech E1=new Edtech();
	
	E1.name="kodNest";
	E1.batches=4;
	E1.fees=30000;
	
	

    
    System.out.println("institute name "+E1.name);
    System.out.println("No of Batches "+E1.batches);
    System.out.println("Total FEES "+E1.fees);
	
    E1.teach();
    E1.drive();
    E1.noGuarantee();

}
}
