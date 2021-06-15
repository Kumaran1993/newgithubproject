package Adactin.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OriginalTask {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("http://adactinhotelapp.com/");
driver.manage().window().maximize();
WebElement newuser = driver.findElement(By.xpath("//a[@href='Register.php']"));
newuser.click();
Thread.sleep(3000);
WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
name.sendKeys("Kumaran");
WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
pass.sendKeys("123456");
WebElement copass=driver.findElement(By.xpath("//input[@name='re_password']"));
copass.sendKeys("123456");
WebElement fname=driver.findElement(By.xpath("//input[@name='full_name']"));
fname.sendKeys("kumaranR");
WebElement email=driver.findElement(By.xpath("//input[@name='email_add']"));
email.sendKeys("kumaran@gmail.com");
WebElement captcha=driver.findElement(By.xpath("//img[@src='captcha.php?0.7791477344996924']"));













//Thread.sleep(3000);
//WebElement username = driver.findElement(By.name("//input[@id='username']"));
//username.sendKeys("kumaran");



		
		
	}
	
	

}
