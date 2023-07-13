package Practice;
 class TeacherApp {
	
		public static void main(String[]args)
		
		{
			Teacher t1 =new Teacher();
			
			
			t1.id=143;
		
			t1.name="Sameer";
			t1.subject="Astronomy";
			
			t1.teach();
			t1.motivate();
			t1.giveAssignment();
			
			System.out.println("Teacher id = "+t1.id);
			System.out.println("Teacher name = "+t1.name);
			System.out.println("Teacher Subject = "+t1.subject);
		
	}

}
