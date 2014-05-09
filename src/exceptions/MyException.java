package exceptions;

public class MyException {
	
	public static void main(String [] args){
		String [] foods = {"banana","asdasd","cucumber","fffff"};
		for (String sFood : foods){
				try {
					checkFood(sFood);
				} catch (BadFoodException e) {
					System.out.println(e.getLocalizedMessage());				
				}
		}
		
	}
	
	static void checkFood(String food) throws BadFoodException{
		if (food.equals("cucumber")){
			System.out.println("like the " + food);
		}
		else throw new BadFoodException(food);
		
		if (food.equals("")){
			;
		}
		else {
			try{checkFood("");}catch(BadFoodException e){}
		}
	}
}
