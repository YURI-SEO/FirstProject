package Interface;

public class Television implements RemoteControl, SerialCommunication
{
	public void turnOn()
	{
		System.out.println("Ƽ�� �������ϴ�.");
	}
	public void turnOff()
	{
		System.out.println("Ƽ�� �������ϴ�.");
	}
	public void send(byte[] data)
	{
		System.out.println(data + "�� ���½��ϴ�.");
	}
	public byte[] receive()
	{
		System.out.println("receive");
		return null;
	public void showPrice()
	{
		System.out.println("�ȳ�");
	}
	
	}
}

