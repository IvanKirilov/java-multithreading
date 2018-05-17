package Thread18022017;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class Main {
	public static int temp=0;
	public static String message;
	
public static ScheduledThreadPoolExecutor exe;
	public static void main(String[] args) {
		Temperature temp1=new Temperature();
		Warning message1=new Warning();
		exe=new ScheduledThreadPoolExecutor(2);
		exe.scheduleAtFixedRate(temp1, 0, 5000,TimeUnit.MILLISECONDS);
		exe.scheduleAtFixedRate(message1, 100, 5000, TimeUnit.MILLISECONDS);
		

	}

}
