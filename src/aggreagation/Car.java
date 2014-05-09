package aggreagation;

public class Car {
	
	private int year;
	private Colour colour;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public Car(int year, Colour colour) {
		super();
		this.year = year;
		this.colour = colour;
	}

}
