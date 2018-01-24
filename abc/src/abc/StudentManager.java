package abc;

import java.util.Scanner;

public class StudentManager {

		public static final int MAX_PEOPLE = 20;
		private Student[] studentArray; 	//�л� ��ü�� ���� �� �ִ� �迭
		private int currentNumber;			//���� �� ���� �л��� ��ϵǾ� �ִ��� ����
			
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
			//�л� 1���� ����
			
			Scanner scan = new Scanner(System.in);
			System.out.print("�л��� ������ �Է��� �ּ���.");
			String name = scan.next();
			
			System.out.print("�л��� ����:");
			int number1 = scan.nextInt();
			a.setAge(number1);
			
			System.out.print("�л��� �̸�:");
			String number2 = scan.next();
			a.setName(number2);
			
			System.out.print("�л��� ����(M�Ǵ�F):");
			String gender=scan.next();
			if(gender.equals("M"))
			{
				a.setMan(true);
			}
			else
			{
				a.setMan(false);
			}
		
		
			System.out.print("�л��� �ּҴ�: ");
			String number4 = scan.next();
			a.setAddress(number4);
			
			System.out.print("�л��� ����ó��: ");
			String number5 = scan.next();
			a.setPhone(number5);
			
			//ȭ�鿡�� �Է� �޾Ƽ� �л��� ������ ����
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
			studentArray[currentNumber] = a;
			currentNumber++;
			System.out.println("�� " + currentNumber + " �� ��ϵǾ� �ֽ��ϴ�.");
			//�迭�� �л��� ����
			
			 
			//���� ������� ���� ++
//			Scanner scan = new Scanner(System.in);
			
			
		}	
			
			
			
			//for(int i = 0; i < STUDENTS; i++)
			//{
			//		System.out.print("ģ�� �̸��� �Է��Ͻÿ�:");
			//		name[i] = scan.nextLine();
			//}
			
			//Scanner scan = new Scanner(System.in);
			//�л��� new�ϱ�. 
			//Scanner scan = new Scanner(System.in);
			//student = scan.nextInt();
			//���� �л� ��ü�� �����.
			//scanner�� �л� ��ü ���� ����(setname,setage)
			//�迭�� �л� ����(studentArray[currentNum]=a
			//currentNum����(�ʱⰪ�� 0�̱� ����)
			//Scanner scan = new Scanner(System.in);
			//scan�� �̿��ؼ� �� student ��������� ���� �Է� ����
		
		
		public void findAndPrint(String name)

		{

			//�Է� ���� name�� ��ġ�ϴ� �л��� �ִ��� ã�Ƽ�

			//���� ��ġ�ϴ� �л��� ������ �� �л��� ���� ���

			//������ ��ġ�ϴ� ��� ���ٰ� ���

			for(int i=0; i<currentNumber; i++)

			{

				if(name.equals(studentArray[i].getName())) {

					studentArray[i].print();

					return;

				}

			}

			

			System.out.println(name + " �л��� ��ϵǾ� ���� �ʽ��ϴ�.");

		}




		public void printAll() {

			//���� ��ϵǾ� �ִ� �л����� ���� ���

			for(int i=0; i<currentNumber; i++)

			{

				System.out.println(i + "�� �л� ����");

				studentArray[i].print();

			}

		}

		

	}





//public static void main(String[] args) {
//	public class StudentManager {
		
		
//	}
//		