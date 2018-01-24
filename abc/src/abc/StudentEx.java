package abc;

public class StudentEx {

	public static void main(String[] args) {
		Student man = new Student();
		man.setAge(28);
		man.setName("서유리");
		man.setAddress("부산진구");
		man.setPhone("010-9631-1299");
		man.setMan(false);
	
		man.print();
		
		Student park = new Student();
		park.setAge(30);;
		park.setName("박진영");
		
	}

}
