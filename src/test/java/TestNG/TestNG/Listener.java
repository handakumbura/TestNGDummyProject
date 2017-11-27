package TestNG.TestNG;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Listener implements ISuiteListener{

	public void onFinish(ISuite arg0) {
		System.out.println("about to end suite");
		
	}

	public void onStart(ISuite arg0) {
		System.out.println("about to start suite\n"+arg0.getName()+"\t");
		
	}

}
