package abc;



public class Student {
	//멤버 변수
		private String name;
		private int age;
		private boolean isMan;
		private String address;
		private String phone;
	//생성자
	public Student() 
	{	
	}

	public Student(String n, int num, boolean man, String add, String ph)
	{
		name=n;
		age=num;
		isMan=man;
		address=add;
		phone=ph;	
	}
	
	//메쏘드
	
	//name getter(name을 return)
	//name setter(입력받은 value를 name에 대입)

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void print()
	{
		System.out.println("이름은: "+name);
		System.out.println("나이: "+age);
		if(isMan)
		{
			System.out.println("성별은: 남자");
			
		}
		else
			{
			System.out.println("성별은: 여자");	
			}
		System.out.println("주소는: "+address);
		System.out.println("연락처는: "+phone);
	}
}
