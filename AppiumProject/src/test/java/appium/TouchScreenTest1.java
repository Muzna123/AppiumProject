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

public class TouchScreenTest1 {
	@Test
public void touchScreenTest1() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Muzna");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"jp.rallwell.siriuth.touchscreentest");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".TouchScreenTestActivity");
		cap.setCapability(MobileCapabilityType.UDID,"J8AAGF067640925");
		cap.setCapability("noReset", true);
        URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		int startx0=(int)(width*.2);
		int starty0=(int)(height*.8);
		int endx0=(int)(width*.8);
		int endy0=(int)(height*.2);
		driver.swipe(startx0, starty0, endx0, endy0, 500);
		
		int startx=(int)(width*.2);
		int starty=(int)(height*.2);
		int endx=(int)(width*.2);
		int endy=(int)(height*.8);
		
		int startx1=endx;
		int starty1=endy;
		int endx1=(int)(width*.8);
		int endy1=(int)(height*.8);
		driver.swipe(startx, starty, endx, endy, 500);
		driver.swipe(startx1, starty1, endx1, endy1, 500);
}
}
