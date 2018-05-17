package Thread18022017;

import java.util.Random;

public class Temperature implements Runnable {

	@Override
	public void run() {
		Random rnd=new Random();
		Main.temp=rnd.nextInt(100)+1;
			System.out.println(Main.temp);
			
		
	}

}
