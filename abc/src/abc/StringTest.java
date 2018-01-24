package abc;

public class StringTest {

	public static void main(String[] args) {
		String banana = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("문자열의 길이 = " + banana.length());
		
		s1 = banana.concat("never Bites!");
		s2 = banana.replace("A", "a");
		s3 = banana.substring(3,5);
		s4 = banana.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}

}
