package marathon.week2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class TestCase2ServiceNow {
	
	//Marathon-2 test case-2

	public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver d=new ChromeDriver();
	//Launch ServiceNow application using https://dev200784.service-now.com/
	d.get("https://dev200784.service-now.com/");
	//Maximize the window
	d.manage().window().maximize();
	//Add implicit wait
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Login with valid credentials username as admin and password as  I-Ks*dzGjO63
	d.findElement(By.id("user_name")).sendKeys("admin");
	d.findElement(By.id("user_password")).sendKeys("I-Ks*dzGjO63");
	d.findElement(By.id("sysverb_login")).click();
	//Click-All button and Click the ServiceCatalog
	Shadow sh=new Shadow(d);
	sh.setImplicitWait(30);
	sh.findElementByXPath("//div[text()='All']").click();
	sh.findElementByXPath("//span[text()='Service Catalog']").click();
	//Click on  mobiles	
	WebElement framePath = sh.findElementByXPath("//iframe[@id='gsft_main']");
	d.switchTo().frame(framePath);
	d.findElement(By.xpath("//a[text()='Mobiles']")).click();
	
	//Select Apple iphone13pro
	d.findElement(By.xpath("(//a[@class='service_catalog'])[3]")).click();
	//Choose yes option in lost or broken iPhone
	d.findElement(By.xpath("(//span[@class='input-group-radio'])[1]")).click();
	//Enter phonenumber as 99 in original phonenumber field
	d.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
	//Select Unlimited from the dropdown in Monthly data allowance
	Select data=new Select(d.findElement(By.xpath("//select[@class='form-control cat_item_option ']")));	
	data.selectByVisibleText("Unlimited [add $4.00]");
	//Update color field to SierraBlue and storage field to 512GB
	d.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
	d.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
	//Click on Order now option
	d.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	//Verify order is placed and copy the request number
	String orderStatus = d.findElement(By.xpath("(//dl[@class='dl-horizontal sc-dl-horizontal']/dt)[1]")).getText();
	System.out.print("Order Status: "+orderStatus);
	System.out.println(d.findElement(By.xpath("(//dl[@class='dl-horizontal sc-dl-horizontal']/dd)[1]")).getText());
	System.out.println("Request number is:"+d.findElement(By.xpath("//a[@id='requesturl']/b")).getText());	
	//Take a Snapshot of order placed page	
	File screenshotAs = d.getScreenshotAs(OutputType.FILE);
	File destination=new File("./snapshot/005.png");	
	FileUtils.copyFile(screenshotAs, destination);
	

	}

}
