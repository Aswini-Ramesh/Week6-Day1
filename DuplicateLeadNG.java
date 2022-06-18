package Week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLeadNG extends BaseClass {
	@Test
	public void DuplicateLead() throws InterruptedException{
		driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		 driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		 System.out.println("The Title is" +driver.getTitle());
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).getText();
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys("Babu");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(1000);
		 if(driver.findElement(By.xpath("//div[@class='x-paging-info']")).isDisplayed())
		 {
			 
			 System.out.println("Displaying Duplicate Records");
		 }
		 else {
			 System.out.println("Displaying one records only");
			  }

		  
			}

		}
