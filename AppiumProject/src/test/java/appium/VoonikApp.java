package appium;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

@Test
public class VoonikApp {
	public void voonikApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Muzna");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.mrvoonik.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".splashsection.Splash");
		cap.setCapability(MobileCapabilityType.UDID,"J8AAGF067640925");
		//cap.setCapability("noReset", true);
        URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Drawer Open").click();
		driver.findElementById("com.mrvoonik.android:id/catname").click();
		driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"image\"])[3]").click();
		Dimension dem=driver.manage().window().getSize();
		double x = dem.getWidth();
		double y = dem.getHeight();
		int startx=(int)(x/2);
		int starty=(int)(y*0.8);
		int endx=startx;
		int endy=(int)(y*0.4);
		driver.swipe(startx, starty, endx, endy, 500);
		driver.findElementByXPath("//android.widget.TextView[@text='Size : L']").click();
		driver.swipe(startx, starty, endx, endy, 500);
		Thread.sleep(1000);
		String expText = driver.findElementById("com.mrvoonik.android:id/MageNative_productname").getText();
		System.out.println(expText);
		driver.findElementById("com.mrvoonik.android:id/addtocart").click();
		driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"image\"])[1]").click();
		String actText = driver.findElementById("com.mrvoonik.android:id/productname").getText();
		System.out.println(actText);
	    if(actText.equals(expText))
          System.out.println("Test Case pass");
          else
        	  System.out.println("Test case fail");
	}

}
