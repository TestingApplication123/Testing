package helps;

import org.openqa.selenium.remote.RemoteWebDriver;

public class testing 
{
	public static void main(String[] args) 
	{
		RemoteWebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		

		System.setProperty("webdriver.ie.driver", "./drivers/InternetExplorerdriver.exe");

		System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
		

		System.setProperty("webdriver.edge.driver", "./drivers/geckodriver.exe");

		System.setProperty("webdriver.safari3.driver", "./drivers/geckodriver.exe");

		

	}
}
