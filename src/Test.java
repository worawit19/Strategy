
public class Test {
	
	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		md.display();
		md.fly();
		md.quack();
		md.swim();
		
		System.out.println("---------");
		
		RedheadDuck rd = new RedheadDuck();
		rd.display();
		rd.fly();
		rd.quack();
		rd.swim();
		
		System.out.println("---------");
		
		RubberDuck rud = new RubberDuck();
		rud.display();
		rud.fly();
		rud.quack();
		rud.swim();
		
		System.out.println("---------");
		
		Duck d2 = new RedheadDuck();
		d2.display();
		d2.quack();
		
		System.out.println("---------");
		
		d2 = new RubberDuck();
		d2.display();
		d2.quack();
		d2.fly();
		
		MallardDuck d4 = new MallardDuck();
		d4.quack();

	}

}
