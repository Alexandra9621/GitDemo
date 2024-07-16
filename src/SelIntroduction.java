import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntroduction {

	public static void main(String[] args) {
	
		//Invoking BrowserChromeDriver ->Methods
		//Chrome - ChromeDriver ->Methods
		//Firefox - FirefoxDriver ->Methods
		//WebDriver close get
		//WebDriver methods + class methods
		
		//   chromedriver.exe -> Chrome browser Selenium Manager (merge sa invoci browserul si fara linia 17 de cod)
		// daca totusi pui linia, o sa fie mai rapida executia deoarece ai chromedriver-ul local
		//step to invoke chrome driver // 
		//System.setProperty("webdriver.chrome.driver", "C:/Users/testi/Documents/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		   //Firefox Launch
        //geckodriver
       
        //webdriver.gecko.driver
       // System.setProperty("webdriver.gecko.driver", "C:/Users/testi/Documents/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
		
        
        //Microsoft Edge Launch
		System.setProperty("webdriver.chrome.driver", "C:/Users/testi/Documents/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		
		
		driver.get("https://siteclick.ro");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit(); //inchide toate paginile deschise si in alte taburi de la url ul initial
        
	}

}