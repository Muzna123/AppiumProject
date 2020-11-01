package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchCalculator {
	public static void main(String[] args) throws MalformedURLException {
		
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Muzna");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.asus.calculator");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.asus.calculator.Calculator");
		    cap.setCapability(MobileCapabilityType.UDID,"J8AAGF067640925");
			cap.setCapability("noReset", true);
			URL url=new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver=new AndroidDriver(url,cap);
		}
	}


