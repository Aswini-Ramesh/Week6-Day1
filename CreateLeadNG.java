package Week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLeadNG extends BaseClass {
	
@Test
public void CreateLead() throws InterruptedException {
	driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aswini");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Production");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("Production is the significant part of organization ");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rameshsumathi003@gmail.com");
	 WebElement ele= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 
	 Select dd =new Select(ele);
	 dd.selectByVisibleText("New York");
	 driver.findElement(By.className("smallSubmit")).click();
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.id("updateLeadForm_description")).clear();
	 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Lead Created Sucessfully");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	 System.out.println("The Title is:" + driver.getTitle());
	 }


}
