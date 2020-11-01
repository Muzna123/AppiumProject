package commonUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;

import org.openqa.selenium.Dimension;

public class AndroidDriverCommonLib extends AndroidBaseClass{

	public void scrollBottomToTop() {
		Dimension dem=driver.manage().window().getSize();
		double x = dem.getWidth();
		double y = dem.getHeight();
		int startx=(int)(x/2);
		int starty=(int)(y*0.8);
		int endx=startx;
		int endy=(int)(y*0.4);
		driver.swipe(startx, starty, endx, endy, 500);
	}
}
