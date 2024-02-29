package genericLiberary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods implements FrameWorkConstant {
	
public String getCurrentTime() {
		
		LocalDateTime l = LocalDateTime.now();
		return l.toString().replace(":", "-");
	}
	
	public int getRandomNumber() {
		Random r = new Random();
		return r.nextInt(10000);
	}
	
	public String takeScreenShots(WebDriver driver) throws IOException {
		
		String path =  screenshot_path+getCurrentTime()+".png";
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(path);
		FileHandler.copy(src, trg);
		return "."+path;
		
	}

}
