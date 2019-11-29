package genericLibrary;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

	public ScreenshotUtility(){
		
	}
	public static String takeSnapShot(WebDriver webdriver,String fileName) throws Exception{
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String destinationPath = System.getProperty("user.dir")+"\\Reports\\screenshots\\"+fileName+new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date())+".png";
		File DestFile = new File(destinationPath);
		FileUtils.copyFile(SrcFile, DestFile);
		return destinationPath;
    }
}
