package lamp;

public class Lamp01 {

	public static void main(String[] args) {
		Lamp lamp01 = new Lamp();
		lamp01.color = "white";
		lamp01.model = "one";
		lamp01.power = 75;
		lamp01.turnOn(); 
		
		System.out.println("The lamp is on?: " + lamp01.on);
		
		lamp01.turnOff();
		
		System.out.println("The lamp is on? " + lamp01.on);
		
		lamp01.changeState();
		
		System.out.println("The lamp is on? " + lamp01.on);
		
		lamp01.changeState();
	}

}
