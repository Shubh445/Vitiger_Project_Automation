package Sales;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Organization {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("appnavigator")).click();
		Thread.sleep(1000);
		
		WebElement ele= driver.findElement(By.xpath("//span[text()=' SALES']"));
		Actions action=new Actions(driver);          
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()=' Organizations'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Shubham");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.ShubhamR.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("9876543256");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("No Fax");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("6664994664");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("5566");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("abcdefgh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("xyz@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("Is In my Hand");
	
		Thread.sleep(1000);
		WebElement s1 = driver.findElement(By.id("select2-chosen-2"));
		Actions at= new Actions(driver);
		at.moveToElement(s1).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Communications']")).click();
		
		Thread.sleep(1000);
		WebElement s2 = driver.findElement(By.id("select2-chosen-4"));
		Actions atc= new Actions(driver);
		atc.moveToElement(s2).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Project Cancelled']")).click();
		Thread.sleep(1000);
		
		WebElement s3 = driver.findElement(By.id("select2-chosen-6"));
		Actions atct= new Actions(driver);
		atct.moveToElement(s3).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Partner']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("658849");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)"); //sroll  
		
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("150000");
		Thread.sleep(1000);
		
		WebElement s4 = driver.findElement(By.id("select2-chosen-8"));
		Actions atcti= new Actions(driver);
		atcti.moveToElement(s4).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Team Selling']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("bill_street")).sendKeys("pune");
		Thread.sleep(1000);
		driver.findElement(By.name("ship_street")).sendKeys("warje road");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("Deccan Bill Box");
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)"); //sroll  
		
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("Shivaji Nagar");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("Mumbai");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("Maharashtra");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("Karnataka");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("6897");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("8893");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(By.name("description")).sendKeys("India is my country all indians are my brothers");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-success saveButton']")).click();
		 
	
}
}