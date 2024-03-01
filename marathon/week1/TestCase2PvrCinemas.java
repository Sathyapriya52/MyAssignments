package marathon.week1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase2PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TestCase2: PVR Cinemas
		//Launch the browser
		
		ChromeDriver d=new ChromeDriver();
		//Load the URL
		d.get("https://www.pvrcinemas.com/");
		//Maximize the window
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click  on Movie Library under the hamburger button
		d.findElement(By.xpath("//div[@class='nav-icon']")).click();
		d.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(3000);
		//Select the City -->Chennai
		WebElement city = d.findElement(By.xpath("//select[@name='city']"));
		Select cityList=new Select(city);
		System.out.println(cityList);
		cityList.selectByValue("Chennai");
		Thread.sleep(3000);
			//Select the Genre---> Animation
		WebElement genre = d.findElement(By.xpath("//select[@name='genre']"));
		Select genreList=new Select(genre);
		Thread.sleep(3000);
		genreList.selectByVisibleText("ANIMATION");
		//Select the Language--> English
		WebElement language = d.findElement(By.xpath("//select[@name='lang']"));
		Select languageList=new Select(language);
		languageList.selectByVisibleText("ENGLISH");
		//Click on Apply
		d.findElement(By.xpath("//button[text()='Apply']")).click();
		//Click on the first resulting animation movie
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		//Click Proceed to book
		d.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		 // Enter all fields  cinema, Name, date, preferred show time, no of seats, food and beverages, Email and Mobile
		WebElement cinema = d.findElement(By.id("cinemaName"));
		Select cinemaList=new Select(cinema);
		cinemaList.selectByValue("PVR Velachery Chennai");
		d.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		d.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
		WebElement timing = d.findElement(By.xpath("//select[@name='timings']"));
		Select timingList=new Select(timing);
		timingList.selectByValue("09:00 AM - 12:00 PM");
		d.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("3");
		d.findElement(By.xpath("//input[@name='name']")).sendKeys("Sathyapriya");
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("sathyapriya52@gmail.com");
		d.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8939658079");
		WebElement food = d.findElement(By.xpath("//select[@name='food']"));
		Select foodOption=new Select(food);
		foodOption.selectByValue("No");
		d.findElement(By.xpath("//input[@name='comment']")).sendKeys("Need Parking");
		// Click on copy to self 
		d.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		//Click on  Send Request
		d.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		// Click cancel 
		Thread.sleep(5000);
		d.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		// Close the OTP dialog
		d.findElement(By.xpath("//button[text()='×']")).click();
		//Verify the title of the page
	System.out.println(d.getTitle());
		
				
		
		
		
		
		
	}

}
