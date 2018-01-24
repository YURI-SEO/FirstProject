package abc;

public class Car {

	//필드선언
	protected int speed;		//속도
	protected int gear;		//주행거리
	protected String color;		//색상
	
	public void speedUp(int increment)	
	{
		speed += increment;
	}
	public void speedDown(int decrement)
	{
		speed -= decrement;
	}
	public void print()
	{
		
	}
}
	
class SportsCar extends Car
{
	boolean turbo;
	
	public void setTurbo(boolean newValue)
	{
		
	}
	
	public void speedUp(int increment)	
	{
		speed = speed + 2 * increment;
	}
	public void speedDown(int decrement)
	{
		speed = speed - 2 * decrement;
	}
	
	public void print()
	{
		System.out.println("스포츠 카");
	}
}

	

	//생성자
	/*
	public Car()
	{
		color = "미정";
		speed = 0;
		gear = 0;
	}
	public Car(String col)
	{
		color = col;
		speed = 0;
		gear = 0;
	}
	public Car(String col, int a)
	{
		color = col;
		speed = a;
		gear = 0;
	}
	public Car(String col, int a, int b)
	{
		color = col;
		speed = a;
		gear = b;
	}
	
}*/

	//getter
	/*
	 * public int getSpeed()
	{
		return speed;
	}
	//setter
	public int setSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int value)
	{
		speed = value;
	}
	
	
	//메쏘드 선언
	
	public void print()
	{
		System.out.println(color +","+speed+","+gear);
	}
	
	public void start()
	{
		check_engine();
		check_oil();
	}
	
	public void check_engine()
	{
		System.out.println("엔진정상");
	}
	public void check_oil()
	{
		System.out.println("오일정상");
	}
	*/
	
