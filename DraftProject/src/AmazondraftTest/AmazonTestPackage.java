package AmazondraftTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestPackage {
 
	
		
			public static void main(String[] args) throws InterruptedException {
				
				
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.amazon.com");
				driver.get("https://www.amazon.com/deals?ref_=nav_cs_gb");
			    driver.manage().window().maximize();
				
				Thread.sleep(3000);
						
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,500)");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/a/span[1]")).click();
				
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/a/span[2]")).click(); //amazon devices
				Thread.sleep(1000);

				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[3]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[4]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[5]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[6]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[7]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[8]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[9]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[10]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[11]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[12]/a/span[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[13]/a/span[2]")).click();
				Thread.sleep(1000);
				
				JavascriptExecutor jse3 = (JavascriptExecutor)driver;
				jse3.executeScript("window.scrollBy(0,8000)");
				
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[11]")).click();
				
				
				driver.navigate().back();
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]")).click();
				
				
				
				
				
				
				
				
				//driver.findElement(By.xpath("//*[@id="navFooter"]/div[4]/table/tbody/tr[5]/td[11]")).click();
				//driver.findElement(By.xpath("")).click();
				
				
				
				
				
				
				
				
				
				
				//JavascriptExecutor jse1 = (JavascriptExecutor)driver;
				//jse1.executeScript("window.scrollBy(0,-5000)");
				
				
				//driver.findElement(By.id("nav-hamburger-menu")).click();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//WebElement burger = driver.findElement(By.id("nav-hamburger-menu"));
				
				
				
				
				
				
				
				/*  @FindBy(xpath= "//*[@id=\"nav-hamburger-menu\"]")
				    public WebElement all;

				    @FindBy(xpath= "//div[contains(text(),'Prime Video')]")
				    public WebElement primeVdo;

				    @FindBy(xpath= "//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a")
				    public WebElement includedPrime;*/
				
			
				
				//driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
				
				
				//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();

				
				/*WebElement cart = driver.findElement(By.id("nav-cart"));
				driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
				
				
				WebElement cartq = driver.findElement(By.id("nav-cart"));
				driver.findElement(By.xpath("//span[@id='a-autoid-4-announce']")).click();*/
				
				
					
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*WebElement userId = driver.findElement(By.id("email"));
				WebElement password = driver.findElement(By.name("password"));
				WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submitBtn\"]"));*/
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	
}
}
