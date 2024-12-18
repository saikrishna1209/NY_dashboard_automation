package baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public static WebDriver driver;
	public static String browser = "Chrome";
	public static String urlfleat = "https://dashboard.integ.moving.tech/fleetDashboard/drivers";
	
	
	@BeforeTest
	public void setup ()throws InterruptedException {
		
		switch(browser) {
		case "Chrome":
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			break;
		}
		case "Firefox": 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		case "Edge":
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		case "Safari" :
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		}
		default:
		{
			System.out.println("No Browser selected!");
			break;
		}
		
	}	
		driver.get(urlfleat);
		System.out.println("Started....launching Fleat in browser");
		driver.manage().window().maximize();
		System.out.println("Running tests......");
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException  
	{
		System.out.println("Tests Ended...");
		if (driver != null)
		{
			driver.quit();
			System.out.println("Browser session closed..");
		}
	}

}



