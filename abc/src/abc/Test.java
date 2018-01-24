package abc;

public class Test {

	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color = "red";
		c.speedUp(100);
		c.speedUp(10);
		c.setTurbo(true);
	
		SUVCar suv = new SUVCar();
		suv.gear = 1;
		suv.speed = 10;
		suv.window = 4;
		suv.print();
		
		c.print();
		
	}

}
