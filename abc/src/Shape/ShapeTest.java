package Shape;

public class ShapeTest {
	public static void main(String arg[]) 
	{
		Rectangle rec = new Rectangle();
		rec.draw();
		
		Circle cir = new Circle();
		cir.draw();
		
		rec.move(1, 1);
		
		cir.move(2, 2);
		
	}
}
