package git.karthick;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class program1 {

	public static void main(String[] args) {
		program1 pg=new program1();
		pg.setup("chrome","https://www.meesho.com/");

	}
	static RemoteWebDriver driver;
	public static void setup(String browser,String url)
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\May_Cucumber\\drivers\\chromedriver.exe");
		switch((browser).toLowerCase())
		{
		case "chrome":              
			driver=new ChromeDriver();
		break;
		case "firefox":
			driver=new FirefoxDriver();
		break;
		default:
			System.out.println("driver not found");
			break;
		}
		driver.get(url);
		driver.manage().window().maximize();	
		
	}

}
