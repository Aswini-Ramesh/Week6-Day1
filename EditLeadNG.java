package Week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLeadNG extends BaseClass {
	
	   @Test
public void EditLead() throws InterruptedException {
		   driver.findElement(By.linkText("Leads")).click();
			 driver.findElement(By.linkText("Find Leads")).click();
		     driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Babu");
		     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		     System.out.println("The Title is:" + driver.getTitle());
		     driver.findElement(By.xpath("//a[text()='Edit']")).click();
		     driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Live TestLeaf");
		     driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		     driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	   }

}
