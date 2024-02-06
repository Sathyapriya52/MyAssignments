package myAssignments.week2.day3Jan31;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		//Setup the driver and launch the browser
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		//Find the element and then enter the user name
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //Find the element and then enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //Find the element and the click Login
        driver.findElement(By.className("decorativeSubmit")).click();
        //click CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();
        //Find the element and click Accounts
        driver.findElement(By.linkText("Accounts")).click();
        //Find the element and click create account
        driver.findElement(By.linkText("Create Account")).click();
        //Find the element and enter the account name
        driver.findElement(By.id("accountName")).sendKeys("Kannan");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        //Select ""ComputerSoftware" as the industry"
        WebElement industry=driver.findElement(By.name("industryEnumId"));
        Select industryOption=new Select(industry);
        industryOption.selectByIndex(3);
        
        //Select "S-Corporation" as ownership using SelectByVisibleText.
        WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
        Select ownershipOption=new Select(ownership);
        ownershipOption.selectByVisibleText("S-Corporation");
    
        //Select "Employee" as the source using SelectByValue
        WebElement source=driver.findElement(By.id("dataSourceId"));
        Select sourceOption=new Select(source);
        sourceOption.selectByValue("LEAD_EMPLOYEE");
        		
        //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
        WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
        Select marketingOption=new Select(marketing);
        marketingOption.selectByIndex(6);
        
        //Select "Texas" as the state/province using SelectByValue.
        WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
        Select stateOption=new Select(state);
        stateOption.selectByValue("TX");
        
        //Click the "Create Account" button.
        driver.findElement(By.className("smallSubmit")).click();
        
        //// Verify that the account name is displayed correctly
        
    
       String account=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
       System.out.println(account);
       if(account.contains("Kannan"))
       { 
    	   System.out.println("Account name displayed is Valid- "+account);
       }
       else
       {
    	   System.out.println(" Account name displayed is not Valid"+account);
       }
	
   // close the browser window
	driver.close();
}
}
