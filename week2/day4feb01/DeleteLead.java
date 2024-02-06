package myAssignments.week2.day4feb01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on the "Phone" tab.
		
		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();
		
		//Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(" ");
		
		//Click the "Find leads" button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        Thread.sleep(2000);
        
        //Enter the captured lead ID.
        String leadID=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
        System.out.println(leadID);
        
        //Click the first resulting lead.
       driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
       
       //Click the "Delete" button.
       driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
       
       //Click "Find leads" again.
       driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
       
       //Enter the captured lead ID.

       driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
       
       //Click the "Find leads" button.
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       
       Thread.sleep(2000);
       
       //Verify the presence of the message "No records to display" in the Lead List. This 
       //message confirms the successful deletion.
       String validation = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
       
       if(validation.contains("No records to display"))
       {
    	   System.out.println("The leadID is deleted and received NO records to display message");
        }
       else
    	   System.out.println("The leadID is not deleted and did not received NO records to display message");
    	  
       //Close the browser
       
       driver.close();
       
      
	}

}
