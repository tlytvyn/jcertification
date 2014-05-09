package pac1;

public class Bb {
	
	int a;
	protected double b;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		long temp;
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Bb))
			return false;
		Bb other = (Bb) obj;
		if (a != other.a)
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		return true;
	}

	public Bb(){}
	
	public Bb (int c, String h){
		this(c);
	}
	
	public Bb (int a){
		this.a = a;
	}
	
	public void m1(){
		System.out.println("aaaa");
	}

	public void m3(){
		System.out.println("hhhhhhhhhh");
	}
	
	public void print(Object sshhh){
		System.out.println(sshhh + "Obejct method");
	}
}
