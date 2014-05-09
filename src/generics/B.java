package generics;


public class B extends Page implements BasicPage{

	public int ay;
	
	
	@Override
	public void expandPage() {
		System.out.println("B expanded");
	}

	@Override
	public String getTitle() {
		return "PageB";
	}

	/*
	@Override
	public String getTitle() {
		return "pageB";
	}*/

}
