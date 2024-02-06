package myAssignments.week2.day4feb01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Tata Consultancy Services");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Venkat");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Prabu");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Venkat P");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CSC");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Creating Lead");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sathyapriya52@gmail.com");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateOption=new Select(state);
		stateOption.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//CLEAR THE DESCRIPTION FIELD
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).sendKeys(Keys.CLEAR);
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edited the Lead");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		//GET THE TITLE OF THE PAGE
		String pageTitle=driver.getTitle();
		System.out.println("The title of the page is "+pageTitle);
		driver.close();
		
		}

}
