package abc;

public class ClassEx {

	public static void main(String[] args) {
		
		Student woman = new Student("������",28,false,"�λ�����","01096311299");
		woman.print();
		
		String str = "yuri";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		
		System.out.println(str.compareTo("xuri"));
		System.out.println(str.compareTo("yuri"));
		System.out.println(str.compareTo("zuri"));
		
		System.out.println(str.concat(" Seo"));
		
		System.out.println(str.equals("yujin"));
		System.out.println(str.equals("YUri"));
		System.out.println(str.equals("yuri"));
		
		System.out.println(str.equalsIgnoreCase("yuRI"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.length());
		
		System.out.println(str.replace("y","Seo y"));
		
		System.out.println(str.substring(0,3));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
	}

}
