package Week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLeadNG extends BaseClass {
	
	@Test
public void DeleteLead() throws InterruptedException {
	driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Find Leads")).click();
	 driver.findElement(By.xpath("//span[text()='Phone']")).click();
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	 driver.findElement(By.xpath("//a[text()='Delete']")).click();
	 driver.findElement(By.linkText("Find Leads")).click();
	 driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12605");
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 Thread.sleep(2000);
	 if(driver.findElement(By.className("x-paging-info")).isDisplayed()) {
			System.out.println("No Records to Display");
		}else {
			System.out.println("Records to Display");
		}
	 driver.close();
	 }
}
