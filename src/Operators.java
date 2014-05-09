
public class Operators {

	
	public static void main(String [] args){
		
		int t = 1;
		char y = '2';
		
		switch(y){
			case '2': System.out.print("not0"); break;
			case 'a': System.out.print("not1");
			case 'd': System.out.print("not2");
			default: System.out.print(t);
			
		}
		
		for (int x = 10, y1 = 3; y1 <= 3; y1++) { 
			System.out.println(x);
		}
		
		int age = 14;
		outer:
			while(age <= 17){
				age++;
				if (age == 16){
					System.out.println("get your driver's license");
					continue outer;
				}
				else System.out.println("another year");
				
			}
		
		int y1 = 9;
		int x2 = y1++;
		
		int y2 = 9;
		int x3 = ++y2;
		System.out.println(y1);
		System.out.println(x2);
		System.out.println(y2);
		System.out.println(x3);
		
		x3 = (x3>8 ? 12 : 100);
		
		System.out.println(x3);
		
	}
	
}
