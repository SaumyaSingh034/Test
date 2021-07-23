package resources;

import java.io.FileInputStream;
import java.util.Properties;

public class Base {
	
	public initializeWebDriver()
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium\\RealTimeProjects\\PagaObjectProjectPractice\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		
	}

}
