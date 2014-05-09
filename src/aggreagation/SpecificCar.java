package aggreagation;

public class SpecificCar extends Car{
	

	public SpecificCar(int year) {
		super(year, redColorDecor());		
	}
	
	private static Colour redColorDecor(){
		Colour red = new Colour(10,0,0);
		return red;
	}

}
