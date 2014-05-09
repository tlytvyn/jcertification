package pac2;

class Animal {
	void stinky() {
		System.out.println("stinky animal !");
	}
	
	G h(){
		Dog d = new Dog();
		return d;
	}
}
 
class Dog extends Animal implements G{
	public void stinky() {
		System.out.println("stinky dog !");
	}
 
	public void bark() {
		System.out.println("wow wow");
	}
}
 
class Cow extends Animal {
	public void stinky() {
		System.out.println("stinky cow !");
	}
}
 
class TestOverrding {
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.stinky();
		
		Dog obj2 = (Dog) obj;
		obj2.stinky();
		
		System.out.println(obj instanceof Dog);
		System.out.println(obj instanceof Animal);
	}
}