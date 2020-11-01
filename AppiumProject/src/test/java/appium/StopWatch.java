package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class StopWatch {
	@Test
 public void stopWatch() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Muzna");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.deskclock");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.deskclock.DeskClock");
		cap.setCapability(MobileCapabilityType.UDID,"J8AAGF067640925");
		//cap.setCapability("noReset", true);
        URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To tap timer button
	    driver.findElementByXPath("//nh[@content-desc=\"Stopwatch\"]/android.widget.ImageView").click();
	    
	    //to tap play button
	  driver.findElementByXPath("//android.widget.LinearLayout"
	  		+ "[@package='com.google.android.deskclock']").click();
		
		//to tap stop button
		driver.findElementByXPath("//android.widget.LinearLayout"
				+ "[@package='com.google.android.deskclock']").click();
		
	//To take text of clock
		String text = driver.findElementById("com.google.android.deskclock:id/stopwatch_circle").getText();
	  /*  String text = driver.findElementByXPath("//android.view.View"
	    		+ "[@package='com.google.android.deskclock']").getText();*/
	    System.out.println(text);
	 /*   Thread.sleep(1000);
	    //To tap play button
	    driver.findElementByXPath("//android.widget.LinearLayout"
	    		+ "[@package='com.google.android.deskclock']").click();
	    driver.runAppInBackground(1);
	    Thread.sleep(2000);
	    //to tap stop button
		driver.findElementByXPath("//android.widget.LinearLayout[@package='com.google.android.deskclock']").click();
		//To get text of timer button
	    String text2 = driver.findElementById("com.google.android.deskclock:id/stopwatch_circle").getText();
	    System.out.println(text2);
	    
	    if(text2.compareTo(text)>0)
	    	System.out.println("Pass..");
	    else
	    	System.out.println("Fail.."); */
	  
 }
}
