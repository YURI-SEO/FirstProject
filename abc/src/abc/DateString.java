package abc;

public class DateString {

	public static void main(String[] args) {
		
	String datestr = "2017-01-17";
	
	String temp = datestr.replaceAll("-","");
	System.out.println(temp);
	
	String a = "2017";
	int result = Integer.parseInt(a);
	System.out.println(result);
	
	String b = "3.14f";
	float c = Float.parseFloat(b);
	System.out.println(c);
	
	
	}

}
