
public class RubberDuck extends Duck {

	@Override
	void display() {
		System.out.println("Look like a rubber");
	}
	@Override //Duck quack(); 
	void quack() {
		System.out.println("Squack! Squack!");	
	}
	@Override
	void fly() {
		
	}

}
