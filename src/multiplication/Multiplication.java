package multiplication;

import java.math.BigDecimal;

public class Multiplication {
	
	public static void main(String args[]){
		System.out.println(multiplyWithoutUsingMultiplySign(2,90));
		System.out.println(multiplyWithoutUsingMultiplySign(0,90));
		System.out.println(multiplyWithoutUsingMultiplySign(-123,0));
		System.out.println(multiplyWithoutUsingMultiplySign(0,0));
		System.out.println(multiplyWithoutUsingMultiplySign(-7,-5));
		System.out.println(multiplyWithoutUsingMultiplySign(7,-5));
		System.out.println(multiplyWithoutUsingMultiplySign(-7,5));
		System.out.println(multiplyWithoutUsingMultiplySign(1023,4842));
	}
	
	public static BigDecimal multiplyWithoutUsingMultiplySign(int firstNumber, int secondNumber){
	    
		int multResult = 0; // zero returned if first or second is zero 

	    if (firstNumber < 0 && secondNumber < 0){ //both negative
	        for (int i = firstNumber; i <= -1; i++)
	        	multResult-=secondNumber;    
	    }
	    
	    else if (firstNumber < 0){ //first negative
	        for (int i = 1; i <= secondNumber; i++)
	            multResult+=firstNumber;
	    }
	    else if (secondNumber < 0){ //second negative
	        for (int i = 1; i <= firstNumber; i++)
	            multResult+=secondNumber;
	    }
	    else {
	        for (int i = 1; i <= secondNumber; i++)
	            multResult+=firstNumber;    
	    }
	    return BigDecimal.valueOf((long)multResult);
	}
}
