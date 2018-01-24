package Interface;

public class Television implements RemoteControl, SerialCommunication
{
	public void turnOn()
	{
		System.out.println("티비가 켜졌습니다.");
	}
	public void turnOff()
	{
		System.out.println("티비가 꺼졌습니다.");
	}
	public void send(byte[] data)
	{
		System.out.println(data + "를 보냈습니다.");
	}
	public byte[] receive()
	{
		System.out.println("receive");
		return null;
	public void showPrice()
	{
		System.out.println("안녕");
	}
	
	}
}

