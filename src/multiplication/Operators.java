package multiplication;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Operators {
	
	public static void main(String... args){
		
		int a = 10;
		Double b2 = new Double (10);
		System.out.print(a + b2 + "\n");
	
		int y = 0;
		int x = 8;
		
		y = 20 + y/2 + (++x) + x++;
		
		boolean b = true;
		boolean b1 = false;
		System.out.println(b ^ b1);
		
		if(b){
			
		}
		
		else if (b1) {
			
		}
		
		else {
			for (int i = 0, u = 1; i < 9 && u > 2; i++, u --){
				i = (u>2) ? 10 : 6;
			}
		}
		
	}
}
