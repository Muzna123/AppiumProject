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

public class DragAndDropTouchAction {
@Test	
public void dragAndDropTouchAction() throws MalformedURLException {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Muzna");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
	cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
	cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"ApiDemos");
	cap.setCapability("app","C:\\ApiDemos-debug.apk");
	cap.setCapability(MobileCapabilityType.UDID,"J8AAGF067640925");
	cap.setCapability("noReset", true);
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,cap);
    driver.findElementByAccessibilityId("Views").click();
    driver.findElementByAccessibilityId("Drag and Drop").click();
    WebElement src = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
    WebElement desc = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
    TouchAction ta=new TouchAction(driver);
    ta.press(src).waitAction(2000).moveTo(desc).release().perform();
    
}
}
