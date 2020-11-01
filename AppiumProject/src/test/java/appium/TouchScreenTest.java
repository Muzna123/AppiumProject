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

public class TouchScreenTest {
	@Test
	public void touchScreenTest() throws MalformedURLException {
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
		int startx=(int)(width*.8);
		int starty=(int)(height*.8);
		int endx=(int)(width*.2);
		int endy=(int)(height*.2);
		driver.swipe(startx, starty, endx, endy, 500);
	}

}
