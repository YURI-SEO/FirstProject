package abc;

class Point
{
	private int x, y;
	//생성자
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
	private Point center;	//Point 참조 변수가 필드로 선언되어 있다.
	
	//생성자
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
	//Circle 객체를 생성하고 초기화한다.
		Point p = new Point(25, 78);
		Circle c = new Circle(p,10);

	}

}
