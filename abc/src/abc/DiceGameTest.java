package abc;

import java.util.Scanner;

class DiceGame{
	//변수입력
	int diceFace;
	int userGuess;
	
	//생성자는 없음
	
	//메소드
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
			System.out.println("맞았습니다");
		else
			System.out.println("틀렸습니다");
	}
	
	public void startPlaying()
	{
		//사용자로부터 숫자 하나를 입력받아서 userGuess에 저장한다. 
		userGuess = getUserInput("예상값을 입력하시오: ");
		//주사를 돌린다.
		RollDice();
		//두 숫자를 비교한다. (이상 3개 명령문 순서 주의!)
		checkUserGuess();
	}
	
}

public class DiceGameTest{
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
	
}
	
