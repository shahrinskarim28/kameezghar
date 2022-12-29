package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver browserDriver;
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

	    browserDriver = new ChromeDriver();
	
	    browserDriver.get("http://www.kameezghar.com");
	}

}
