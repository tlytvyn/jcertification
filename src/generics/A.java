package generics;

public class A<T> extends Page{
	
	public T untypeReferenceV;
	public int by;
	
	public A(){}

	public A(T uRV, int b){
		this.untypeReferenceV = uRV;
		this.by = b;
	}
	
	@Override
	public String getTitle() {
		return "PageA";
	}

}
