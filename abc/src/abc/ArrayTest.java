package abc;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		final int STUDENTS = 5;

		Scanner scan = new Scanner(System.in);
		String[] name = new String[STUDENTS];
		for(int i = 0; i < STUDENTS; i++)
		{
				System.out.print("친구 이름을 입력하시오:");
				name[i] = scan.nextLine();
		}

	}

}
