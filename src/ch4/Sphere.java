package ch4;


// That is pp4.1

import java.text.DecimalFormat ;

public class Sphere {

	private double Diameter ;
	private double Area ;
	private double Volume ;
	
	public Sphere () {
		
		 Diameter = 1 ;
		
	}
	
	public void setDiameter (double d){
		
		Diameter = d ;
		
	}
	
    public double getDiameter (){
		
		return Diameter ;
		
	}
	
	public double Area (){
		
		 Area = Math.pow(Diameter,2)*Math.PI ;
		return Area ;
		
	} 
	
	public double Volume (){
		
		 Volume = Math.PI*Math.pow(Diameter, 3)/6 ;
		return Volume ;
		
	}
	
	public String toString (){
		
		DecimalFormat fmt = new DecimalFormat("0.###") ;
		
		String result = "The ball's Diameter= "+fmt.format(Diameter)+"m"+
				        "\nThe ball's Area= "+fmt.format(Area)+"m^2"+
				        "\nThe ball's Volume= "+fmt.format(Volume)+"m^3" ;
		
	    return result ;	
	    
	}
	
}
// 2012.2.11-2012.3.11



