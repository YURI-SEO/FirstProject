package abc;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		int income;
		int tax;
		System.out.print("과세 표준 금액을 입력하시오:");
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
		System.out.println("소득세는 " + tax +"입니다");
	}

}
