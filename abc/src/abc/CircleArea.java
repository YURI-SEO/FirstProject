package abc;

import java.util.Scanner; //프로그램은 스캐너 클래스를 사용한다.

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius; 	//원의 반지름
		double area;	//원의 면적
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하시오:");	//입력 안내 출력
		radius=input.nextDouble();
		area=3.14*radius*radius;
		
		System.out.println(area);
		
		
	}

}
