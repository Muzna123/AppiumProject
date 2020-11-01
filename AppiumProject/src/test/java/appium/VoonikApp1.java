package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonUtils.AndroidBaseClass;
import commonUtils.AndroidDriverCommonLib;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class VoonikApp1 extends AndroidDriverCommonLib{
	@Test
public void voonikApp1() throws MalformedURLException {
		
		driver.findElementByXPath("//android.support.v7.app.a.c[@content-desc=\"CATEGORIES\"]/"
				+ "android.widget.TextView").click();
		WebElement jeans=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"MEN CASUAL SHOES\"))");
		jeans.click();
		ArrayList<String> al=new ArrayList<String>();
		driver.findElementByXPath("//android.widget.TextView[@text='Black trekking boots for Men']").click();
		driver.findElementById("com.mrvoonik.android:id/MageNative_wishlist").click();
		scrollBottomToTop();
		al.add(driver.findElementById("com.mrvoonik.android:id/MageNative_productname").getText());
		System.out.println(al);
		driver.longPressKeyCode(AndroidKeyCode.BACK);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Blue Casual shoes for men']").click();
		driver.findElementById("com.mrvoonik.android:id/MageNative_wishlist").click();
		scrollBottomToTop();
		al.add(driver.findElementById("com.mrvoonik.android:id/MageNative_productname").getText());
		System.out.println(al);
		driver.longPressKeyCode(AndroidKeyCode.BACK);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Blue Stripes Casual shoe for Men']").click();
		driver.findElementById("com.mrvoonik.android:id/MageNative_wishlist").click();
		scrollBottomToTop();
		al.add(driver.findElementById("com.mrvoonik.android:id/MageNative_productname").getText());		
		System.out.println(al);
		driver.longPressKeyCode(AndroidKeyCode.BACK);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Casual shoes for men']").click();
		driver.findElementById("com.mrvoonik.android:id/MageNative_wishlist").click();
		scrollBottomToTop();
		al.add(driver.findElementById("com.mrvoonik.android:id/MageNative_productname").getText());
		System.out.println(al);
		driver.longPressKeyCode(AndroidKeyCode.BACK);
		
		driver.longPressKeyCode(AndroidKeyCode.BACK);
		
		driver.findElementById("com.mrvoonik.android:id/wishlist").click();
		
		 List<WebElement> wishListProd= driver.findElementsByXPath("//android.widget.TextView[@resource-id='com.mrvoonik.android:id/name']");
		 ArrayList<String> al1= new ArrayList<String>();
		 for(WebElement prod:wishListProd) {
			 al1.add(prod.getText());
		 }
		System.out.println("---------------");
		System.out.println(al);
		System.out.println(al1);
		Assert.assertEquals(al, al1);
		System.out.println("Pass...........");

}
}
