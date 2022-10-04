package lamp;

public class Lamp {
	String model;
	String tension;
	int power;
	String color;
	boolean on;
	
	void turnOn() {
		on = true;
	}
	
	void turnOff() {
		on = false;
	}
	
	void showState() {
		if(on) {
			System.out.println("The lamp is on");
		}
		else {
			System.out.println("The lamp is of");
		}
	}
	
	void changeState() {
		if (on) {
			turnOff();
		}
		else {
			turnOn();
		}
	}
}
