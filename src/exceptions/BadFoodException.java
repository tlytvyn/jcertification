package exceptions;

@SuppressWarnings("serial")
public class BadFoodException extends Exception {
	private String foodValue; 
	
	public String getFoodValue(){
		return foodValue;
	}
	
	public BadFoodException(){
	}
	
	public BadFoodException(String foodValue){
		this.foodValue = foodValue;
	}
	
	/*public String getLocalizedMessage(){
		return "bad behaviour";		
	}*/	
	
	public String getMessage(){
		if (getFoodValue().contains("ana"))
			return getFoodValue() + " " + "is bad banana value";
		else return "bla bkasdfasf"; 
	}
}
