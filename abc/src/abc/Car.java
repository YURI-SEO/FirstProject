package abc;

public class Car {

	//�ʵ弱��
	protected int speed;		//�ӵ�
	protected int gear;		//����Ÿ�
	protected String color;		//����
	
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
		System.out.println("������ ī");
	}
}

	

	//������
	/*
	public Car()
	{
		color = "����";
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
	
	
	//�޽�� ����
	
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
		System.out.println("��������");
	}
	public void check_oil()
	{
		System.out.println("��������");
	}
	*/
	
