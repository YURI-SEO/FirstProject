package abc;

import java.util.Scanner;

class DiceGame{
	//�����Է�
	int diceFace;
	int userGuess;
	
	//�����ڴ� ����
	
	//�޼ҵ�
	private void RollDice()
	{
		diceFace = (int)(Math.random()*6) + 1;
	}
	
	private int getUserInput(String prompt)
	{
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	private void checkUserGuess()
	{
		if(diceFace==userGuess)
			System.out.println("�¾ҽ��ϴ�");
		else
			System.out.println("Ʋ�Ƚ��ϴ�");
	}
	
	public void startPlaying()
	{
		//����ڷκ��� ���� �ϳ��� �Է¹޾Ƽ� userGuess�� �����Ѵ�. 
		userGuess = getUserInput("������ �Է��Ͻÿ�: ");
		//�ֻ縦 ������.
		RollDice();
		//�� ���ڸ� ���Ѵ�. (�̻� 3�� ��ɹ� ���� ����!)
		checkUserGuess();
	}
	
}

public class DiceGameTest{
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
	
}
	
