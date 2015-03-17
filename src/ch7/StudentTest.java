package ch7;

public class StudentTest {
	
	public static void main (String [] args){
		
		Student s1 = new Student ();
		
		s1.setTestScore("",1, 80);
		s1.setTestScore("",2, 100);
		s1.setTestScore("wei",3, 90);
		
		s1.getTestScore(1);
		s1.getTestScore(2);
		s1.getTestScore(3);
		s1.getTestScore(4);
		System.out.println(s1.toString());
	}

}
