package genericLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportGeneratorUtility {
	public static ExtentReports report;
    public static ExtentTest logger;  
       
       static Calendar cal = Calendar.getInstance();
       static SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
public static String projectDirectory = System.getProperty("user.dir");
public static String ReportLocation=projectDirectory+"\\Reports\\ExecutionReport"+ sdf.format(cal.getTime())+".html";
    
public static void intialiseconfig()
{
    report=createInstance(ReportLocation);
}

private static ExtentReports createInstance(String fileName) {
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
    htmlReporter.loadXMLConfig("extent-config.xml");
    report = new ExtentReports();
    report.attachReporter(htmlReporter);
    report.setAnalysisStrategy(AnalysisStrategy.TEST);
    return report;
}

public static void PassCase (String ImgDesc,String imagename ) throws Exception
{
    String screenshot_path=ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, imagename);
    MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(screenshot_path).build();
    logger.pass(ImgDesc, mediaModel);
}

public static void FailCase (String failedDetail,String imagename ) throws Exception
{
	String screenshot_path=ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, imagename);
    MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(screenshot_path).build();
    logger.fail(failedDetail, mediaModel);
}
}

