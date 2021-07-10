import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class phptravels {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Chrome driver version 91.0.4472124
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.phptravels.net/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div/div/div/div/nav/ul/li[4]/a")).click();
		js.executeScript("window.scrollBy(0,150)");
		WebElement destinationDropDown = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div"));
		Select dropdown = new Select(destinationDropDown);
		dropdown.selectByVisibleText("Legoland Malaysia Day Pass");
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"tourtype_chosen\"]/a/span"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		
		WebElement Tourdate = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
       	Tourdate.sendKeys("09072021");
       	
       	driver.findElement(By.xpath("//*[@id=\"tours\"]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]")).click();
       	driver.findElement(By.xpath("//*[@id=\"tours\"]/div/div/form/div/div/div[4]/button")).click();
       	
       	
       	Thread.sleep(5000);
       	js.executeScript("window.scrollBy(0,2000)");
       	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button")).click();
       	
       	Thread.sleep(5000);
       	driver.findElement(By.xpath("//*[@id=\"guesttab\"]")).click();
       	
					

	}

}
