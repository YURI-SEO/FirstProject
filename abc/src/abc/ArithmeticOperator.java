package abc;

import java.util.Scanner;


public class ArithmeticOperator {

	public static void main(String[] args) {

			int grade;
			
			Scanner b = new Scanner(System.in);
			
			grade =b.nextInt();
			
			if(grade>=60)
			{
				System.out.println("합격입니다");
			}
			else
			{
				System.out.println("불합격입니다.");
			}
			
	}

}
