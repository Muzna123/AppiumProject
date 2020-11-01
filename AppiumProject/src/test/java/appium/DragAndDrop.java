package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDrop {
	@Test
public void dragAndDrop() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Muzna");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.mobeta.android.demodslv");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".Launcher");
		cap.setCapability(MobileCapabilityType.UDID,"J8AAGF067640925");
		//cap.setCapability("noReset", true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.findElementById("com.mobeta.android.demodslv:id/activity_title").click();
		WebElement src = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/"
				+ "android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout"
				+ "/android.widget.FrameLayout/android.widget.ListView/"
				+ "android.view.ViewGroup[1]/android.widget.LinearLayout/"
				+ "android.widget.ImageView");
		WebElement desc =driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/"
				+ "android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/"
				+ "android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[4]/"
				+ "android.widget.LinearLayout/android.widget.ImageView");
		TouchAction ta=new TouchAction(driver);
		ta.press(src).waitAction(2000).moveTo(desc).release().perform();
		
		
}
}
