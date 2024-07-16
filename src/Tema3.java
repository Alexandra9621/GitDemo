import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tema3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//div/div/label[1]/following-sibling::label[1]")).click();
	
		//driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("okayBtn")));
	    driverWait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn"))); 

		driver.findElement(By.id("okayBtn")).click();
        WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));
        Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("span.text-white")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='card-footer']/button")));
		
		addItems(driver);
		driver.findElement(By.xpath("//ul[@class='navbar-nav ml-auto']/li")).click();
		}
	
	public static void addItems(WebDriver driver) {
		
		List<WebElement> addButtons = driver.findElements(By.xpath("//div[@class='card-footer']/button"));
		for(int i=0; i<addButtons.size(); i++) {
			WebElement button = addButtons.get(i);
			if(button != null && button.getText().trim().equals("Add")) {
				button.click();
			}
		}
		
	
	}
}