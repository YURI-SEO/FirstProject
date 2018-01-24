package abc;

class Time
{
	private int hour;	//0-23
	private int minute;	//0-60
	private int second;	//0-60
	
	//ù��° ������
	public Time()
	{
		this(0,0,0);
	}
	//�ι�° ������
	public Time(int h, int m, int s)
	{
		setTime(h, m, s);
	}
	//�ð� ���� �Լ�
	public void setTime(int h, int m, int s)
	{
		hour = ((h>=0 && h<24) ? h : 0); 	//�ð� ����
		minute = ((m>=0 && m<60) ? m : 0); 	//�� ����
		second = ((s>=0 && s<60) ? s : 0); 	//�� ����
	}
	
	//"��:��:��"�� �������� ���
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}

public class TimeTest {

	public static void main(String[] args) {
		//Time ��ü�� �����ϰ� �ʱ�ȭ�Ѵ�.
		Time time = new Time();
	
		System.out.print("�⺻ ������ ȣ�� �� �ð�: ");
		System.out.println(time.toString());
		
		//�� ��° ������ ȣ��
		Time time2 = new Time(13, 27, 6);
		System.out.print("�� ��° ������ ȣ�� �� �ð�: ");
		System.out.println(time2.toString());
		
		//�ùٸ��� ���� �ð����� �A���غ���. 
		Time time3 = new Time(12, 66, 77);
		System.out.print("�ùٸ��� ���� �ð� ���� �� �ð�: ");
		System.out.println(time3.toString());
	}

}
