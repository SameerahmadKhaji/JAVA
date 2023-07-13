package conditionalconstructors;

import java.util.Scanner;

 class Switch {
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter any number 1 to 7");
			int opt = scan.nextInt();
			scan.close();

			switch (opt) {
			case 1:
				System.out.println("Daaru day, Sundayy");
				break;
			case 2:
				System.out.println("monday :((((( ");
				break;
			case 3:
				System.out.println("CHEWSSDAYY!!");
				break;
			case 4:

				System.out.println("Wedensadayy");
				break;
			case 5:
				System.out.println("almost weekend,Thursday");
				break;
			case 6:

				System.out.println("WEEKEND IS CLOSE,its FRIDAY!");
				break;
			case 7:

				System.out.println("Finally,Saturday,Enjoy");
				break;
			default:

				System.out.println(" u are not getting placed");
				
			}
		}
	//8 minutes
		
	}

