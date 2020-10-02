package SpiceJet_UI_Validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_SpiceJet_FrontPage {

	@Test 
	public static void openBrowser()
{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");//
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		driver.get("http://spicejet.com/");
		
		//driver.close();
		
	}

}
