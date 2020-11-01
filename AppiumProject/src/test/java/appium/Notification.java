package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Notification {
	@Test
	public void notification() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Muzna");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.bhanu.notificationreminders");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".MainDrawerActivity");
		cap.setCapability(MobileCapabilityType.UDID,"J8AAGF067640925");
        URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement note_title=driver.findElementByXPath("//android.widget.EditText");
		driver.findElementById("com.bhanu.notificationreminders:id/txtNewNoteTitle").sendKeys("Please Notify me");
		driver.findElementById("com.bhanu.notificationreminders:id/btnNotify").click();
		driver.openNotifications();
		//driver.findElementByXPath("//android.widget.TextView[@text()='Please Notify me']").click();
		WebElement webElement = driver.findElementById("android:id/big_text");
		String text = webElement.getText();
		System.out.println(text);
		webElement.click();
		
		
		
		
	}

}
