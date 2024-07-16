import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemaLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Alexandra Meghesan");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("meghesanalexandra@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Noiembrie@1996");
		driver.findElement(By.cssSelector("label[for='exampleCheck1']")).click();
		WebElement staticDropdown = driver.findElement(By.cssSelector("select#exampleFormControlSelect1"));
	    
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector("label[for='inlineRadio2']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("1996-07-21");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();		
	}
}
