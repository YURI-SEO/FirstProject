package abc;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		number = scan.nextInt();
		switch (number)
		{
			case 0:
				System.out.println("����");
				System.out.println("00000");
				break;
			case 1:
				System.out.println("�ϳ�");
				break;
			case 2:
				System.out.println("��");
				break;
			default:
				System.out.println("����");
				break;
		}
		
	
	}

}