package Interface;

public class MyProgram {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone();
		Television.turnOff();
		Television.turnOn();
		Television.send(null);
		Television.receive();
		Television.print();

	}

}
