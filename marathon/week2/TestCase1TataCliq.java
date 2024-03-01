package marathon.week2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.Get;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class TestCase1TataCliq {

	//Marathon-2 Test case 1
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Disable the browser notification
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		// Initialize the browser
		ChromeDriver d=new ChromeDriver(option);
		//Load the url
		d.get("https://www.tatacliq.com/");
		//Maximize the window
		d.manage().window().maximize();
		//Add implicit wait to load all the webelements
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   //MouseHover on 'Brands'
		//WebElement brand = d.findElement(By.xpath("//div[@class='DesktopHeader__downArrow']/parent::div"));
		WebElement brand = d.findElement(By.xpath("//div[text()='Brands']"));
		Actions obj=new Actions(d);
		obj.moveToElement(brand).perform();
		// MouseHover on 'Watches & Accessories'
		WebElement watchesAndAcc = d.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		obj.moveToElement(watchesAndAcc).perform();
		//Choose the first option from the 'Featured brands'.
		d.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]")).click();
		// Select sortby: New Arrivals
		Thread.sleep(3000);
		Select obj1=new Select(d.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']")));
		obj1.selectByVisibleText("New Arrivals");
		//Choose men from catagories filter.
		d.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();
		//Print all price of watches
		Thread.sleep(3000);
		List<WebElement> priceOfWatches = d.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		List<String> price=new ArrayList<String>();
		System.out.println(priceOfWatches.size());
		System.out.println(" Price of watches:");
		
		for(int i=0;i<priceOfWatches.size();i++)
		{
		String price1=priceOfWatches.get(i).getText();
		System.out.println(price1);
		}
		String replaceAll1=priceOfWatches.get(0).getText().replaceAll("[^0-9]","");
		//System.out.println(replaceAll1);
		Thread.sleep(3000);
		String parentWindow = d.getWindowHandle();
		//System.out.println("ParentWindow: "+d.getCurrentUrl());
		//Click on the first resulting watch.
		Thread.sleep(3000);
	     d.findElement(By.xpath("(//div[@class='ProductModule__base'])[1]")).click();
		//Compare two price are similar
		Set<String> windowHandles = d.getWindowHandles();
		List<String> childWindow=new ArrayList<String>(windowHandles);
		d.switchTo().window(childWindow.get(1));
		//System.out.println(d.getCurrentUrl());
		Thread.sleep(3000);
		String price2 = d.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		//Use regular expression and remove special characters from price
			
		String replaceAll=price2.replaceAll("[^0-9]","");
		if(replaceAll.equals(replaceAll1))
		{
			System.out.println("Price is same");
		}
		else
			System.out.println("Price is not same");
	
	//Click Add to Bag and get count from the cart icon
		d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String count = d.findElement(By.xpath("//span[text()='1']")).getText();
		System.out.println("Count of item in bag:"+count);
		//Click on the cart
		d.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		//Take a snap of the resulting page. 
		File screenshotAs = d.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snapshot/004.png");
		
		FileUtils.copyFile(screenshotAs, destination);
		//Close all the opened windows one by one.
		System.out.println("Child Window:"+d.getTitle());
		d.close();
		d.switchTo().window(parentWindow);
		System.out.println("Parent Window:"+d.getTitle());
		d.close();
	}   
}
