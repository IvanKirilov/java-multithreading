package Thread18022017;

public class Warning implements Runnable {

	@Override
	public void run() {
		if(Main.temp<=10){
			System.out.println("Put a hat on your head");
			
		}
		if(11<=Main.temp&&Main.temp<=30){
			System.out.println("Take off your hat");
	}
		if(31<=Main.temp&&Main.temp<=40){
			System.out.println("Don't be outside");
		}
		if(41<=Main.temp&&Main.temp<=100){
			System.out.println("Go on the fridge");
		}
	}
}
