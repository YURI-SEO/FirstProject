package abc;

import java.util.Scanner;

public class ArrayTest2difficultnnnnnnnn {

	public static void main(String[] args) {
		final int STUDENTS = 5;

		String[] name = new String[STUDENTS];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < STUDENTS; i++)
		{
				System.out.print("친구 이름을 입력하시오:");
				name[i] = scan.nextLine();
		}
		
		for(int i=0; i<STUDENTS; i++)
		{
			System.out.print(name[i]);
			if(i==4)
			{
				break;
				
			}
			System.out.print(" , ");
		}

	}

}