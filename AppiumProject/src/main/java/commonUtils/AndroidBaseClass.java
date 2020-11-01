package commonUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidBaseClass {
	
	public static AndroidDriver driver;
	public static AndroidFileLib f=new AndroidFileLib();
	public static AndroidDriverCommonLib c=new AndroidDriverCommonLib();
	
	@BeforeSuite
	public void connnectDB() {
		System.out.println("DB connection start.......");
	}
	/*public static Connection connectToDataBase() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
			Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hibernate","root","root");
			return connection;
		}*/
	@BeforeClass
	public void openBrowser() throws MalformedURLException {
		System.out.println("Launching  browser and App");
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
		driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser close");
		//driver.close();
	}

	@AfterSuite
	public void closeDB() {
		System.out.println("DB connection close....");
	}
	
}
