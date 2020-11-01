package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchAmazon {
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","Muzna");
		cap.setCapability("automationName","appium");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","8.1.0");
		cap.setCapability("appPackage","in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity","com.amazon.mShop.android.home.HomeActivity");
		cap.setCapability("UDID","J8AAGF067640925");
		cap.setCapability("noReset", true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
	}
}
