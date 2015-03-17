package ch4;

// test PP4.01

public class SphereTest {

public static void main (String[] arg){
		
		Sphere ball1 = new Sphere() ;
		Sphere ball2 = new Sphere() ;
		Sphere ball3 = new Sphere() ;
		
		ball1.setDiameter(1.23456) ;
		ball2.setDiameter(8) ;
		ball3.setDiameter(6.66) ;
		
		ball1.Area();
		ball2.Area();
		ball3.Area();
		
		ball1.Volume();
		ball2.Volume();
		ball3.Volume();
		
		System.out.println (ball1+"\n\n"+
		                    ball2+"\n\n"+
				            ball3+"\n\n") ;
	}

}

// 2012.3.11