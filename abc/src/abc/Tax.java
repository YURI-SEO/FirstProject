package abc;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		int income;
		int tax;
		System.out.print("���� ǥ�� �ݾ��� �Է��Ͻÿ�:");
		Scanner input = new Scanner(System.in);
		income = input.nextInt();
		if (income<=1000)
		{
			tax=(int) (0.09*income);
		}
		else if (income<=4000)
		{
			tax = (int)(1000*0.09+0.18*(income-1000));
		}
		else
		{
			tax = (int)(1000*0.09+3000*0.18+4000*0.27+0.36*(income-8000));
		}
		System.out.println("�ҵ漼�� " + tax +"�Դϴ�");
	}

}
