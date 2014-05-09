public class Ouch {
	int ouch = 7;
	public static void main(String[] args) {
		Ouch oh = new Ouch();
		new Ouch().go(oh);
		int y = oh.ouch;
		y = 9;
		System.out.print(oh.ouch);
		System.out.print(y);
		
		int a = 10;
		oh.ouch = 11;
		a = oh.ouch;
		a = 15;
		System.out.println(oh.ouch);
		
		Example e1 = new Example();
		Example e2 = e1;
		
		int x1 = 100;
		int x2 = 123;
		System.out.println("" + x1 + x2);
	}

	void go(Ouch o) {
		o.ouch++;
		for(int ouch1 = 3; ouch1 < 6; ouch1++)
			;
		System.out.print(o.ouch);
	}
	
	static void doStuff(int[] doArgs) { }
}