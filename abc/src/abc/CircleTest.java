package abc;

class Point
{
	private int x, y;
	//������
	public Point(int a, int b)
	{
		x=a;
		y=b;
		
		System.out.println("x=" + x + ", y=" + y);
	}
}

class Circle
{
	private int radius = 0;
	private Point center;	//Point ���� ������ �ʵ�� ����Ǿ� �ִ�.
	
	//������
	public Circle()
	{
		radius=0;
		center = new Point(0,0);
	}
	public Circle(Point p, int r)
	{
		center=p;
		radius=r;
		
		System.out.println("radius=" + radius);
	}
}

public class CircleTest {

	public static void main(String[] args) {
	//Circle ��ü�� �����ϰ� �ʱ�ȭ�Ѵ�.
		Point p = new Point(25, 78);
		Circle c = new Circle(p,10);

	}

}
