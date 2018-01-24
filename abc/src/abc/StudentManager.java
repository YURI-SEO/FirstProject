package abc;

import java.util.Scanner;

public class StudentManager {

		public static final int MAX_PEOPLE = 20;
		private Student[] studentArray; 	//학생 객체를 담을 수 있는 배열
		private int currentNumber;			//현재 몇 명의 학생이 등록되어 있는지 변수
			
		public StudentManager()
		{
			studentArray = new Student[MAX_PEOPLE];
			currentNumber = 0;
		}
		
		public StudentManager(int size)
		{
			studentArray = new Student[size];
			currentNumber = 0;
		}
		
		public void addStudent()
		{
			Student a = new Student(); 		
			//학생 1명을 생성
			
			Scanner scan = new Scanner(System.in);
			System.out.print("학생의 정보를 입력해 주세요.");
			String name = scan.next();
			
			System.out.print("학생의 나이:");
			int number1 = scan.nextInt();
			a.setAge(number1);
			
			System.out.print("학생의 이름:");
			String number2 = scan.next();
			a.setName(number2);
			
			System.out.print("학생의 성별(M또는F):");
			String gender=scan.next();
			if(gender.equals("M"))
			{
				a.setMan(true);
			}
			else
			{
				a.setMan(false);
			}
		
		
			System.out.print("학생의 주소는: ");
			String number4 = scan.next();
			a.setAddress(number4);
			
			System.out.print("학생의 연락처는: ");
			String number5 = scan.next();
			a.setPhone(number5);
			
			//화면에서 입력 받아서 학생의 정보를 저장
			System.out.println("입력이 완료되었습니다.");
			studentArray[currentNumber] = a;
			currentNumber++;
			System.out.println("총 " + currentNumber + " 명 등록되어 있습니다.");
			//배열에 학생을 대입
			
			 
			//현재 몇명인지 숫자 ++
//			Scanner scan = new Scanner(System.in);
			
			
		}	
			
			
			
			//for(int i = 0; i < STUDENTS; i++)
			//{
			//		System.out.print("친구 이름을 입력하시오:");
			//		name[i] = scan.nextLine();
			//}
			
			//Scanner scan = new Scanner(System.in);
			//학생을 new하기. 
			//Scanner scan = new Scanner(System.in);
			//student = scan.nextInt();
			//먼저 학생 객체를 만든다.
			//scanner에 학생 객체 정보 저장(setname,setage)
			//배열에 학생 저장(studentArray[currentNum]=a
			//currentNum증가(초기값이 0이기 때문)
			//Scanner scan = new Scanner(System.in);
			//scan을 이용해서 한 student 멤버변수의 값을 입력 받음
		
		
		public void findAndPrint(String name)

		{

			//입력 받은 name과 일치하는 학생이 있는지 찾아서

			//만약 일치하는 학생이 있으면 그 학생의 정보 출력

			//없으면 일치하는 사람 없다고 출력

			for(int i=0; i<currentNumber; i++)

			{

				if(name.equals(studentArray[i].getName())) {

					studentArray[i].print();

					return;

				}

			}

			

			System.out.println(name + " 학생은 등록되어 있지 않습니다.");

		}




		public void printAll() {

			//현재 등록되어 있는 학생들의 정보 출력

			for(int i=0; i<currentNumber; i++)

			{

				System.out.println(i + "번 학생 정보");

				studentArray[i].print();

			}

		}

		

	}





//public static void main(String[] args) {
//	public class StudentManager {
		
		
//	}
//		