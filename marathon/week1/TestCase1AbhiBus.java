package marathon.week1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		// TestCase1:Abhi Bus
		//Launch the chrome browser
		ChromeDriver d =new ChromeDriver();
		//Load the Url
		d.get("https://www.abhibus.com/");
		d.manage().window().maximize();
		// Add  implicitlyWait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		//Type "Chennai" in the FROM text box
		d.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("chennai");
		//Click the first option from the popup box
		d.findElement(By.xpath("//div[text()='Chennai']")).click();
		//Type "Bangalore" in the TO text box
		d.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		//Click the first option from the popup box
		d.findElement(By.xpath("//div[text()='Bangalore']")).click();
		//Click the'Tomorrow' button
		d.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		//Print the name of the first resulting bus (use .getText())
		String busList = d.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("Name of the first bus:"+busList);
		//Choose SLEEPER in the left menu from Bus Type
		d.findElement(By.xpath("//span[text()='Sleeper']")).click();
		//Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		WebElement busSeat = d.findElement(By.xpath("(//div[@class='text-grey']/small)[1]"));
		System.out.println(busSeat.getText());
		//Click Show Seats
		d.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		Thread.sleep(3000);
		//Choose any one Available seat
		d.findElement(By.xpath("//button[@class='seat sleeper']")).click();
		//Select the first resulting check box from the Boarding Point and Dropping Point
		d.findElement(By.xpath("(//div[@class='container checkbox-container  md ']//p)[1]")).click();
		d.findElement(By.xpath("(//div[@class='container checkbox-container  md ']//p)[1]")).click();
		//Print Seats Selected, Total Fare
		WebElement seatNum = d.findElement(By.xpath("//span[text()='Seat Selected :']"));
		WebElement busFare = d.findElement(By.xpath("//span[text()='Base Fare :']"));
		System.out.println(seatNum.getText()+busFare.getText());
		//Get the Title of the page(use .getTitle())
		System.out.println(d.getTitle());
		//Close the browser
		d.close();
		
	}

}
